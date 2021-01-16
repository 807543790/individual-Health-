package com.zhangbin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/27-22:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//用户健康数据实体类
public class UserHealthDate {
    private Integer id;
    private Integer user_id;
    private String parent_id;
    private Date add_time;
    private String health_scope_min;
    private String health_scope_max;
    private String health_name;
    private String remarks;
    private String health_color;
    private String show_type;
    private String iscollect;
    private String health_score;
    private String health_time;
}
