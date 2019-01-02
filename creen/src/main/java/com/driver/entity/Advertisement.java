package com.driver.entity;

/**
* @Author:wx
* @Description:广告实体类
* @Date:10:01 2018\12\28 0028
*/
public class Advertisement {
    private int id ;
    private String photo;//封面图片
    private String content;//广告内容（图片或者视频路径）
    private String type;//广告类型（1.视屏2.文本3.图片）
    private String play_time;//播放时长
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlay_time() {
        return play_time;
    }

    public void setPlay_time(String play_time) {
        this.play_time = play_time;
    }
}
