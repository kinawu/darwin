package com.redteamobile.darwin.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.redteamobile.darwin.config.CustomResource;
import com.redteamobile.darwin.util.ChecksumUtils;
import com.redteamobile.darwin.util.DateUtils;
import com.redteamobile.darwin.util.JsonNodeUtils;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public abstract class Authenticator {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomResource customResource;

    private static final ImmutableList<String> SUPPORTED_SIGN_TYPES =
            ImmutableList.<String>of("SHA1");
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_ACCESS_KEY = "accessKey";
    private static final String FIELD_SIGN_TYPE = "signType";
    private static final String FIELD_TIMESTAMP = "timestamp";

    protected abstract Map<String, String> getKeyPairs(String code);

    public boolean auth(String code, JsonNode node, String signature) {
        if (node == null) return false;
        logger.debug("Request body is {}", node);
        return isWithinValidRequestTime(node) && isSupportedSignType(node)
                && isValidSignature(code, node, signature);
    }

    private boolean hasMetadataField(JsonNode root) {
        logger.debug("Request has metadata ?: {}", root.get(FIELD_METADATA) != null);
        return root.get(FIELD_METADATA) != null;
    }

    private boolean isValidSignature(String code, JsonNode node, String signature) {
        if (!hasMetadataField(node) || Strings.isNullOrEmpty(signature)) {
            logger.error("Invalid signature for request body {}, signature is {}", node, signature);
            return false;
        }

        String accessKey =
                JsonNodeUtils.getOrElse(node.get(FIELD_METADATA), FIELD_ACCESS_KEY, null);
        Map<String, String> validKeyMap = getKeyPairs(code);
        logger.debug("key pairs for code {} is : {} ", code, validKeyMap);
        if (Strings.isNullOrEmpty(accessKey) || !validKeyMap.containsKey(accessKey)) return false;
        String secretKey = validKeyMap.get(accessKey);
        String strToSign = ChecksumUtils.MD5(node.toString()).concat(secretKey);
        String actualSign = ChecksumUtils.SHA1(strToSign);
        logger.debug("Signature compare expected {} vs actual {}", signature, actualSign);
        return signature.equals(actualSign);
    }

    private boolean isSupportedSignType(JsonNode root) {
        if (!hasMetadataField(root)) {
            return false;
        }

        String signType = JsonNodeUtils.getOrElse(root.get(FIELD_METADATA), FIELD_SIGN_TYPE, null);

        logger.debug("Sign type is {} from request {}", signType, root);
        return !Strings.isNullOrEmpty(signType) && SUPPORTED_SIGN_TYPES.contains(signType);
    }

    private boolean isWithinValidRequestTime(JsonNode root) {
        if (!hasMetadataField(root)) {
            return false;
        }

        long timestamp = JsonNodeUtils.getOrElse(root.get(FIELD_METADATA), FIELD_TIMESTAMP, -1L);

        if (timestamp == -1) {
            logger.error("There was no timestamp given in the request body");
            return false;
        }

        DateTime now = DateUtils.getCurrentDateTime();
        DateTime requestTime = DateUtils.getDateTime(timestamp);
        Seconds seconds = Seconds.secondsBetween(requestTime, now);

        logger.debug("Current time {} vs request time {}, seconds in between is {}", now,
                requestTime, seconds.getSeconds());
        logger.debug("now timestamp is: {}", DateUtils.getMillis(now.toDate()));
        return Math.abs(seconds.getSeconds()) < customResource.getAuthRequestTime();
    }
}
