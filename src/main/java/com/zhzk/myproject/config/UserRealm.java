package com.zhzk.myproject.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author
 * @create 2019-08-02-17:22
 */
public class UserRealm extends AuthorizingRealm {
    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权逻辑");
        //给资源进行授权
        SimpleAuthorizationInfo info =new SimpleAuthorizationInfo();
        //添加资源的授权字符串
        info.addStringPermission("user:add");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行授权逻辑");

        String name = "admin";
        String password="123456";
        UsernamePasswordToken token1 =(UsernamePasswordToken)token;

        if (!token1.getUsername().equals(name)){
            return null;//底层会抛出UnknowAccountException
        }
        return new SimpleAuthenticationInfo("",password,"");
    }
}
