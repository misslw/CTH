package com.driver.controller;

import com.driver.entity.Product;
import com.driver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/find")
public class ProductController {
    @Autowired
    ProductService productService;
    /**
     * @Author:wx
     * @Description:产品列表
     * @Date:13:48 2019\1\2 0002
     */
    @RequestMapping("/product")
    public    List<Product>  grtProduct( ){
         List<Product> product = productService.getProduct();

        return product;

    }
    /**
    * @Author:wx
    * @Description:产品详情
    * @Date:14:06 2019\1\2 0002
    */
    @RequestMapping(value = "/getProductDetails",method = RequestMethod.GET)
    public Product getProductDetails(int id ){
        Product productDetails = productService.getProductDetails(id);
        return  productDetails;
    }
}

