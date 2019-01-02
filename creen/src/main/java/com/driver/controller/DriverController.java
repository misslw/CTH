package com.driver.controller;
import com.driver.entity.Driver;
import com.driver.service.DriverService;
import com.driver.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.KeyCode.T;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService DriverS;
    /**
    * @Author:wx
    * @Description:获取车辆信息
    * @Date:18:18 2018\12\27 0027
    */
    @RequestMapping("/showDriver")
    @ResponseBody
    public Object  getDriverDetails(@PathParam("id") int id ){
        Driver driverDetails = DriverS.getDriverDetails(id);
        return  Result.success(driverDetails);
    }
}
