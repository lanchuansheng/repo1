package com.zhzk.myproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan(basePackages = {"com.zhzk.myproject.mapper.**"})
public class MyprojectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyprojectApplication.class);
    }


    public static void main(String[] args) {

        SpringApplication.run(MyprojectApplication.class, args);
    }
    public void hello(){
    }

}
