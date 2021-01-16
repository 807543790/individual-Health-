package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/22-14:06
 */
//用户添加数据功能
@Controller
public class BusinessController {
    @Autowired
    UserService userService;


//  添加用户健康数据
    @RequestMapping("/addHealthData")
    public String addHealthData(String health_scope_min, String health_scope_max,String health_name,
                                String remarks, HttpSession session, String health_color, String show_type, String iscollect,
                                HttpServletRequest request){
       String[] times = request.getParameterValues("health_time");
       String[] scores = request.getParameterValues("health_score");
       String time = "";
       String score = "";
        for (int i = 0; i <scores.length ; i++) {
            time = time + times[i]+",";
            score = score + scores[i]+",";
        }
        //创建用户数据实体类
        UserHealthDate userHealthDate =new UserHealthDate();
//        用户ID
        userHealthDate.setUser_id((Integer) session.getAttribute("id"));
//        展示样式
        userHealthDate.setShow_type(show_type);
//        添加时间
        userHealthDate.setAdd_time(new Date());
//        备注
        userHealthDate.setRemarks(remarks);
//        最小值
        userHealthDate.setHealth_scope_min(health_scope_min);
//        最大值
        userHealthDate.setHealth_scope_max(health_scope_max);
//        数据名称
        userHealthDate.setHealth_name(health_name);
//        数据颜色
        userHealthDate.setHealth_color(health_color);
//        是否特别关注
        userHealthDate.setIscollect(iscollect);
//        健康数据
        userHealthDate.setHealth_score(score);
//        数据时间
        userHealthDate.setHealth_time(time);
        //保存用户数据
        userService.addUserHealthData(userHealthDate);
        return "index";
    }



    //  跳转-添加健康数据
    @RequestMapping("/toaddhealth")
    public String toaddhealth( ){
        return "userAction/addhealthdata";
    }



}
