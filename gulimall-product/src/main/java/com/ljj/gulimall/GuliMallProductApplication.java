package com.ljj.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ljj.gulimall.product.dao")
@SpringBootApplication
public class GuliMallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuliMallProductApplication.class,args);
    }
}

