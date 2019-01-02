package com.driver.entity;
/**
* @Author:wx
* @Description:心理测试实体
* @Date:10:00 2018\12\28 0028
*/
public class Psychological {
    private int id;
    private String title;//标题
    private String details;//详情
    private String url;//图片地址
    private String result;//测试结果
    private String option_a;//选项a
    private String option_b;//选项b
    private String option_c;//选项c
    private String option_d;//选项d
    private String option_title;//问题标题
    private int QuestionNum;//题数标识（第几题）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOption_a() {
        return option_a;
    }

    public void setOption_a(String option_a) {
        this.option_a = option_a;
    }

    public String getOption_b() {
        return option_b;
    }

    public void setOption_b(String option_b) {
        this.option_b = option_b;
    }

    public String getOption_c() {
        return option_c;
    }

    public void setOption_c(String option_c) {
        this.option_c = option_c;
    }

    public String getOption_d() {
        return option_d;
    }

    public void setOption_d(String option_d) {
        this.option_d = option_d;
    }

    public String getOption_title() {
        return option_title;
    }

    public void setOption_title(String option_title) {
        this.option_title = option_title;
    }

    public int getQuestionNum() {
        return QuestionNum;
    }

    public void setQuestionNum(int questionNum) {
        QuestionNum = questionNum;
    }

}
