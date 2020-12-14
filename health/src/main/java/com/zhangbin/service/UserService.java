package com.zhangbin.service;

import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import com.zhangbin.pojo.UserHealthDate;

import java.util.List;

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

    //登录验证功能
    User queryUser(String login_name);

    //登录验证密码功能
    User queryUserPassword(String password);

    //添加用户健康数据
    int addUserHealthData(UserHealthDate userHealthDate);

    //修改用户数据
    int updateUserHealthData(UserHealthDate userHealthDate);

    //根据用户ID查询用户所有的健康数据
    List<UserHealthDate> queryHealthDataById(Integer  user_id);

    //根据健康数据ID查询
    UserHealthDate queryUserHealthDataById(Integer  id);

    //根据用户ID查询特别关注数据
    List<UserHealthDate> querySpecialFocusById(Integer  user_id);

}
