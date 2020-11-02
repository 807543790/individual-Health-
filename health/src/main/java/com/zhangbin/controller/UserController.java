package com.zhangbin.controller;

import com.zhangbin.pojo.User;
import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-15:23
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

//    跳转注册页面
    @RequestMapping("/register")
    public String register(){
        return "user/register";
    }

//  主页面
    @RequestMapping({"/index","/"})
    public String hello(){
        return "user/index";
    }

//  默认登录页面
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

//  设置登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "user/login";
    }

//  未授权跳转至登录页面
    @RequestMapping("/noauth")
    public String noAuth(){
        return "user/login";
    }
//  注册功能
    @PostMapping("/addUser")
    public String addUser(String login_name,String password){
        System.out.println(login_name+"--"+password);
        User user =new User();
        user.setLogin_name(login_name);
        user.setPassword(password);
        user.setGen_time(new Date());
        userService.addUser(user);
        return "user/index";
    }
}
