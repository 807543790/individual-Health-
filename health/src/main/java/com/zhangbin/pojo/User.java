package com.zhangbin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:04
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;
    private String login_name;
    private String password;
    private Integer healthId;
    private String email;
    private String mobile;
    private Date login_time;
    private Date gen_time;
    private Date last_login_time;
    private Integer count;



}
