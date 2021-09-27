package com.test.spring;

public class Response {
    int status;
    String msg;

    public Response(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
