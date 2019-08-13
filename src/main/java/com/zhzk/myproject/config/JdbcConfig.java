package com.zhzk.myproject.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcConfig.class)
public class JdbcConfig {
    @Bean
    public DataSource dataSource(JdbcProperties prop){
        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/yzb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
/*          dataSource.setDriverClassName(prop.getDriverClassName());
          dataSource.setUrl(prop.getUrl());
          dataSource.setUsername(prop.getUsername());
          dataSource.setPassword(prop.getPassword());*/


        return dataSource;
    }

}
