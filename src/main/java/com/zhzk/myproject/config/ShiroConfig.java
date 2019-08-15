package com.zhzk.myproject.config;


import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
     /*   filterMap.put("/add","authc");
        filterMap.put("/update","authc");*/
        //修改跳转的页面
        filterMap.put("","anon");
        filterMap.put("/*","authc");
        filterMap.put("/add","perms[user:add]");


        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuth");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }


    /**
     * 创建DefaultWebSecuritymanager 安全管理器
     *
     * */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
       DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
       //管理realm
       securityManager.setRealm(userRealm);
       return securityManager;
    }


    /**
     * 创建Realm  连接数据的桥梁
     *  自定义UserReaml
     * */
    @Bean(name = "userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    /**
     *  配置ShiroDialect，用于thymeleaf和shiro标签的配合使用
     * */
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
