package com.yutong.debug.service;

import com.yutong.debug.controller.vo.UserVo;
import com.yutong.debug.dao.DebugUserDao;
import com.yutong.debug.dao.po.DebugUserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * @author liutao
 * @create 2018-01-22-21:02
 */
@Service
public class DebugUserService {
    @Autowired
    private DebugUserDao debugUserDao;

    public UserVo login(String username,String password){
        DebugUserDo debugUserDo = new DebugUserDo();
        debugUserDo.setUsername(username);
        debugUserDo.setPassword(password);
        debugUserDo = debugUserDao.selectOne(debugUserDo);
        if(debugUserDo!=null){
            UserVo userVo = new UserVo();
            userVo.setId(debugUserDo.getId());
            userVo.setUsername(debugUserDo.getUsername());
            userVo.setTelephoneNumber(debugUserDo.getPhoneNumber());
            return userVo;
        }
        return null;
    }



    public void register(UserVo userVo){
        DebugUserDo debugUserDo = new DebugUserDo();
        debugUserDo.setUsername(userVo.getUsername());
        debugUserDo.setPassword(userVo.getPassword());
        debugUserDo.setPhoneNumber(userVo.getTelephoneNumber());
        debugUserDo.setIdCard(userVo.getIdCard());
        debugUserDo.setUserLevel(Byte.parseByte("0"));
        debugUserDo.setCreateTime(new Date());
        debugUserDao.insertSelective(debugUserDo);
    }

    public void delete(DebugUserDo debugUserDo){
        Example example = new Example(DebugUserDo.class);
        example.createCriteria().andEqualTo("userState","0");
        debugUserDao.updateByExampleSelective(debugUserDo,example);
    }
}
