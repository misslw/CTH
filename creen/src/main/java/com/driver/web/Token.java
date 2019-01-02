package com.driver.web;
import java.lang.annotation.*;

/**
* @Author:wx
* @Description:注解类 Token
* @Date:11:19 2018\12\28 0028
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface Token {
    //生成 Token 标志
    boolean  save() default false ;
    /**
    * @Author:wx
    * @Description:过期时间 TODO
    * @Date:14:06 2018\12\28 0028
    */
    boolean remove() default false;
}
