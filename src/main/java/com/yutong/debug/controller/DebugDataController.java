package com.yutong.debug.controller;

import com.yutong.debug.controller.vo.DebugDataVo;
import com.yutong.debug.controller.vo.UserVo;
import com.yutong.debug.service.DebugDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liutao
 * @create 2018-02-14-22:46
 */
@Controller
@RequestMapping("/debug")
public class DebugDataController {
    private static final Logger logger = LoggerFactory.getLogger(DebugDataController.class);

    @Autowired
    private DebugDataService debugDataService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView upload(DebugDataVo debugDataVo, @ModelAttribute("userInfo")UserVo userVo){
        logger.info("用户信息 "+userVo);
        debugDataService.saveDebugData(debugDataVo, userVo);
        logger.info("干燥调试数据上传完成");
        ModelAndView modelAndView = new ModelAndView("upload_success");
        return modelAndView;
    }

}
