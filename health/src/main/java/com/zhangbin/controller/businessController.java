package com.zhangbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/22-14:06
 */
@Controller
public class businessController {

//  健康数据页面
    @RequestMapping("/charts")
    public String charts(){
        return "charts";

    }


}
