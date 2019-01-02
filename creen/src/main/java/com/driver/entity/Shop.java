package com.driver.entity;
/**
* @Author:wx
* @Description:商家实体
* @Date:10:00 2018\12\28 0028
*/
public class Shop {
    private int id ;//主键ID
    private String name;//商家名称
    private String province;//省
    private String city;//市
    private String county;//县（区，地级市）
    private String adrress;//详细地址
    private String longitude;//经度
    private String latitude;//纬度
    private String businessHour;//营业时间
    private String type;//商户类型（1.餐饮2.酒店3.景点）
    private String shop_id;//绑定的Lbs商户id
    public String getShop_id() {
        return shop_id;
    }
    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getBusinessHour() {
        return businessHour;
    }

    public void setBusinessHour(String businessHour) {
        this.businessHour = businessHour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
