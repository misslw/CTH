package com.driver.service;

import com.driver.entity.Psychological;
import com.driver.mapper.PsychologyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsychologyService {
    @Autowired
    PsychologyMapper PsychologyMapper;
    /**
    * @Author:wx
    * @Description:查询心理结果集
    * @Date:17:21 2018\12\27 0027
    */
   public  Psychological getOptions(int id ){
        Psychological psychologicals = PsychologyMapper.getOptions(id);
        return  psychologicals;
    }
    /**
    * @Author:wx
    * @Description:根据id获取选项值
    * @Date:17:49 2018\12\27 0027
    */
    public  List<Psychological> getPsychological(){
        List<Psychological> psychologicals = PsychologyMapper.getPsychological();
        return  psychologicals;
    }
}
