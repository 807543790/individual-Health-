package com.zhangbin.mapper;

import com.zhangbin.pojo.Permission;
import com.zhangbin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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

}
