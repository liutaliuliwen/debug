package com.yutong.debug.service;

import com.yutong.debug.controller.vo.DebugDataVo;
import com.yutong.debug.controller.vo.UserVo;
import com.yutong.debug.dao.DebugDataDao;
import com.yutong.debug.dao.po.DebugDataDo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author liutao
 * @create 2018-02-15-14:27
 */
@Service
public class DebugDataService {
    @Autowired
    private DebugDataDao debugDataDao;

    public List<DebugDataDo> getAllDebugData(){
        return debugDataDao.selectAll();
    }

    public void saveDebugData(DebugDataVo debugDataVo,UserVo userVo){
        DebugDataDo debugDataDo = new DebugDataDo();
        BeanUtils.copyProperties(debugDataVo,debugDataDo);
        debugDataDo.setUploadTime(new Date());
        debugDataDo.setDebugUserId(userVo.getId());
        debugDataDo.setUploadUser(userVo.getUsername());
        debugDataDao.insertSelective(debugDataDo);
    }
}
