package com.driver.service;
import com.driver.entity.Product;
import com.driver.entity.Shop;

import com.driver.mapper.ShopMapper;
import com.driver.tool.Variables;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopService {
    @Autowired
    ShopMapper shopMapper;
/**
* @Author:wx
* @Description:添加商家信息
* @Date:10:15 2018\12\29 0029
*/
   public  int createLBSParams( String shop_name, String province,  String city, String county,  String adrress,  String longitude,  String latitude,  String businessHour, String type,String shop_id ){
       return shopMapper.createLBSParams( shop_name,  province, city, county,  adrress, longitude,  latitude,  businessHour,type,shop_id);
   }

    /**
    * @Author:wx
    * @Description:商家详情产品列表
    * @Date:15:40 2018\12\29 0029
    */
   public  List<Product> getShopDetais(String  id){
        return shopMapper.getShopDetais(id);
    }
}
