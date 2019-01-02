package com.driver.mapper;

import com.driver.entity.Driver;
import com.driver.entity.Shop;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverMapper {
    /**
    * @Author:wx
    * @Description:司机信息
    * @Date:10:01 2018\12\28 0028
    */
    Driver getDriverList(int id);
}
