package com.driver.entity;

import java.sql.Timestamp;
/**
* @Author:wx
* @Description:影视实体
* @Date:10:00 2018\12\28 0028
*/
public class Movie {

    private int id ;
    private String name;
    private String photo;//上传的图片url
    private String url;//服务器路径
    private Timestamp uploadTime;//上传时间
    private String type;//类型
    private String size;//大小
    private String lujing;//磁盘路径
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
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String getLujing() {
        return lujing;
    }

    public void setLujing(String lujing) {
        this.lujing = lujing;
    }


}
