package com.zhangbin.mapper;

import com.zhangbin.pojo.UserHealthDate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/12/11-12:50
 */
@Mapper
@Repository
public interface UserOperation {

    //根据健康数据ID查询
    UserHealthDate queryUserHealthDataById(Integer  id);

    //修改用户数据
    int updateUserHealthData(UserHealthDate userHealthDate);
}
