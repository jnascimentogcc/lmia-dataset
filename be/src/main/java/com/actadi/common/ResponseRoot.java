package com.actadi.common;

public abstract class ResponseRoot {

    private Integer code;
    private String Message;

    public ResponseRoot() {
        setCode(ResponseCode.OK.getCode());
        setMessage(ResponseCode.OK.getMessage());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
