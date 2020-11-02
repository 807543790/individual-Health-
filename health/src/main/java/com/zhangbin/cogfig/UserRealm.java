package com.zhangbin.cogfig;

import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import com.zhangbin.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-15:39
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService service;

//  用户授权操作
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("用户授权操作---->doGetAuthorizationInfo");
        //创建SimpleAuthorizationInfo
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        Subject subject = SecurityUtils.getSubject();
//        在认证中获取User用户数据
        User currentUser = (User) subject.getPrincipal();
        //根据用户ID查询权限
        Permission permission = service.queryPermissionById(currentUser.getId());


        //通过User数据库中的数据，设置当前用户权限
        info.addStringPermission(permission.getParent_id());
        //获取用户权限
        System.out.println("用户的权限："+ permission.getParent_id());


        System.out.println("执行了授权=doGetAuthorizationInfo");
        return info;
    }






//  用户认证操作
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("用户执行了认证操作---->doGetAuthenticationInfo");

        UsernamePasswordToken userToken = (UsernamePasswordToken)token;

        //连接数据库认证用户是否存在
        User user = service.queryUserByName(userToken.getUsername());

        //判断用户是否存在
        if(user == null){
            return null;
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),"");
    }
}
