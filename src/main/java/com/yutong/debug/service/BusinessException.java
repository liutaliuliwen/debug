package com.yutong.debug.service;

import lombok.Data;

/**
 * @author liutao
 * @create 2018-01-22-21:08
 */
@Data
public class BusinessException extends RuntimeException {
    private String rtnCode = "9999";
    private String rtnMsg;

    public BusinessException(String msg){
        super(msg);
        this.rtnMsg = msg;
    }

    public BusinessException(String code, String msg){
        super(msg);
        this.rtnMsg = msg;
        this.rtnCode = code;
    }



}
