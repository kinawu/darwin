package com.redteamobile.darwin.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jcabi.aspects.Loggable;
import com.redteamobile.darwin.auth.MerchantAuth;
import com.redteamobile.darwin.model.entity.ImsiProfile;
import com.redteamobile.darwin.model.page.ResponseStruct;
import com.redteamobile.darwin.util.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import play.libs.Json;

import java.util.Optional;

@Component
public class BaseController {
    protected static final String SIGNATURE = "signature";

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerchantAuth merchantAuth;

    @Autowired
    protected MessageUtils messageUtils;

    public boolean isMerchantMatchProfile(int merchantId, ImsiProfile imsiProfile) {
        //waiting for hiYo and wesim update
        return (merchantId == imsiProfile.getMerchantId()) || merchantId == 1 || merchantId == 2;
    }

    @Loggable
    public Optional<JsonNode> checkAuth(String merchantCode, String method, JsonNode body, String sign) {
        logger.info("request with {} by method {} from merchant {}", body.toString(), method, merchantCode);
        if (!merchantAuth.auth(merchantCode, body, sign)) {
            logger.info("action with {} by method {}",
                    messageUtils.getMessage("MESSAGE_ERROR_WRONG_SIGNATURE"), method);
            return Optional.of(Json.newObject().put("success", false)
                    .put("errorCode", messageUtils.getMessage("MESSAGE_ERROR_WRONG_SIGNATURE")));
        }
        return Optional.ofNullable(null);
    }

    public <T extends ResponseStruct> T succ(T res) {
        res.setSuccess(true);
        return res;
    }

    public ResponseStruct succ(Object obj) {
        return ResponseStruct.build().setSuccess(true).setObj(obj);
    }

    public JsonNode succ(ObjectNode obj) {
        return Json.newObject().put("success", true).setAll(obj);
    }

    public JsonNode failed(String errorCode, Object ... params) {
//        return Json.newObject().put("success", false).put("errorCode", errorCode);
        ObjectNode node = Json.newObject();
        node.put("success", false);
        node.put("errorCode", errorCode);
        if (params != null && params.length > 0)
            node.put("errorMsg", String.format(messageUtils.getMessage(errorCode), params));
        else node.put("errorMsg", messageUtils.getMessage(errorCode));
        return node;
    }

    public JsonNode failedWithErrorCode(String errorCode) {
        return messageUtils.returnErrorCodeWithMessage(errorCode);
    }

    public ResponseStruct succ() {
        return ResponseStruct.build().setSuccess(true);
    }

}
