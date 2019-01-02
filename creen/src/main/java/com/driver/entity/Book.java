package com.driver.entity;
/**
* @Author:wx
* @Description:电子书实体类
* @Date:10:01 2018\12\28 0028
*/
public class Book {
    private int id;//主键id
    private String name;//名称
    private String details;//详情内容
    private String photo;//封面图片
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



}
