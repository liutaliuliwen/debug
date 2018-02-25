package com.yutong.debug.controller;

import com.yutong.debug.controller.vo.UserVo;
import com.yutong.debug.dao.po.DebugUserDo;
import com.yutong.debug.service.DebugUserService;
import com.yutong.debug.service.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liutao
 * @create 2018-01-22-21:13
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("userInfo")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private DebugUserService debugUserService;

//    @RequestMapping(value = "/login/json", method = RequestMethod.POST)
//    @ResponseBody
//    public Response login(@RequestBody UserVo userVo){
//        boolean login = debugUserService.login(userVo.getUsername(), userVo.getPassword());
//        return dealLogin(login);
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView login(@RequestParam String username, @RequestParam String password, Model model) {
        UserVo userVo = debugUserService.login(username, password);
        ModelAndView modelAndView;
        if (userVo != null) {
            model.addAttribute("userInfo", userVo);
            modelAndView = new ModelAndView("login_success");
        } else {
            modelAndView = new ModelAndView("login_error");
        }
        return modelAndView;
    }

    // 用户登出动作
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Response register(UserVo userVo) {
        debugUserService.register(userVo);
        Response response = new Response();
        response.setRtnCode("9999");
        response.setRtnMsg("注册成功");
        return response;
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @ResponseBody
    public Response modify(@RequestParam String username, @RequestParam String password) {
        return null;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Response delete(@RequestParam String username) {
        DebugUserDo debugUserDo = new DebugUserDo();
        debugUserDo.setUsername(username);
        debugUserService.delete(debugUserDo);
        Response response = new Response();
        response.setRtnCode("9999");
        response.setRtnMsg("删除用户成功");
        return response;
    }


    private Response dealLogin(boolean login) {
        Response response = new Response();
        if (login) {
            response.setRtnCode("9999");
            response.setRtnMsg("登陆成功");
        } else {
            response.setRtnCode("1111");
            response.setRtnMsg("登陆失败");
        }
        return response;
    }

}
