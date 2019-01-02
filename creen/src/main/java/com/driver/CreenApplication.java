package com.driver;

import org.springframework.boot.SpringApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.driver.mapper") //扫描的mapper
        @SpringBootApplication
        public class CreenApplication {

            public static void main(String[] args) {
        SpringApplication.run(CreenApplication.class, args);

    }

}

