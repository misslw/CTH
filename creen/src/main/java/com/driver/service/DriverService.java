package com.driver.service;

import com.driver.entity.Driver;
import com.driver.mapper.DriverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    DriverMapper DriverMapper;
 /**
 * @Author:wx
 * @Description:获取司机信息
 * @Date:10:03 2018\12\28 0028
 */
    public Driver getDriverDetails( int id ) {
        return DriverMapper.getDriverList( id );
    }
}
