package com.driver.service;

import com.driver.entity.Consultation;
import com.driver.mapper.ConsultationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {
    @Autowired
    ConsultationMapper consultationMapper;
    /**
    * @Author:wx
    * @Description:显示所有资讯信息
    * @Date:10:03 2018\12\28 0028
    */
     public List<Consultation> getconsultation(){
         return  consultationMapper.getconsultation();
     }
     /**
     * @Author:wx
     * @Description:资讯详情
     * @Date:13:42 2019\1\2 0002
     */
     public Consultation getConDateils(String id ){
         return  consultationMapper.getConDateils(id);
     }
}
