package com.zhangbin.controller;

import com.zhangbin.mapper.UserOperation;
import com.zhangbin.pojo.User;
import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-15:23
 */
//用户登录注册功能
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserOperation userOperation;

//    跳转注册页面
    @RequestMapping("/register")
    public String register(){
        return "user/register";
    }

//  主页面
    @RequestMapping({"/index","/"})
    public String hello(Model model,HttpSession session){
        Integer count = userOperation.queryUserCount((Integer) session.getAttribute("id"));
        Integer specialFocus = userOperation.queryUserSpecialFocusCount((Integer) session.getAttribute("id"));
        //查询数据总数
        model.addAttribute("healthCount",count);
        //查询特边关注数据总数
        model.addAttribute("specialFocus",specialFocus);
        UserHealthDate UserHealthDate = userService.queryNewHealthDataById((Integer) session.getAttribute("id"));
        //最新数据展示
        Method data_value = null;
        Method method1 = null;
        for (int i = 1; i <=50 ; i++) {
            try {
                UserHealthDate.getClass().getMethod("getData_value"+i);
                data_value = UserHealthDate.getClass().getMethod("getData_value"+i);
                String valuelist = (String) data_value.invoke(UserHealthDate);
                System.out.println(valuelist);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
//        model.addAttribute("UserHealthDate",UserHealthDate);
        return "index";
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


//  注册功能
    @PostMapping("/addUser")
    public String addUser(String login_name, String password, String email,String mobile,Model model){
        User username = userService.queryUser(login_name);
        //判断用户是否存在
        if(username != null){
            //老用户
            model.addAttribute("UserError","用户名已存在");
            return "user/register";
        }else {
            //新用户
            User user =new User();
            user.setLogin_name(login_name);
            user.setPassword(password);
            user.setGen_time(new Date());
            user.setEmail(email);
            user.setMobile(mobile);
            userService.addUser(user);
            return "user/login";
        }


    }
//  登录功能
    @RequestMapping("/toIndex")
    public String toIndex(@Param("login_name") String login_name, @Param("password")String password,Model model,HttpSession session){
        System.out.println(login_name+password);
        User user = userService.queryUser(login_name);
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
//        创建令牌，封装用户登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(login_name, password);


//        执行登录方法
        try {
            subject.login(token); //登录成功，跳转首页
            session.setAttribute("username",login_name);
            model.addAttribute("username",login_name);
            session.setAttribute("id",user.getId());
            session.setAttribute("username",user.getLogin_name());
            Integer count = userOperation.queryUserCount(user.getId());
            model.addAttribute("healthCount",count);
            Integer specialFocus = userOperation.queryUserSpecialFocusCount(user.getId());
            model.addAttribute("specialFocus",specialFocus);
            return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("UserError","用户名或密码错误"); //登录失败，跳转登录页面
            return "user/login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("UserError","用户名或密码错误"); //登录失败，跳转登录页面
            return "user/login";
        }

    }



    //跳转未授权页面
    @RequestMapping("/noauth")
    @ResponseBody
    public String unauthorized(){
        return "未授权，不能访问";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清空session数据
        session.setAttribute("username",null);
        return "redirect:/login";

    }

    @RequestMapping("/tables")
    public String tables(){
        return "tables";

    }
    //跳转编辑个人信息
    @RequestMapping("/topersonal")
    public String topersonal(HttpSession session,Model model){
        User user = userOperation.queryUserById((Integer)session.getAttribute("id"));
        System.out.println(user.getLogin_name());
        model.addAttribute("user",user);
        return "user/personal";
    }

    //编辑个人信息
    @RequestMapping("/personal")
    public String personal(){
        return "index";
    }

    //测试
    @RequestMapping("/demo")
    public String demo(String health_name,String health_scope_max){
        System.out.println(health_name);
        System.out.println(health_scope_max);
        return "index";
    }


}
