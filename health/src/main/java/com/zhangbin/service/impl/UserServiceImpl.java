package com.zhangbin.service.impl;

import com.zhangbin.mapper.UserMapper;
import com.zhangbin.mapper.UserOperation;
import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserOperation userOperation;

    //根据用户名查询用户
    @Override
    public User queryUserByName(String login_name) {
        return userMapper.queryUserByName(login_name);
    }
    //根据用户ID查询权限
    @Override
    public Permission queryPermissionById(Integer id) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryUser(String login_name) {
        return userMapper.queryUser(login_name);
    }

    @Override
    public User queryUserPassword(String password) {
        return userMapper.queryUserPassword(password);
    }

    @Override
    public int addUserHealthData(UserHealthDate userHealthDate) {
        return userMapper.addUserHealthData(userHealthDate);
    }

    @Override
    public List<UserHealthDate> queryHealthDataById(Integer user_id) {
        return userMapper.queryHealthDataById(user_id);
    }

    @Override
    public UserHealthDate queryUserHealthDataById(Integer id) {
        return userOperation.queryUserHealthDataById(id);
    }

    @Override
    public List<UserHealthDate> querySpecialFocusById(Integer user_id) {
        return userMapper.querySpecialFocusById(user_id);
    }

    @Override
    public int updateUserHealthData(UserHealthDate userHealthDate) {
        return userOperation.updateUserHealthData(userHealthDate);
    }

    @Override
    public int queryUserCount(Integer  user_id) {
        return userOperation.queryUserCount(user_id);
    }

    @Override
    public int queryUserSpecialFocusCount(Integer user_id) {
        return userOperation.queryUserSpecialFocusCount(user_id);
    }

    @Override
    public User queryUserById(Integer id) {
        return userOperation.queryUserById(id);
    }

    @Override
    public UserHealthDate queryNewHealthDataById(Integer user_id) {
        return userMapper.queryNewHealthDataById(user_id);
    }
}
