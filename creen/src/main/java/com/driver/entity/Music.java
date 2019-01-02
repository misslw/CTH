package com.driver.entity;
/**
* @Author:wx
* @Description:音乐实体
* @Date:10:00 2018\12\28 0028
*/
public class Music {
    private int id ;
    private String name;//音乐名称
    private String author;//作者
    private String coverUrl;//封面
    private String content;//内容（存放的url）
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
