package com.actadi.common;

public enum ResponseCode {

    OK(200),
    NOT_FOUND(404),
    CONFLICT(409),
    BAD_REQUEST(401),
    PRECONDITION_FAILED(412);

    private ResponseCode(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.name();
    }
}
