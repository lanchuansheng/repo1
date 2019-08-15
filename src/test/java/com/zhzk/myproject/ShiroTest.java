package com.zhzk.myproject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroTest {
    public static void main(String[] args) {
        //1读取配置文件，初始化工厂对象
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
       //2获取SecurityManager实例
        SecurityManager securityManager = factory.getInstance();
        //3将SecurityMananger绑定到工具类
        SecurityUtils.setSecurityManager(securityManager);
        //4通过SecurityUtils得到当前登录用户
        Subject subject =SecurityUtils.getSubject();
        //
        UsernamePasswordToken usernamePasswordToken =new UsernamePasswordToken("zhangsann","1111");
        try {
            //登录并传入令牌token
            subject.login(usernamePasswordToken);
            System.out.println("登录成功");

        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("失败");
        }
        subject.logout();

    }
}
