package com.driver.entity;
/*
司机实体类
 */
public class Driver {
    private int id ;
    private String name ;//车主姓名
    private String carNumber ;//车牌号
    private String phoneNumber ;//电话号码
    private String tripPlatform ;//出行方式
    private String driverLicense ;//行驶证
    private String carPhoto ;//车辆照片
    private String transportCertificate ;//运输证
    private String longitude ;//经度
    private String latitude ;// 纬度
    private String temperature ;//温度
    private String humidity ;//湿度
    private int coupon_id;//绑定的优惠券id
    public int getCoupon_id() {
        return coupon_id;
    }
    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
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

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTripPlatform() {
        return tripPlatform;
    }

    public void setTripPlatform(String tripPlatform) {
        this.tripPlatform = tripPlatform;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto;
    }

    public String getTransportCertificate() {
        return transportCertificate;
    }

    public void setTransportCertificate(String transportCertificate) {
        this.transportCertificate = transportCertificate;
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

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }





}
