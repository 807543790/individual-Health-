package com.zhangbin.service;

import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:41
 */
public interface UserService {

    //根据用户名查询数据
    User queryUserByName(String login_name);

    //根据用户ID查询权限
    Permission queryPermissionById(Integer id);

    //添加用户
    int addUser(User user);
}
