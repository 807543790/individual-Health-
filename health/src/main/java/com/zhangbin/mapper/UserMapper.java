package com.zhangbin.mapper;

import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import com.zhangbin.pojo.UserHealthDate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:03
 */
@Repository
@Mapper
public interface UserMapper {

    //根据用户名查询数据
    User queryUserByName(String login_name);

    //根据用户ID查询权限
    Permission queryPermissionById(Integer id);

    //添加用户
    int addUser(User user);

    //登录验证用户名功能
    User queryUser(String login_name);

    //登录验证密码功能
    User queryUserPassword(String password);

    //添加用户健康数据
    int addUserHealthData(UserHealthDate userHealthDate);

    //根据用户ID查询用户所有的健康数据
    List<UserHealthDate> queryHealthDataById(Integer  user_id);

    //根据用户ID查询特别关注数据
    List<UserHealthDate> querySpecialFocusById(Integer  user_id);

    //根据用户ID查询最新一条健康数据
    UserHealthDate queryNewHealthDataById(Integer  user_id);

}
