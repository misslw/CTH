package com.driver.mapper;

import com.driver.entity.Coupon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponMapper {
    /**
    * @Author:wx
    * @Description:显示优惠券
    * @Date:10:01 2018\12\28 0028
    */
    List<Coupon> getCouponList();

}
