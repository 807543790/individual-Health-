package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

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
    public String charts(Model model, String user_id, HttpServletRequest request , HttpSession session){

        UserHealthDate userHealthDate = userService.queryHealthDataById((Integer)session.getAttribute("id"));
        System.out.println(session.getAttribute("id"));
        ArrayList valueList = new ArrayList<>();
        valueList.add(userHealthDate.getData_value1());
        valueList.add(userHealthDate.getData_value2());
        valueList.add(userHealthDate.getData_value3());
        valueList.add(userHealthDate.getData_value4());
        valueList.add(userHealthDate.getData_value5());
        valueList.add(userHealthDate.getData_value6());
        valueList.add(userHealthDate.getData_value7());
        valueList.add(userHealthDate.getData_value8());
        valueList.add(userHealthDate.getData_value9());
        valueList.add(userHealthDate.getData_value10());
        valueList.add(userHealthDate.getData_value11());
        valueList.add(userHealthDate.getData_value12());
        valueList.add(userHealthDate.getData_value13());
        valueList.add(userHealthDate.getData_value14());
        valueList.add(userHealthDate.getData_value15());
        valueList.add(userHealthDate.getData_value16());
        valueList.add(userHealthDate.getData_value17());
        valueList.add(userHealthDate.getData_value18());
        valueList.add(userHealthDate.getData_value19());
        valueList.add(userHealthDate.getData_value20());
        valueList.add(userHealthDate.getData_value21());
        valueList.add(userHealthDate.getData_value22());
        valueList.add(userHealthDate.getData_value23());
        valueList.add(userHealthDate.getData_value24());
        valueList.add(userHealthDate.getData_value25());
        valueList.add(userHealthDate.getData_value26());
        valueList.add(userHealthDate.getData_value27());
        valueList.add(userHealthDate.getData_value28());
        valueList.add(userHealthDate.getData_value29());
        valueList.add(userHealthDate.getData_value30());
        valueList.add(userHealthDate.getData_value31());
        valueList.add(userHealthDate.getData_value32());
        valueList.add(userHealthDate.getData_value33());
        valueList.add(userHealthDate.getData_value34());
        valueList.add(userHealthDate.getData_value35());
        valueList.add(userHealthDate.getData_value36());
        valueList.add(userHealthDate.getData_value37());
        valueList.add(userHealthDate.getData_value38());
        valueList.add(userHealthDate.getData_value39());
        valueList.add(userHealthDate.getData_value40());
        valueList.add(userHealthDate.getData_value41());
        valueList.add(userHealthDate.getData_value42());
        valueList.add(userHealthDate.getData_value43());
        valueList.add(userHealthDate.getData_value44());
        valueList.add(userHealthDate.getData_value45());
        valueList.add(userHealthDate.getData_value46());
        valueList.add(userHealthDate.getData_value47());
        valueList.add(userHealthDate.getData_value48());
        valueList.add(userHealthDate.getData_value49());
        valueList.add(userHealthDate.getData_value50());

        ArrayList dateList = new ArrayList<>();
        dateList.add(userHealthDate.getData_date1());
        dateList.add(userHealthDate.getData_date2());
        dateList.add(userHealthDate.getData_date3());
        dateList.add(userHealthDate.getData_date4());
        dateList.add(userHealthDate.getData_date5());
        dateList.add(userHealthDate.getData_date6());
        dateList.add(userHealthDate.getData_date7());
        dateList.add(userHealthDate.getData_date8());
        dateList.add(userHealthDate.getData_date9());
        dateList.add(userHealthDate.getData_date10());
        dateList.add(userHealthDate.getData_date11());
        dateList.add(userHealthDate.getData_date12());
        dateList.add(userHealthDate.getData_date13());
        dateList.add(userHealthDate.getData_date14());
        dateList.add(userHealthDate.getData_date15());
        dateList.add(userHealthDate.getData_date16());
        dateList.add(userHealthDate.getData_date17());
        dateList.add(userHealthDate.getData_date18());
        dateList.add(userHealthDate.getData_date19());
        dateList.add(userHealthDate.getData_date20());
        dateList.add(userHealthDate.getData_date21());
        dateList.add(userHealthDate.getData_date22());
        dateList.add(userHealthDate.getData_date23());
        dateList.add(userHealthDate.getData_date24());
        dateList.add(userHealthDate.getData_date25());
        dateList.add(userHealthDate.getData_date26());
        dateList.add(userHealthDate.getData_date27());
        dateList.add(userHealthDate.getData_date28());
        dateList.add(userHealthDate.getData_date29());
        dateList.add(userHealthDate.getData_date30());
        dateList.add(userHealthDate.getData_date31());
        dateList.add(userHealthDate.getData_date32());
        dateList.add(userHealthDate.getData_date33());
        dateList.add(userHealthDate.getData_date34());
        dateList.add(userHealthDate.getData_date35());
        dateList.add(userHealthDate.getData_date36());
        dateList.add(userHealthDate.getData_date37());
        dateList.add(userHealthDate.getData_date38());
        dateList.add(userHealthDate.getData_date39());
        dateList.add(userHealthDate.getData_date40());
        dateList.add(userHealthDate.getData_date41());
        dateList.add(userHealthDate.getData_date42());
        dateList.add(userHealthDate.getData_date43());
        dateList.add(userHealthDate.getData_date44());
        dateList.add(userHealthDate.getData_date45());
        dateList.add(userHealthDate.getData_date46());
        dateList.add(userHealthDate.getData_date47());
        dateList.add(userHealthDate.getData_date48());
        dateList.add(userHealthDate.getData_date49());
        dateList.add(userHealthDate.getData_date50());
        request.setAttribute("value",valueList);
        request.setAttribute("date",dateList);
        request.setAttribute("title",userHealthDate.getHealth_name());
        System.out.println(userHealthDate.getData_date1());
        System.out.println(userHealthDate.getHealth_name());
        return "userAction/charts";
    }
}
