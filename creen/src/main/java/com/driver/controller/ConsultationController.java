package com.driver.controller;

import com.driver.entity.Consultation;
import com.driver.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {
    @Autowired
    ConsultationService consultationService;
   /**
   * @Author:wx
   * @Description: 显示资讯列表
   * @Date:9:59 2018\12\28 0028
   */
    @RequestMapping("/showConsultation")
    public  List<Consultation> getconsultation(){
        List<Consultation> consultation=consultationService.getconsultation();
        return consultation;

    }
    /**
    * @Author:wx
    * @Description:资讯详情
    * @Date:13:42 2019\1\2 0002
    */
    @RequestMapping("/getConDetails")
    public Consultation getConDetails(@PathParam("id")String id ){
        Consultation conDateils = consultationService.getConDateils(id);
        return  conDateils;

    }
}
