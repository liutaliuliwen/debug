package com.yutong.debug.model;

/**
 * @author liutao
 * @create 2018-01-25-11:01
 */
public enum  ComputerState {
    OPEN(10),
    CLOSE(11),
    OFF_LINE(12),
    FAULT(200),
    UNKNOWN(255);

    private int code;
    ComputerState(int code){
        this.code = code;
    }
}
