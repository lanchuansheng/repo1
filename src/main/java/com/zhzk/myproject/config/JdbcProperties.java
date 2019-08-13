package com.zhzk.myproject.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "jdbc")
//@Data
//@Component
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;


}
