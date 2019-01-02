package com.driver.controller;
import com.driver.entity.Coupon;
import com.driver.mapper.CouponMapper;
import com.driver.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
* @Author:wx
* @Description:优惠券管理
* @Date:9:59 2018\12\28 0028
*/
@Controller
@RequestMapping("/coupon")
public class CouponCtroller {
    @Autowired
    CouponMapper couponMapper;
  /**
  * @Author:wx
  * @Description:优惠券列表
  * @Date:9:59 2018\12\28 0028
  */
  @ResponseBody
    @RequestMapping("/getCoupon")
     public Object getCouponList(){
         List<Coupon> coupon=couponMapper.getCouponList();
             return Result.success(coupon);
    }
}

