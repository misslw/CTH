package com.driver.service;

import com.driver.entity.Product;
import com.driver.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    /**
    * @Author:wx
    * @Description:产品列表
    * @Date:10:04 2018\12\28 0028
    */
    @Transactional
    public List<Product> getProduct(){
        return  productMapper.getProduct();
    }
    /**
    * @Author:wx
    * @Description:产品详情
    * @Date:14:05 2019\1\2 0002
    */
    public Product getProductDetails(int  id){
        Product productDetails = productMapper.getProductDetails(id);
        return  productDetails;

    }
}
