package com.provivi.likun.util;

import org.springframework.stereotype.Component;

public class CustomResponseBody {

    /**
     * success code 200
     * exception code 500
     */
    private static final Integer OK = 200;
    private static final Integer ERROR = 500;

    private Integer code;

    private String msg;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    public static CustomResponseBody success(Object object) {
        CustomResponseBody customResponseBody = new CustomResponseBody();
        customResponseBody.setCode(OK);
        customResponseBody.setMsg("success");
        customResponseBody.setData(object);
        return customResponseBody;
    }

    public static CustomResponseBody success() {
        return success(null);
    }

    public static CustomResponseBody error(Integer code, String errorMsg) {
        CustomResponseBody customResponseBody = new CustomResponseBody();
        customResponseBody.setCode(ERROR);
        customResponseBody.setMsg(errorMsg);
        return customResponseBody;
    }

    public static CustomResponseBody error(String errorMsg) {
        CustomResponseBody customResponseBody = new CustomResponseBody();
        customResponseBody.setCode(ERROR);
        customResponseBody.setMsg(errorMsg);
        return customResponseBody;
    }
}