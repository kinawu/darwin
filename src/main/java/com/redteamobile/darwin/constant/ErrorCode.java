package com.redteamobile.darwin.constant;

public class ErrorCode {
    /****** validation related error code, starting with 0 ******/
    // Token submitted with the body is invalid
    public final static String INVALID_TOKEN_SUBMITTED = "RT_ERROR_001";
    // No md5sum on header of request
    public final static String NO_SIGNATURE_FOUND_ON_HEADER = "RT_ERROR_002";
    // Failed on md5sum check
    public final static String FAILED_ON_SIGNATURE_CHECK = "RT_ERROR_003";
    // Missing fields in request body
    public final static String MISSING_FIELDS_IN_REQUEST = "RT_ERROR_004";
    // Missing initToken in request
    public final static String MISSING_TOKEN_IN_REQUEST = "RT_ERROR_005";
    // Failed on token check
    public final static String FAILED_ON_TOKEN_CHECK = "RT_ERROR_006";

    /***************************************************************/

    /****** device related error code, starting with 1 ******/

    // The given device id and token does not match what we have in database
    public final static String DEVICE_TOKEN_MISMATCH = "RT_ERROR_101";
    // The given device id does not exist in our database
    public final static String DEVICE_ID_NOT_RECOGNIZED = "RT_ERROR_102";

    /***************************************************************/

    /****** location related error code, starting with 2 ******/

    // The given agent is not assigned with any location
    public final static String NO_LOCATION_FOR_THIS_AGENT = "RT_ERROR_201";

    /***************************************************************/

    /****** data plan related error code, starting with 3 ******/

    // The data plan does not exist or is not in status active.
    public final static String DATA_PLAN_NOT_EXISTS = "RT_ERROR_301";
    // Does not find any data plan that is available to return
    public final static String NO_AVAILABLE_DATA_PLAN = "RT_ERROR_302";
    // Dataplan has no more inventory
    public final static String DATA_PLAN_HAS_NO_MORE_INVENTORY = "RT_ERROR_303";

    /***************************************************************/

    /****** order related error code, starting with 4 ******/

    // The given orderId not exist
    public final static String ORDER_NOT_EXIST = "RT_ERROR_401";
    // The given order's status is invalid
    public final static String INVALID_ORDER_STATUS = "RT_ERROR_402";
    // The given order's parameter is not valid
    public final static String PARAMETER_NOT_VALID = "RT_ERROR_403";

    /***************************************************************/

    /****** Web Serivce related error code, starting with 5 *********/

    // exception happened on web service
    public final static String EXCEPTION_ON_WEBSERVICE = "RT_ERROR_501";
    // success field is false on return
    public final static String WEBSERVIE_RETURN_FALSE = "RT_ERROR_502";

    /***************************************************************/

    /****** imsi related error code, starting with 6 ******/

    public final static String NO_AVAILABLE_IMSI = "RT_ERROR_601";
    public final static String FAILED_ON_ENCRYPTION = "RT_ERROR_602";
    public final static String IMSI_NOT_RECORDED = "RT_ERROR_603";

    /***************************************************************/

    /****** imsi management impl related error code, starting with 7 ******/

    public final static String NO_IMSI_TRANSACION_EXIST = "RT_ERROR_701";
    public final static String WRONG_IMSI_TRANSACTION = "RT_ERROR_702";
    public final static String NO_IMSI_PROFILE_EXIST = "RT_ERROR_703";
    public final static String OPERATOR_RETURN_FALSE = "RT_ERROR_704";
    public final static String IMSI_ALREADY_ACTIVATED = "RT_ERROR_705";
    public final static String INVALID_MERCHANT_CODE = "RT_ERROR_706";
    public final static String CANT_MODIFY_KEY = "RT_ERROR_707";
    public final static String MERCHANT_NOT_MATCH_PROFILE = "RT_ERROR_708";
    public final static String NO_ACTIVE_IMSI_TRANSACTION = "RT_ERROR_709";
    public final static String CAN_NOT_RECYCLE_IMSI_PROFILE = "RT_ERROR_712";
    public static final String UNKNOWN_ISSUE = "RT_ERROR_000";
    public static final String BUNDLE_NOT_AS_EXPECTED = "RT_ERROR_714";

    public static final String CARRIER_NOT_SUPPORT = "RT_ERROR_801";
    public static final String DUPLICATE_ACTIVATE_IMSI = "RT_ERROR_802";
    public static final String MAX_ACCOUNT_IN_CARRIER = "RT_ERROR_803";
    public static final String MISSING_PARAMETERS = "RT_ERROR_804";
    public static final String NO_ACTIVATE_IMSI = "RT_ERROR_805";
    public static final String REGISTER_ACCOUNT_ERROR = "RT_ERROR_806";
    public final static String IMSI_NOT_ALLOCATED = "RT_ERROR_807";
    /***************************************************************/

    /****** ESIM related error code, starting with 9 ******/

    public final static String ADD_PROFILE_FAILED = "RT_ERROR_901";
    public final static String DOWNLOAD_ORDER_FAILED = "RT_ERROR_902";
    public final static String CANCEL_ORDER_FAILED = "RT_ERROR_903";
    public final static String APPLY_AC_FAILED = "RT_ERROR_904";
    public final static String DELETE_PROFILE_FAILED = "RT_ERROR_905";

    /***************************************************************/

}
