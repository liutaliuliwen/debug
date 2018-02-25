package com.yutong.debug.service;

import lombok.Data;

/**
 * @author liutao
 * @create 2018-01-22-21:17
 */
@Data
public class Response<T> {
    private String rtnCode;
    private String rtnMsg;
    private T rtnData;

    public Response(){

    }
    public Response(T rtnData) {
        this.rtnData = rtnData;
    }

    public Response(T rtnData, String rtnCode, String rtnMsg) {
        this.rtnData = rtnData;
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
    }

    public Response(T rtnData, String rtnCode) {
        this.rtnData = rtnData;
        this.rtnCode = rtnCode;
    }
}
