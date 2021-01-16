package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/29-19:25
 */
//用户健康数据展示功能
@Controller
public class UserPresentationController {

    @Autowired
    UserService userService;

    //  跳转健康数据页面
    @RequestMapping("/charts")
    public String  charts(HttpSession session, HttpServletResponse response, HttpServletRequest request){
        List<UserHealthDate> userlist = userService.queryHealthDataById((Integer) session.getAttribute("id"));
        //创建JSONArray实例
             JSONObject jsonObject =new JSONObject();
        for (UserHealthDate userhealthdate: userlist) {
            jsonObject.put("username",userhealthdate.getHealth_name());
        }
        request.setAttribute("username",jsonObject);
        return "userAction/charts";
    }

    //修改用户健康数据
    @RequestMapping("/toUpdateHealth")
    public String toUpdateHealth(){
        return "userAction/updateHealthData";
    }


}






