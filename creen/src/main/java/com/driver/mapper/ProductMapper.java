package com.driver.mapper;

import com.driver.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    /**
    * @Author:wx
    * @Description:产品列表
    * @Date:10:02 2018\12\28 0028
    */
    List<Product> getProduct( );
    /**
    * @Author:wx
    * @Description:产品详情
    * @Date:14:02 2019\1\2 0002
    */
    Product getProductDetails(int id);
}
