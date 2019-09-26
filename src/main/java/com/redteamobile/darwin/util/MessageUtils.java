package com.redteamobile.darwin.util;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.redteamobile.darwin.i18.LocaleMessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import play.libs.Json;

@Service
public class MessageUtils {
    @Autowired
    protected LocaleMessageSource localeMessageSource;

    // error message
    public String getMessage(String key) {
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_LOGOUT")) {
            return localeMessageSource.getMessage("message.error.logout");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ENCRYPTION")) {
            return localeMessageSource.getMessage("message.error.encryption");
        } // "KI加密出错";

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DEVICE_REGISTER")) {
            return localeMessageSource.getMessage("message.error.device.register");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DEVICE_NOT_REGISTER")) {
            return localeMessageSource.getMessage("message.error.device.notRegister");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PARAM_INVALID")) {
            return localeMessageSource.getMessage("message.error.param.invalid");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PARAM_TOKEN_MISSING")) {
            return localeMessageSource.getMessage("message.error.param.tokenMissing");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PARAM_INVALID_TOKEN")) {
            return localeMessageSource.getMessage("message.error.param.invalidToken");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PARAM_MD5SUM_CHECK")) {
            return localeMessageSource.getMessage("message.error.param.md5sumCheck");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PARAM_FIELDS_MISSING")) {
            return localeMessageSource.getMessage("message.error.param.fieldsMissing");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PRODUCT_BUY")) {
            return localeMessageSource.getMessage("message.error.product.buy");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PRODUCT_RETURN")) {
            return localeMessageSource.getMessage("message.error.product.return");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PRODUCT_ACTIVATE")) {
            return localeMessageSource.getMessage("message.error.product.activate");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_PRODUCT_DEACTIVATE")) {
            return localeMessageSource.getMessage("message.error.product.deactivate");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_IMSI_NO_AVAILABLE")) {
            return localeMessageSource.getMessage("message.error.imsi.noAvailable");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_IMSI_ALLOCATION")) {
            return localeMessageSource.getMessage("message.error.imsi.allocation");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_NOT_EXIST")) {
            return localeMessageSource.getMessage("message.error.order.notExist");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_INVALID_STATE")) {
            return localeMessageSource.getMessage("message.error.order.invalidState");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_CANT_RETURN")) {
            return localeMessageSource.getMessage("message.error.order.cantReturn");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_INFO_NOTMATCH")) {
            return localeMessageSource.getMessage("message.error.order.infoNotMatch");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_EXCEPTION")) {
            return localeMessageSource.getMessage("message.error.order.exception");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_ORDER_NONE_TO_SAVE")) {
            return localeMessageSource.getMessage("message.error.order.noneToSave");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATAPLAN_NOT_EXIST")) {
            return localeMessageSource.getMessage("message.error.dataPlan.notExist");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATAPLAN_INVALID_STATE")) {
            return localeMessageSource.getMessage("message.error.dataPlan.invalidState");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATAPLAN_NOT_ACTIVATE")) {
            return localeMessageSource.getMessage("message.error.dataPlan.notActivate");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATAPLAN_NO_AVAILABLE")) {
            return localeMessageSource.getMessage("message.error.dataPlan.noAvailable");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_RESELLER_NOT_SUPPORT")) {
            return localeMessageSource.getMessage("message.error.reseller.notSupport");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_LOCATION_NOT_SUPPORT")) {
            return localeMessageSource.getMessage("message.error.location.notSupport");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_LOCATION_FETCH")) {
            return localeMessageSource.getMessage("message.error.location.fetch");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_LOCATION_NO_DATAPLAN")) {
            return localeMessageSource.getMessage("message.error.location.noDataPlan");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_NETWORK_TIME_OUT")) {
            return localeMessageSource.getMessage("message.error.network.timeout");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_NETWORK_CONNECT")) {
            return localeMessageSource.getMessage("message.error.network.connect");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_XIAOMI_FAIL_NOTIFICATION")) {
            return localeMessageSource.getMessage("message.xiaomi.fail.notification");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATABASE")) {
            return localeMessageSource.getMessage("message.error.database");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_DATABASE_QUERY")) {
            return localeMessageSource.getMessage("message.error.database.query");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_TYPE")) {
            return localeMessageSource.getMessage("message.error.file.type");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_NOT_EXIST")) {
            return localeMessageSource.getMessage("message.error.file.notExist");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_FORMAT")) {
            return localeMessageSource.getMessage("message.error.file.format");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_FETCH_LIST")) {
            return localeMessageSource.getMessage("message.error.file.fetchList");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_IMPORT")) {
            return localeMessageSource.getMessage("message.error.file.import");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_FILE_EXPORT")) {
            return localeMessageSource.getMessage("message.error.file.export");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_AMOUNT_NOT_AS_EXPECTED")) {
            return localeMessageSource.getMessage("message.error.amount");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_WRONG_SIGNATURE")) {
            return localeMessageSource.getMessage("message.error.wrong.signature");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_NO_EXIST_BUNDLE")) {
            return localeMessageSource.getMessage("message.error.bundle.not.exist");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_NO_EXIST_IMSI_PROFILE")) {
            return localeMessageSource.getMessage("message.error.imsi.profile.not.exist");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_OPERATOR_RETURNS_FALSE")) {
            return localeMessageSource.getMessage("message.error.operator.returns.false");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_NO_ACTIVATED_TRANSACTION")) {
            return localeMessageSource.getMessage("message.error.no.activated.transaction");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_ERROR_CARD_NOT_EXIST")) {
            return localeMessageSource.getMessage("message.error.card.not.exist");
        }

        // success message
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT_BUY")) {
            return localeMessageSource.getMessage("message.success.product.buy");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT_RETURN")) {
            return localeMessageSource.getMessage("message.success.product.return");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT_REPORT")) {
            return localeMessageSource.getMessage("message.success.product.report");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT_ACTIVATE")) {
            return localeMessageSource.getMessage("message.success.product.activate");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT_DEACTIVE")) {
            return localeMessageSource.getMessage("message.success.product.deactive");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_PRODUCT")) {
            return localeMessageSource.getMessage("message.success.product");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_DATABASE_QUERY")) {
            return localeMessageSource.getMessage("message.success.database.query");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_DATABASE_IMPORT")) {
            return localeMessageSource.getMessage("message.success.database.import");
        }

        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_FILE_DOWNLOAD")) {
            return localeMessageSource.getMessage("message.success.file.download");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_FILE_UPLOAD")) {
            return localeMessageSource.getMessage("message.success.file.upload");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_FILE_EXPORT")) {
            return localeMessageSource.getMessage("message.success.file.export");
        }
        if (EqualsUtils.stringEquals(key, "MESSAGE_SUCCESS_NO_RECORD")) {
            return localeMessageSource.getMessage("message.success.noRecord");
        }

        // date
        if (EqualsUtils.stringEquals(key, "DATA_YEAR")) {
            return localeMessageSource.getMessage("date.year");
        }
        if (EqualsUtils.stringEquals(key, "DATE_YESRS")) {
            return localeMessageSource.getMessage("date.years");
        }
        if (EqualsUtils.stringEquals(key, "DATE_MONTH")) {
            return localeMessageSource.getMessage("date.month");
        }
        if (EqualsUtils.stringEquals(key, "DATE_MONTHS")) {
            return localeMessageSource.getMessage("date.months");
        }
        if (EqualsUtils.stringEquals(key, "DATE_DAY")) {
            return localeMessageSource.getMessage("date.day");
        }
        if (EqualsUtils.stringEquals(key, "DATE_DAYS")) {
            return localeMessageSource.getMessage("date.days");
        }
        if (EqualsUtils.stringEquals(key, "DATE_HOUR")) {
            return localeMessageSource.getMessage("date.hour");
        }
        if (EqualsUtils.stringEquals(key, "DATE_HOURS")) {
            return localeMessageSource.getMessage("date.hours");
        }
        if (EqualsUtils.stringEquals(key, "DATE_MINUTE")) {
            return localeMessageSource.getMessage("date.minute");
        }
        if (EqualsUtils.stringEquals(key, "DATE_MINUTES")) {
            return localeMessageSource.getMessage("date.minutes");
        }
        if (EqualsUtils.stringEquals(key, "DATE_SECOND")) {
            return localeMessageSource.getMessage("date.second");
        }
        if (EqualsUtils.stringEquals(key, "DATE_SECONDS")) {
            return localeMessageSource.getMessage("date.seconds");
        }
        return localeMessageSource.getMessage("message.error.unknown");
    }
    // error ObjectNode message
    public ObjectNode messageErrorProductBuy() {
        return returnFalseWithMessage("MESSAGE_ERROR_PRODUCT_BUY");
    }

    public  ObjectNode messageErrorProductReturn() {
        return returnFalseWithMessage("MESSAGE_ERROR_PRODUCT_RETURN");
    }

    public  ObjectNode messageErrorProductActivate() {
        return returnFalseWithMessage("MESSAGE_ERROR_PRODUCT_ACTIVATE");
    }

    public  ObjectNode messageErrorProductDeactivate() {
        return returnFalseWithMessage("MESSAGE_ERROR_PRODUCT_DEACTIVATE");
    }

    public  ObjectNode messageErrorDatabaseQuery() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATABASE_QUERY");
    }

    public  ObjectNode messageErrorLogout() {
        return returnFalseWithMessage("MESSAGE_ERROR_LOGOUT");
    }

    public  ObjectNode messageErrorParamInvalid() {
        return returnFalseWithMessage("MESSAGE_ERROR_PARAM_INVALID");
    }

    public  ObjectNode messageErrorParamTokenMissing() {
        return returnFalseWithMessage("MESSAGE_ERROR_PARAM_TOKEN_MISSING");
    }

    public  ObjectNode messageErrorParamInvalidToken() {
        return returnFalseWithMessage("MESSAGE_ERROR_PARAM_INVALID_TOKEN");
    }

    public  ObjectNode messageErrorParamMd5sumCheck() {
        return returnFalseWithMessage("MESSAGE_ERROR_PARAM_MD5SUM_CHECK");
    }

    public  ObjectNode messageErrorEncryption() {
        return returnFalseWithMessage("MESSAGE_ERROR_ENCRYPTION");
    }

    public  ObjectNode messageErrorImsiNoAvailable() {
        return returnFalseWithMessage("MESSAGE_ERROR_IMSI_NO_AVAILABLE");
    }

    public  ObjectNode messageErrorImsiAllocation() {
        return returnFalseWithMessage("MESSAGE_ERROR_IMSI_ALLOCATION");
    }

    public  ObjectNode messageErrorDatabase() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATABASE");
    }

    public  ObjectNode messageErrorOrderInvalidState() {
        return returnFalseWithMessage("MESSAGE_ERROR_ORDER_INVALID_STATE");
    }

    public  ObjectNode messageErrorOrderNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_ORDER_NOT_EXIST");
    }

    public  ObjectNode messageErrorOrderCantReturn() {
        return returnFalseWithMessage("MESSAGE_ERROR_ORDER_CANT_RETURN");
    }

    public  ObjectNode messageErrorOrderNoneToSave() {
        return returnFalseWithMessage("MESSAGE_ERROR_ORDER_NONE_TO_SAVE");
    }

    public  ObjectNode messageOrderInfoNotMatch() {
        return returnFalseWithMessage("MESSAGE_ERROR_ORDER_INFO_NOTMATCH");
    }

    public  ObjectNode messageErrorDataPlanNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATAPLAN_NOT_EXIST");
    }

    public  ObjectNode messageErrorDataPlanInvalidState() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATAPLAN_INVALID_STATE");
    }

    public  ObjectNode messageErrorDataPlanNotActivate() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATAPLAN_NOT_ACTIVATE");
    }

    public  ObjectNode messageErrorDataPlanNoAvailable() {
        return returnFalseWithMessage("MESSAGE_ERROR_DATAPLAN_NO_AVAILABLE");
    }

    public  ObjectNode messageErrorNetworkConnect() {
        return returnFalseWithMessage("MESSAGE_ERROR_NETWORK_CONNECT");
    }

    public  ObjectNode messageErrorFileNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_FILE_NOT_EXIST");
    }

    public  ObjectNode messageErrorFileType() {
        return returnFalseWithMessage("MESSAGE_ERROR_FILE_TYPE");
    }

    public  ObjectNode messageErrorFileFetchList() {
        return returnFalseWithMessage("MESSAGE_ERROR_FILE_FETCH_LIST");
    }

    public  ObjectNode messageErrorAmountNotAsExpected() {
        return returnFalseWithMessage("MESSAGE_ERROR_AMOUNT_NOT_AS_EXPECTED");
    }

    public  ObjectNode messageErrorWrongSignature() {
        return returnFalseWithMessage("MESSAGE_ERROR_WRONG_SIGNATURE");
    }

    public  ObjectNode messageErrorBundleNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_NO_EXIST_BUNDLE");
    }

    public  ObjectNode messageErrorImsiProfileNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_NO_EXIST_IMSI_PROFILE");
    }

    public  ObjectNode messageErrorOperatorReturnFalse() {
        return returnFalseWithMessage("MESSAGE_ERROR_OPERATOR_RETURNS_FALSE");
    }

    public  ObjectNode messageErrorNoActivatedTransaction() {
        return returnFalseWithMessage("MESSAGE_ERROR_NO_ACTIVATED_TRANSACTION");
    }

    public  ObjectNode messageErrorParamFieldsMissing(final String fields) {
        String errorInfo = String.format("MESSAGE_ERROR_PARAM_FIELDS_MISSING, fields");
        return returnFalseWithMessage(errorInfo);
    }

    public  ObjectNode messageErrorFileImport(String filename) {
        String error = String.format("MESSAGE_ERROR_FILE_IMPORT, filename");
        return returnFalseWithMessage(error);
    }

    public  ObjectNode messageErrorFileExport(String filename) {
        String error = String.format("MESSAGE_ERROR_FILE_EXPORT, filename");
        return returnFalseWithMessage(error);
    }

    public  ObjectNode messageErrorLocationNotSupported() {
        return returnFalseWithMessage("MESSAGE_ERROR_LOCATION_NOT_SUPPORT");
    }

    public  ObjectNode messageErrorLocationNoDataplan() {
        return returnFalseWithMessage("MESSAGE_ERROR_LOCATION_NO_DATAPLAN");
    }

    public  ObjectNode messageErrorCardNotExist() {
        return returnFalseWithMessage("MESSAGE_ERROR_CARD_NOT_EXIST");
    }

    public  ObjectNode returnErrorCodeWithMessage(final String code) {
        ObjectNode node = Json.newObject();
        node.put("success", false);
        node.put("errorCode", code);
        node.put("errorMsg", localeMessageSource.getMessage(code));
        return node;
    }

    private  ObjectNode returnFalseWithMessage(final String message) {
        ObjectNode node = Json.newObject();
        node.put("success", false);
        node.put("message", this.getMessage(message));
        return node;
    }
}
