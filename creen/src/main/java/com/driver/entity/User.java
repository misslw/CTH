package com.driver.entity;
/**
* @Author:wx
* @Description:优惠券实体
* @Date:11:36 2018\12\26 0026
*/
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private int coupon_id;//优惠券ID
    public int getCoupon_id() {
        return coupon_id;
    }
    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';

    }
}
