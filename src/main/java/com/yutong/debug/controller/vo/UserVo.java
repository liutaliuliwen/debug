package com.yutong.debug.controller.vo;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liutao
 * @create 2018-01-22-22:11
 */
@Data
public class UserVo {
    private int id;
    private String username;
    private String password;
    private String telephoneNumber;
    private String idCard;
}
