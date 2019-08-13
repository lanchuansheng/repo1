package com.zhzk.myproject.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.channels.NonWritableChannelException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author
 * @create 2019-08-02-17:18
 */
@Configuration
public class ShiroConfig {
    /**
     * 创建ShiroFilterFactoryBean
     *
     * */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //添加Shiro内置过滤器
        Map<String,String> filterMap = new LinkedHashMap<>();
        filterMap.put("/add","authc");
        filterMap.put("/update","authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }


    /**
     * 创建DefaultWebSecuritymanager
     *
     * */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
       DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
       securityManager.setRealm(userRealm);
       return securityManager;
    }


    /**
     * 创建Realm
     *
     * */
    @Bean(value = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }
}
