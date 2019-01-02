package com.driver.service;

import com.driver.entity.Coupon;
import com.driver.mapper.CouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {
    @Autowired
    CouponMapper couponMapper;
    /**
    * @Author:wx
    * @Description:显示优惠券列表
    * @Date:10:03 2018\12\28 0028
    */
    public List<Coupon> getCoupon(){
        return couponMapper.getCouponList();
    }
}

