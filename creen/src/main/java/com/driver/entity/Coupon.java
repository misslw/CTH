package com.driver.entity;
/**
* @Author:wx
* @Description:优惠券实体
* @Date:10:01 2018\12\28 0028
*/
public class Coupon {
    private int id ;
    private String name ;//优惠券名称
    private String price;//优惠券价格
    private String details;//价格使用说明
    private String tips;//使用说明
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }


}
