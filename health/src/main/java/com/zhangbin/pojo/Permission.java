package com.zhangbin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-16:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
    private Integer id;
    private String userId;
    private String parent_id;
}
