package com.driver.exception;
/**
* @Author:wx
* @Description:表单异常类
* @Date:11:25 2018\12\28 0028
*/
public class FormRepeatException extends RuntimeException {

    public FormRepeatException(String message){ super(message);}

    public FormRepeatException(String message, Throwable cause){ super(message, cause);}
}
