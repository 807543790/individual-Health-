package com.zhangbin.controller;

import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/29-19:25
 */
//用户健康数据展示
@Controller
public class UserPresentationController {

    @Autowired
    UserService userService;

    //  跳转健康数据页面
    @RequestMapping("/charts")
    public String charts(Model model,String user_id){
        model.addAttribute("val","1,2,3,4,5,6");
        model.addAttribute("dataval","2020,2021,2022,2023,2024,2025");
        return "charts";
    }
}
