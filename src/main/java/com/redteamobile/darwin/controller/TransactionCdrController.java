package com.redteamobile.darwin.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Strings;
import com.jcabi.aspects.Loggable;
import com.redteamobile.darwin.constant.ErrorCode;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.darwin.model.entity.ImsiTransaction;
import com.redteamobile.darwin.model.entity.Merchant;
import com.redteamobile.darwin.service.BundleService;
import com.redteamobile.darwin.service.ImsiProfileService;
import com.redteamobile.darwin.service.ImsiTransactionService;
import com.redteamobile.darwin.service.MerchantService;
import com.redteamobile.darwin.service.TransactionService;
import com.redteamobile.darwin.util.JsonNodeUtils;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cdr")
public class TransactionCdrController extends BaseController {
    private static final String GET_USAGE = "GET_USAGE";

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private MerchantService merchantService;
    @Autowired
    private ImsiTransactionService imsiTransactionService;

    @Autowired
    private ImsiProfileService imsiProfileService;

    @RequestMapping(value = "/getUsage/{merchantCode}", method = RequestMethod.POST)
    @Loggable
    public JsonNode getUsageV1(@ApiParam(required = true) @PathVariable String merchantCode,
                               @ApiParam(required = true,
                                       value = "{\"metadata\":\n{\"signType\":\"SHA1\",\n\"timestamp\":,\n\"accessKey\":\"\"},\n\"content\":{\"imsi\":\"\",\n\"transactionId\":1}}")
                               @RequestBody JsonNode body,
                               @RequestHeader(SIGNATURE) String sign) throws Exception {

        Optional<JsonNode> op = checkAuth(merchantCode, GET_USAGE, body, sign);
        if (op.isPresent()) return op.get();
        JsonNode content = body.get("content");
        if (content == null)
            return failed(("MESSAGE_ERROR_PARAM_FIELDS_MISSING"));

        String imsi = JsonNodeUtils.getOrElse(content, "imsi", "");
        String transactionCode = JsonNodeUtils.getOrElse(content, "transactionId", "");

        if (Strings.isNullOrEmpty(imsi) || Strings.isNullOrEmpty(transactionCode)) {
            logger.error("parameter error");
            return failed(("MESSAGE_ERROR_PARAM_INVALID"));
        }

        Merchant merchant = merchantService.getMerchantByCode(merchantCode);
        if (merchant == null) {
            return messageUtils.returnErrorCodeWithMessage(ErrorCode.INVALID_MERCHANT_CODE);
        }
        ImsiProfile imsiProfile = imsiProfileService.queryImsiProfileByImsi(imsi);
        if (imsiProfile == null) {
            return messageUtils.returnErrorCodeWithMessage(ErrorCode.NO_IMSI_PROFILE_EXIST);
        }
        if (!isMerchantMatchProfile(merchant.getId(), imsiProfile)) {
            return messageUtils
                    .returnErrorCodeWithMessage(ErrorCode.MERCHANT_NOT_MATCH_PROFILE);
        }
        ImsiTransaction transaction =
                imsiTransactionService.queryTransactionByCode(transactionCode);
        if (transaction == null) {
            return messageUtils.returnErrorCodeWithMessage(ErrorCode.NO_IMSI_TRANSACION_EXIST);
        }

        ObjectNode result = transactionService.getDailyUsage(imsiProfile, transaction);
        logger.info("request get usage of resource {} for {} and response is {}", imsi,
                merchantCode, result);
        return result;
    }

}
