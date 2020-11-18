package com.zhangbin.service.impl;

import com.zhangbin.mapper.UserMapper;
import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

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
}
