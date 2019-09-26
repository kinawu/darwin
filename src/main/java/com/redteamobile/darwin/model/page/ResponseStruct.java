package com.redteamobile.darwin.model.page;

public class ResponseStruct implements java.io.Serializable {

    private static final long serialVersionUID = 3856547080362520800L;

    private String code;

    private String errorCode;

    private boolean success;

    private String msg = "";

    private Object obj = null;

    public static ResponseStruct build() {
        return new ResponseStruct();
    }

    @Override
    public String toString() {
        return "ResponseStruct [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
    }

    public String getCode() {
        return code;
    }

    public ResponseStruct setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseStruct setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ResponseStruct setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResponseStruct setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public ResponseStruct setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
