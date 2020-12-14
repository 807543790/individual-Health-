package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public String charts(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        //根据获取的用户Id查询用户所有的健康数据
        List<UserHealthDate> userHealthDate = userService.queryHealthDataById((Integer) session.getAttribute("id"));
        for (int i = 0; i <userHealthDate.size() ; i++) {
            ArrayList datelist = new ArrayList();
            if(userHealthDate.get(i).getData_date1() != null){
                datelist.add(userHealthDate.get(i).getData_date1());
            }
            if(userHealthDate.get(i).getData_date2() != null){
                datelist.add(userHealthDate.get(i).getData_date2());
            }
            if(userHealthDate.get(i).getData_date3() != null){
                datelist.add(userHealthDate.get(i).getData_date3());
            }
            if(userHealthDate.get(i).getData_date4() != null){
                datelist.add(userHealthDate.get(i).getData_date4());
            }
            if(userHealthDate.get(i).getData_date5() != null){
                datelist.add(userHealthDate.get(i).getData_date5());
            }
            if(userHealthDate.get(i).getData_date6() != null){
                datelist.add(userHealthDate.get(i).getData_date6());
            }
            if(userHealthDate.get(i).getData_date7() != null){
                datelist.add(userHealthDate.get(i).getData_date7());
            }
            if(userHealthDate.get(i).getData_date8() != null){
                datelist.add(userHealthDate.get(i).getData_date8());
            }
            if(userHealthDate.get(i).getData_date9() != null){
                datelist.add(userHealthDate.get(i).getData_date9());
            }
            if(userHealthDate.get(i).getData_date10() != null){
                datelist.add(userHealthDate.get(i).getData_date10());
            }
            if(userHealthDate.get(i).getData_date11() != null){
                datelist.add(userHealthDate.get(i).getData_date11());
            }
            if(userHealthDate.get(i).getData_date12() != null){
                datelist.add(userHealthDate.get(i).getData_date12());
            }
            if(userHealthDate.get(i).getData_date13() != null){
                datelist.add(userHealthDate.get(i).getData_date13());
            }
            if(userHealthDate.get(i).getData_date14() != null){
                datelist.add(userHealthDate.get(i).getData_date14());
            }
            if(userHealthDate.get(i).getData_date15() != null){
                datelist.add(userHealthDate.get(i).getData_date15());
            }
            if(userHealthDate.get(i).getData_date16() != null){
                datelist.add(userHealthDate.get(i).getData_date16());
            }
            if(userHealthDate.get(i).getData_date17() != null){
                datelist.add(userHealthDate.get(i).getData_date17());
            }
            if(userHealthDate.get(i).getData_date18() != null){
                datelist.add(userHealthDate.get(i).getData_date18());
            }
            if(userHealthDate.get(i).getData_date19() != null){
                datelist.add(userHealthDate.get(i).getData_date19());
            }
            if(userHealthDate.get(i).getData_date20() != null){
                datelist.add(userHealthDate.get(i).getData_date20());
            }
            if(userHealthDate.get(i).getData_date21() != null){
                datelist.add(userHealthDate.get(i).getData_date21());
            }
            if(userHealthDate.get(i).getData_date22() != null){
                datelist.add(userHealthDate.get(i).getData_date22());
            }
            if(userHealthDate.get(i).getData_date23() != null){
                datelist.add(userHealthDate.get(i).getData_date23());
            }
            if(userHealthDate.get(i).getData_date24() != null){
                datelist.add(userHealthDate.get(i).getData_date24());
            }
            if(userHealthDate.get(i).getData_date25() != null){
                datelist.add(userHealthDate.get(i).getData_date25());
            }
            if(userHealthDate.get(i).getData_date26() != null){
                datelist.add(userHealthDate.get(i).getData_date26());
            }
            if(userHealthDate.get(i).getData_date27() != null){
                datelist.add(userHealthDate.get(i).getData_date27());
            }
            if(userHealthDate.get(i).getData_date28() != null){
                datelist.add(userHealthDate.get(i).getData_date28());
            }
            if(userHealthDate.get(i).getData_date29() != null){
                datelist.add(userHealthDate.get(i).getData_date29());
            }
            if(userHealthDate.get(i).getData_date30() != null){
                datelist.add(userHealthDate.get(i).getData_date30());
            }
            if(userHealthDate.get(i).getData_date31() != null){
                datelist.add(userHealthDate.get(i).getData_date31());
            }
            if(userHealthDate.get(i).getData_date32() != null){
                datelist.add(userHealthDate.get(i).getData_date32());
            }
            if(userHealthDate.get(i).getData_date33() != null){
                datelist.add(userHealthDate.get(i).getData_date33());
            }
            if(userHealthDate.get(i).getData_date34() != null){
                datelist.add(userHealthDate.get(i).getData_date34());
            }
            if(userHealthDate.get(i).getData_date35() != null){
                datelist.add(userHealthDate.get(i).getData_date35());
            }
            if(userHealthDate.get(i).getData_date36() != null){
                datelist.add(userHealthDate.get(i).getData_date36());
            }
            if(userHealthDate.get(i).getData_date37() != null){
                datelist.add(userHealthDate.get(i).getData_date37());
            }
            if(userHealthDate.get(i).getData_date38() != null){
                datelist.add(userHealthDate.get(i).getData_date38());
            }
            if(userHealthDate.get(i).getData_date39() != null){
                datelist.add(userHealthDate.get(i).getData_date39());
            }
            if(userHealthDate.get(i).getData_date40() != null){
                datelist.add(userHealthDate.get(i).getData_date40());
            }
            if(userHealthDate.get(i).getData_date41() != null){
                datelist.add(userHealthDate.get(i).getData_date41());
            }
            if(userHealthDate.get(i).getData_date42() != null){
                datelist.add(userHealthDate.get(i).getData_date42());
            }
            if(userHealthDate.get(i).getData_date43() != null){
                datelist.add(userHealthDate.get(i).getData_date43());
            }
            if(userHealthDate.get(i).getData_date44() != null){
                datelist.add(userHealthDate.get(i).getData_date44());
            }
            if(userHealthDate.get(i).getData_date45() != null){
                datelist.add(userHealthDate.get(i).getData_date45());
            }
            if(userHealthDate.get(i).getData_date46() != null){
                datelist.add(userHealthDate.get(i).getData_date46());
            }
            if(userHealthDate.get(i).getData_date47() != null){
                datelist.add(userHealthDate.get(i).getData_date47());
            }
            if(userHealthDate.get(i).getData_date48() != null){
                datelist.add(userHealthDate.get(i).getData_date48());
            }
            if(userHealthDate.get(i).getData_date49() != null){
                datelist.add(userHealthDate.get(i).getData_date49());
            }
            if(userHealthDate.get(i).getData_date50() != null){
                datelist.add(userHealthDate.get(i).getData_date50());
            }
            ArrayList valuelist = new ArrayList();
            if(userHealthDate.get(i).getData_value1() != null){
                valuelist.add(userHealthDate.get(i).getData_value1());
            }if(userHealthDate.get(i).getData_value2() != null){
                valuelist.add(userHealthDate.get(i).getData_value2());
            }if(userHealthDate.get(i).getData_value3() != null){
                valuelist.add(userHealthDate.get(i).getData_value3());
            }if(userHealthDate.get(i).getData_value4() != null){
                valuelist.add(userHealthDate.get(i).getData_value4());
            }
            if(userHealthDate.get(i).getData_value5() != null){
                valuelist.add(userHealthDate.get(i).getData_value5());
            }
            if(userHealthDate.get(i).getData_value6() != null){
                valuelist.add(userHealthDate.get(i).getData_value6());
            }
            if(userHealthDate.get(i).getData_value7() != null){
                valuelist.add(userHealthDate.get(i).getData_value7());
            }
            if(userHealthDate.get(i).getData_value8() != null){
                valuelist.add(userHealthDate.get(i).getData_value8());
            }
            if(userHealthDate.get(i).getData_value9() != null){
                valuelist.add(userHealthDate.get(i).getData_value9());
            }
            if(userHealthDate.get(i).getData_value10() != null){
                valuelist.add(userHealthDate.get(i).getData_value10());
            }
            if(userHealthDate.get(i).getData_value11() != null){
                valuelist.add(userHealthDate.get(i).getData_value11());
            }
            if(userHealthDate.get(i).getData_value12() != null){
                valuelist.add(userHealthDate.get(i).getData_value12());
            }
            if(userHealthDate.get(i).getData_value13() != null){
                valuelist.add(userHealthDate.get(i).getData_value13());
            }
            if(userHealthDate.get(i).getData_value14() != null){
                valuelist.add(userHealthDate.get(i).getData_value14());
            }
            if(userHealthDate.get(i).getData_value15() != null){
                valuelist.add(userHealthDate.get(i).getData_value15());
            }
            if(userHealthDate.get(i).getData_value16() != null){
                valuelist.add(userHealthDate.get(i).getData_value16());
            }
            if(userHealthDate.get(i).getData_value17() != null){
                valuelist.add(userHealthDate.get(i).getData_value17());
            }
            if(userHealthDate.get(i).getData_value18() != null){
                valuelist.add(userHealthDate.get(i).getData_value18());
            }
            if(userHealthDate.get(i).getData_value19() != null){
                valuelist.add(userHealthDate.get(i).getData_value19());
            }
            if(userHealthDate.get(i).getData_value20() != null){
                valuelist.add(userHealthDate.get(i).getData_value20());
            }
            if(userHealthDate.get(i).getData_value21() != null){
                valuelist.add(userHealthDate.get(i).getData_value21());
            }
            if(userHealthDate.get(i).getData_value22() != null){
                valuelist.add(userHealthDate.get(i).getData_value22());
            }
            if(userHealthDate.get(i).getData_value23() != null){
                valuelist.add(userHealthDate.get(i).getData_value23());
            }
            if(userHealthDate.get(i).getData_value24() != null){
                valuelist.add(userHealthDate.get(i).getData_value24());
            }
            if(userHealthDate.get(i).getData_value25() != null){
                valuelist.add(userHealthDate.get(i).getData_value25());
            }
            if(userHealthDate.get(i).getData_value26() != null){
                valuelist.add(userHealthDate.get(i).getData_value26());
            }
            if(userHealthDate.get(i).getData_value27() != null){
                valuelist.add(userHealthDate.get(i).getData_value27());
            }
            if(userHealthDate.get(i).getData_value28() != null){
                valuelist.add(userHealthDate.get(i).getData_value28());
            }
            if(userHealthDate.get(i).getData_value29() != null){
                valuelist.add(userHealthDate.get(i).getData_value29());
            }
            if(userHealthDate.get(i).getData_value30() != null){
                valuelist.add(userHealthDate.get(i).getData_value30());
            }
            if(userHealthDate.get(i).getData_value31() != null){
                valuelist.add(userHealthDate.get(i).getData_value31());
            }
            if(userHealthDate.get(i).getData_value32() != null){
                valuelist.add(userHealthDate.get(i).getData_value32());
            }
            if(userHealthDate.get(i).getData_value33() != null){
                valuelist.add(userHealthDate.get(i).getData_value33());
            }
            if(userHealthDate.get(i).getData_value34() != null){
                valuelist.add(userHealthDate.get(i).getData_value34());
            }
            if(userHealthDate.get(i).getData_value35() != null){
                valuelist.add(userHealthDate.get(i).getData_value35());
            }
            if(userHealthDate.get(i).getData_value36() != null){
                valuelist.add(userHealthDate.get(i).getData_value36());
            }
            if(userHealthDate.get(i).getData_value37() != null){
                valuelist.add(userHealthDate.get(i).getData_value37());
            }
            if(userHealthDate.get(i).getData_value38() != null){
                valuelist.add(userHealthDate.get(i).getData_value38());
            }
            if(userHealthDate.get(i).getData_value39() != null){
                valuelist.add(userHealthDate.get(i).getData_value39());
            }
            if(userHealthDate.get(i).getData_value40() != null){
                valuelist.add(userHealthDate.get(i).getData_value40());
            }
            if(userHealthDate.get(i).getData_value41() != null){
                valuelist.add(userHealthDate.get(i).getData_value41());
            }
            if(userHealthDate.get(i).getData_value42() != null){
                valuelist.add(userHealthDate.get(i).getData_value42());
            }
            if(userHealthDate.get(i).getData_value43() != null){
                valuelist.add(userHealthDate.get(i).getData_value43());
            }
            if(userHealthDate.get(i).getData_value44() != null){
                valuelist.add(userHealthDate.get(i).getData_value44());
            }
            if(userHealthDate.get(i).getData_value45() != null){
                valuelist.add(userHealthDate.get(i).getData_value45());
            }
            if(userHealthDate.get(i).getData_value46() != null){
                valuelist.add(userHealthDate.get(i).getData_value46());
            }
            if(userHealthDate.get(i).getData_value47() != null){
                valuelist.add(userHealthDate.get(i).getData_value47());
            }
            if(userHealthDate.get(i).getData_value48() != null){
                valuelist.add(userHealthDate.get(i).getData_value48());
            }
            if(userHealthDate.get(i).getData_value49() != null){
                valuelist.add(userHealthDate.get(i).getData_value49());
            }
            if(userHealthDate.get(i).getData_value50() != null){
                valuelist.add(userHealthDate.get(i).getData_value50());
            }
            model.addAttribute("valuelist"+i,valuelist);
            model.addAttribute("datelist"+i,datelist);
            model.addAttribute("userHealthDate"+i,userHealthDate.get(i).getHealth_name());
            model.addAttribute("max"+i,userHealthDate.get(i).getHealth_scope_max());
            model.addAttribute("min"+i,userHealthDate.get(i).getHealth_scope_min());
            model.addAttribute("color"+i,userHealthDate.get(i).getHealth_color());
            model.addAttribute("showType"+i,userHealthDate.get(i).getShow_type());
            model.addAttribute("healthId"+i,userHealthDate.get(i).getId());
        }
        return "userAction/charts";
    }
    //跳转修改数据页面
    @RequestMapping("/updateHealth")
    public String updateHealth(Integer id,Model model){
        UserHealthDate userHealthDate = userService.queryUserHealthDataById(id);
        model.addAttribute("user",userHealthDate);
        return "userAction/updateHealthData";
    }

    //  跳转特别关注页面
    @RequestMapping("/specialfocus")
    public String specialfocus(HttpSession session, Model model) {
        //根据获取的用户Id查询用户所有的健康数据
        List<UserHealthDate> userHealthDate = userService.querySpecialFocusById((Integer) session.getAttribute("id"));
        for (int i = 0; i <userHealthDate.size() ; i++) {
            ArrayList datelist = new ArrayList();
            if(userHealthDate.get(i).getData_date1() != null){
                datelist.add(userHealthDate.get(i).getData_date1());
            }
            if(userHealthDate.get(i).getData_date2() != null){
                datelist.add(userHealthDate.get(i).getData_date2());
            }
            if(userHealthDate.get(i).getData_date3() != null){
                datelist.add(userHealthDate.get(i).getData_date3());
            }
            if(userHealthDate.get(i).getData_date4() != null){
                datelist.add(userHealthDate.get(i).getData_date4());
            }
            if(userHealthDate.get(i).getData_date5() != null){
                datelist.add(userHealthDate.get(i).getData_date5());
            }
            if(userHealthDate.get(i).getData_date6() != null){
                datelist.add(userHealthDate.get(i).getData_date6());
            }
            if(userHealthDate.get(i).getData_date7() != null){
                datelist.add(userHealthDate.get(i).getData_date7());
            }
            if(userHealthDate.get(i).getData_date8() != null){
                datelist.add(userHealthDate.get(i).getData_date8());
            }
            if(userHealthDate.get(i).getData_date9() != null){
                datelist.add(userHealthDate.get(i).getData_date9());
            }
            if(userHealthDate.get(i).getData_date10() != null){
                datelist.add(userHealthDate.get(i).getData_date10());
            }
            if(userHealthDate.get(i).getData_date11() != null){
                datelist.add(userHealthDate.get(i).getData_date11());
            }
            if(userHealthDate.get(i).getData_date12() != null){
                datelist.add(userHealthDate.get(i).getData_date12());
            }
            if(userHealthDate.get(i).getData_date13() != null){
                datelist.add(userHealthDate.get(i).getData_date13());
            }
            if(userHealthDate.get(i).getData_date14() != null){
                datelist.add(userHealthDate.get(i).getData_date14());
            }
            if(userHealthDate.get(i).getData_date15() != null){
                datelist.add(userHealthDate.get(i).getData_date15());
            }
            if(userHealthDate.get(i).getData_date16() != null){
                datelist.add(userHealthDate.get(i).getData_date16());
            }
            if(userHealthDate.get(i).getData_date17() != null){
                datelist.add(userHealthDate.get(i).getData_date17());
            }
            if(userHealthDate.get(i).getData_date18() != null){
                datelist.add(userHealthDate.get(i).getData_date18());
            }
            if(userHealthDate.get(i).getData_date19() != null){
                datelist.add(userHealthDate.get(i).getData_date19());
            }
            if(userHealthDate.get(i).getData_date20() != null){
                datelist.add(userHealthDate.get(i).getData_date20());
            }
            if(userHealthDate.get(i).getData_date21() != null){
                datelist.add(userHealthDate.get(i).getData_date21());
            }
            if(userHealthDate.get(i).getData_date22() != null){
                datelist.add(userHealthDate.get(i).getData_date22());
            }
            if(userHealthDate.get(i).getData_date23() != null){
                datelist.add(userHealthDate.get(i).getData_date23());
            }
            if(userHealthDate.get(i).getData_date24() != null){
                datelist.add(userHealthDate.get(i).getData_date24());
            }
            if(userHealthDate.get(i).getData_date25() != null){
                datelist.add(userHealthDate.get(i).getData_date25());
            }
            if(userHealthDate.get(i).getData_date26() != null){
                datelist.add(userHealthDate.get(i).getData_date26());
            }
            if(userHealthDate.get(i).getData_date27() != null){
                datelist.add(userHealthDate.get(i).getData_date27());
            }
            if(userHealthDate.get(i).getData_date28() != null){
                datelist.add(userHealthDate.get(i).getData_date28());
            }
            if(userHealthDate.get(i).getData_date29() != null){
                datelist.add(userHealthDate.get(i).getData_date29());
            }
            if(userHealthDate.get(i).getData_date30() != null){
                datelist.add(userHealthDate.get(i).getData_date30());
            }
            if(userHealthDate.get(i).getData_date31() != null){
                datelist.add(userHealthDate.get(i).getData_date31());
            }
            if(userHealthDate.get(i).getData_date32() != null){
                datelist.add(userHealthDate.get(i).getData_date32());
            }
            if(userHealthDate.get(i).getData_date33() != null){
                datelist.add(userHealthDate.get(i).getData_date33());
            }
            if(userHealthDate.get(i).getData_date34() != null){
                datelist.add(userHealthDate.get(i).getData_date34());
            }
            if(userHealthDate.get(i).getData_date35() != null){
                datelist.add(userHealthDate.get(i).getData_date35());
            }
            if(userHealthDate.get(i).getData_date36() != null){
                datelist.add(userHealthDate.get(i).getData_date36());
            }
            if(userHealthDate.get(i).getData_date37() != null){
                datelist.add(userHealthDate.get(i).getData_date37());
            }
            if(userHealthDate.get(i).getData_date38() != null){
                datelist.add(userHealthDate.get(i).getData_date38());
            }
            if(userHealthDate.get(i).getData_date39() != null){
                datelist.add(userHealthDate.get(i).getData_date39());
            }
            if(userHealthDate.get(i).getData_date40() != null){
                datelist.add(userHealthDate.get(i).getData_date40());
            }
            if(userHealthDate.get(i).getData_date41() != null){
                datelist.add(userHealthDate.get(i).getData_date41());
            }
            if(userHealthDate.get(i).getData_date42() != null){
                datelist.add(userHealthDate.get(i).getData_date42());
            }
            if(userHealthDate.get(i).getData_date43() != null){
                datelist.add(userHealthDate.get(i).getData_date43());
            }
            if(userHealthDate.get(i).getData_date44() != null){
                datelist.add(userHealthDate.get(i).getData_date44());
            }
            if(userHealthDate.get(i).getData_date45() != null){
                datelist.add(userHealthDate.get(i).getData_date45());
            }
            if(userHealthDate.get(i).getData_date46() != null){
                datelist.add(userHealthDate.get(i).getData_date46());
            }
            if(userHealthDate.get(i).getData_date47() != null){
                datelist.add(userHealthDate.get(i).getData_date47());
            }
            if(userHealthDate.get(i).getData_date48() != null){
                datelist.add(userHealthDate.get(i).getData_date48());
            }
            if(userHealthDate.get(i).getData_date49() != null){
                datelist.add(userHealthDate.get(i).getData_date49());
            }
            if(userHealthDate.get(i).getData_date50() != null){
                datelist.add(userHealthDate.get(i).getData_date50());
            }
            ArrayList valuelist = new ArrayList();
            if(userHealthDate.get(i).getData_value1() != null){
                valuelist.add(userHealthDate.get(i).getData_value1());
            }if(userHealthDate.get(i).getData_value2() != null){
                valuelist.add(userHealthDate.get(i).getData_value2());
            }if(userHealthDate.get(i).getData_value3() != null){
                valuelist.add(userHealthDate.get(i).getData_value3());
            }if(userHealthDate.get(i).getData_value4() != null){
                valuelist.add(userHealthDate.get(i).getData_value4());
            }
            if(userHealthDate.get(i).getData_value5() != null){
                valuelist.add(userHealthDate.get(i).getData_value5());
            }
            if(userHealthDate.get(i).getData_value6() != null){
                valuelist.add(userHealthDate.get(i).getData_value6());
            }
            if(userHealthDate.get(i).getData_value7() != null){
                valuelist.add(userHealthDate.get(i).getData_value7());
            }
            if(userHealthDate.get(i).getData_value8() != null){
                valuelist.add(userHealthDate.get(i).getData_value8());
            }
            if(userHealthDate.get(i).getData_value9() != null){
                valuelist.add(userHealthDate.get(i).getData_value9());
            }
            if(userHealthDate.get(i).getData_value10() != null){
                valuelist.add(userHealthDate.get(i).getData_value10());
            }
            if(userHealthDate.get(i).getData_value11() != null){
                valuelist.add(userHealthDate.get(i).getData_value11());
            }
            if(userHealthDate.get(i).getData_value12() != null){
                valuelist.add(userHealthDate.get(i).getData_value12());
            }
            if(userHealthDate.get(i).getData_value13() != null){
                valuelist.add(userHealthDate.get(i).getData_value13());
            }
            if(userHealthDate.get(i).getData_value14() != null){
                valuelist.add(userHealthDate.get(i).getData_value14());
            }
            if(userHealthDate.get(i).getData_value15() != null){
                valuelist.add(userHealthDate.get(i).getData_value15());
            }
            if(userHealthDate.get(i).getData_value16() != null){
                valuelist.add(userHealthDate.get(i).getData_value16());
            }
            if(userHealthDate.get(i).getData_value17() != null){
                valuelist.add(userHealthDate.get(i).getData_value17());
            }
            if(userHealthDate.get(i).getData_value18() != null){
                valuelist.add(userHealthDate.get(i).getData_value18());
            }
            if(userHealthDate.get(i).getData_value19() != null){
                valuelist.add(userHealthDate.get(i).getData_value19());
            }
            if(userHealthDate.get(i).getData_value20() != null){
                valuelist.add(userHealthDate.get(i).getData_value20());
            }
            if(userHealthDate.get(i).getData_value21() != null){
                valuelist.add(userHealthDate.get(i).getData_value21());
            }
            if(userHealthDate.get(i).getData_value22() != null){
                valuelist.add(userHealthDate.get(i).getData_value22());
            }
            if(userHealthDate.get(i).getData_value23() != null){
                valuelist.add(userHealthDate.get(i).getData_value23());
            }
            if(userHealthDate.get(i).getData_value24() != null){
                valuelist.add(userHealthDate.get(i).getData_value24());
            }
            if(userHealthDate.get(i).getData_value25() != null){
                valuelist.add(userHealthDate.get(i).getData_value25());
            }
            if(userHealthDate.get(i).getData_value26() != null){
                valuelist.add(userHealthDate.get(i).getData_value26());
            }
            if(userHealthDate.get(i).getData_value27() != null){
                valuelist.add(userHealthDate.get(i).getData_value27());
            }
            if(userHealthDate.get(i).getData_value28() != null){
                valuelist.add(userHealthDate.get(i).getData_value28());
            }
            if(userHealthDate.get(i).getData_value29() != null){
                valuelist.add(userHealthDate.get(i).getData_value29());
            }
            if(userHealthDate.get(i).getData_value30() != null){
                valuelist.add(userHealthDate.get(i).getData_value30());
            }
            if(userHealthDate.get(i).getData_value31() != null){
                valuelist.add(userHealthDate.get(i).getData_value31());
            }
            if(userHealthDate.get(i).getData_value32() != null){
                valuelist.add(userHealthDate.get(i).getData_value32());
            }
            if(userHealthDate.get(i).getData_value33() != null){
                valuelist.add(userHealthDate.get(i).getData_value33());
            }
            if(userHealthDate.get(i).getData_value34() != null){
                valuelist.add(userHealthDate.get(i).getData_value34());
            }
            if(userHealthDate.get(i).getData_value35() != null){
                valuelist.add(userHealthDate.get(i).getData_value35());
            }
            if(userHealthDate.get(i).getData_value36() != null){
                valuelist.add(userHealthDate.get(i).getData_value36());
            }
            if(userHealthDate.get(i).getData_value37() != null){
                valuelist.add(userHealthDate.get(i).getData_value37());
            }
            if(userHealthDate.get(i).getData_value38() != null){
                valuelist.add(userHealthDate.get(i).getData_value38());
            }
            if(userHealthDate.get(i).getData_value39() != null){
                valuelist.add(userHealthDate.get(i).getData_value39());
            }
            if(userHealthDate.get(i).getData_value40() != null){
                valuelist.add(userHealthDate.get(i).getData_value40());
            }
            if(userHealthDate.get(i).getData_value41() != null){
                valuelist.add(userHealthDate.get(i).getData_value41());
            }
            if(userHealthDate.get(i).getData_value42() != null){
                valuelist.add(userHealthDate.get(i).getData_value42());
            }
            if(userHealthDate.get(i).getData_value43() != null){
                valuelist.add(userHealthDate.get(i).getData_value43());
            }
            if(userHealthDate.get(i).getData_value44() != null){
                valuelist.add(userHealthDate.get(i).getData_value44());
            }
            if(userHealthDate.get(i).getData_value45() != null){
                valuelist.add(userHealthDate.get(i).getData_value45());
            }
            if(userHealthDate.get(i).getData_value46() != null){
                valuelist.add(userHealthDate.get(i).getData_value46());
            }
            if(userHealthDate.get(i).getData_value47() != null){
                valuelist.add(userHealthDate.get(i).getData_value47());
            }
            if(userHealthDate.get(i).getData_value48() != null){
                valuelist.add(userHealthDate.get(i).getData_value48());
            }
            if(userHealthDate.get(i).getData_value49() != null){
                valuelist.add(userHealthDate.get(i).getData_value49());
            }
            if(userHealthDate.get(i).getData_value50() != null){
                valuelist.add(userHealthDate.get(i).getData_value50());
            }
            model.addAttribute("valuelist"+i,valuelist);
            model.addAttribute("datelist"+i,datelist);
            model.addAttribute("userHealthDate"+i,userHealthDate.get(i).getHealth_name());
            model.addAttribute("max"+i,userHealthDate.get(i).getHealth_scope_max());
            model.addAttribute("min"+i,userHealthDate.get(i).getHealth_scope_min());
            model.addAttribute("color"+i,userHealthDate.get(i).getHealth_color());
            model.addAttribute("showType"+i,userHealthDate.get(i).getShow_type());
            model.addAttribute("healthId"+i,userHealthDate.get(i).getId());
        }
        return "userAction/specialfocus";
    }

    //修改用户健康数据
    @RequestMapping("/toUpdateHealth")
    public String toUpdateHealth(String health_scope_min, String health_scope_max, @Param("health_name") String health_name, String remarks, HttpSession session, String health_color, String show_type, String iscollect,
                                 String data_date1, String data_date2, String data_date3, String data_date4, String data_date5, String data_date6, String data_date7, String data_date8, String data_date9, String data_date10,
                                 String data_date11, String data_date12, String data_date13, String data_date14, String data_date15, String data_date16, String data_date17, String data_date18, String data_date19, String data_date20,
                                 String data_date21, String data_date22, String data_date23, String data_date24, String data_date25, String data_date26, String data_date27, String data_date28, String data_date29, String data_date30,
                                 String data_date31, String data_date32, String data_date33, String data_date34, String data_date35, String data_date36, String data_date37, String data_date38, String data_date39, String data_date40,
                                 String data_date41, String data_date42, String data_date43, String data_date44, String data_date45, String data_date46, String data_date47, String data_date48, String data_date49, String data_date50,
                                 String data_value1, String data_value2, String data_value3, String data_value4, String data_value5, String data_value6, String data_value7, String data_value8, String data_value9, String data_value10,
                                 String data_value11, String data_value12, String data_value13, String data_value14, String data_value15, String data_value16, String data_value17, String data_value18, String data_value19, String data_value20,
                                 String data_value21, String data_value22, String data_value23, String data_value24, String data_value25, String data_value26, String data_value27, String data_value28, String data_value29, String data_value30,
                                 String data_value31, String data_value32, String data_value33, String data_value34, String data_value35, String data_value36, String data_value37, String data_value38, String data_value39, String data_value40,
                                 String data_value41, String data_value42, String data_value43, String data_value44, String data_value45, String data_value46, String data_value47, String data_value48, String data_value49, String data_value50
    ){
        UserHealthDate userHealthDate = new UserHealthDate();
        userHealthDate.setHealth_scope_min(health_scope_min);
        userHealthDate.setHealth_scope_max(health_scope_max);
        userHealthDate.setHealth_name(health_name);
        userHealthDate.setData_date1(data_date1);
        userHealthDate.setData_date2(data_date2);
        userHealthDate.setData_date3(data_date3);
        userHealthDate.setData_date4(data_date4);
        userHealthDate.setData_date5(data_date5);
        userHealthDate.setData_date6(data_date6);
        userHealthDate.setData_date7(data_date7);
        userHealthDate.setData_date8(data_date8);
        userHealthDate.setData_date9(data_date9);
        userHealthDate.setData_date10(data_date10);
        userHealthDate.setData_date11(data_date11);
        userHealthDate.setData_date12(data_date12);
        userHealthDate.setData_date13(data_date13);
        userHealthDate.setData_date14(data_date14);
        userHealthDate.setData_date15(data_date15);
        userHealthDate.setData_date16(data_date16);
        userHealthDate.setData_date17(data_date17);
        userHealthDate.setData_date18(data_date18);
        userHealthDate.setData_date19(data_date19);
        userHealthDate.setData_date20(data_date20);
        userHealthDate.setData_date21(data_date21);
        userHealthDate.setData_date22(data_date22);
        userHealthDate.setData_date23(data_date23);
        userHealthDate.setData_date24(data_date24);
        userHealthDate.setData_date25(data_date25);
        userHealthDate.setData_date26(data_date26);
        userHealthDate.setData_date27(data_date27);
        userHealthDate.setData_date28(data_date28);
        userHealthDate.setData_date29(data_date29);
        userHealthDate.setData_date30(data_date30);
        userHealthDate.setData_date31(data_date31);
        userHealthDate.setData_date32(data_date32);
        userHealthDate.setData_date33(data_date33);
        userHealthDate.setData_date34(data_date34);
        userHealthDate.setData_date35(data_date35);
        userHealthDate.setData_date36(data_date36);
        userHealthDate.setData_date37(data_date37);
        userHealthDate.setData_date38(data_date38);
        userHealthDate.setData_date39(data_date39);
        userHealthDate.setData_date40(data_date40);
        userHealthDate.setData_date41(data_date41);
        userHealthDate.setData_date42(data_date42);
        userHealthDate.setData_date43(data_date43);
        userHealthDate.setData_date44(data_date44);
        userHealthDate.setData_date45(data_date45);
        userHealthDate.setData_date46(data_date46);
        userHealthDate.setData_date47(data_date47);
        userHealthDate.setData_date48(data_date48);
        userHealthDate.setData_date49(data_date49);
        userHealthDate.setData_date50(data_date50);
        userHealthDate.setData_value1(data_value1);
        userHealthDate.setData_value2(data_value2);
        userHealthDate.setData_value3(data_value3);
        userHealthDate.setData_value4(data_value4);
        userHealthDate.setData_value5(data_value5);
        userHealthDate.setData_value6(data_value6);
        userHealthDate.setData_value7(data_value7);
        userHealthDate.setData_value8(data_value8);
        userHealthDate.setData_value9(data_value9);
        userHealthDate.setData_value10(data_value10);
        userHealthDate.setData_value11(data_value11);
        userHealthDate.setData_value12(data_value12);
        userHealthDate.setData_value13(data_value13);
        userHealthDate.setData_value14(data_value14);
        userHealthDate.setData_value15(data_value15);
        userHealthDate.setData_value16(data_value16);
        userHealthDate.setData_value17(data_value17);
        userHealthDate.setData_value18(data_value18);
        userHealthDate.setData_value19(data_value19);
        userHealthDate.setData_value20(data_value20);
        userHealthDate.setData_value21(data_value21);
        userHealthDate.setData_value22(data_value22);
        userHealthDate.setData_value23(data_value23);
        userHealthDate.setData_value24(data_value24);
        userHealthDate.setData_value25(data_value25);
        userHealthDate.setData_value26(data_value26);
        userHealthDate.setData_value27(data_value27);
        userHealthDate.setData_value28(data_value28);
        userHealthDate.setData_value29(data_value29);
        userHealthDate.setData_value30(data_value30);
        userHealthDate.setData_value31(data_value31);
        userHealthDate.setData_value32(data_value32);
        userHealthDate.setData_value33(data_value33);
        userHealthDate.setData_value34(data_value34);
        userHealthDate.setData_value35(data_value35);
        userHealthDate.setData_value36(data_value36);
        userHealthDate.setData_value37(data_value37);
        userHealthDate.setData_value38(data_value38);
        userHealthDate.setData_value39(data_value39);
        userHealthDate.setData_value40(data_value40);
        userHealthDate.setData_value41(data_value41);
        userHealthDate.setData_value42(data_value42);
        userHealthDate.setData_value43(data_value43);
        userHealthDate.setData_value44(data_value44);
        userHealthDate.setData_value45(data_value45);
        userHealthDate.setData_value46(data_value46);
        userHealthDate.setData_value47(data_value47);
        userHealthDate.setData_value48(data_value48);
        userHealthDate.setData_value49(data_value49);
        userHealthDate.setData_value50(data_value50);
        userHealthDate.setHealth_color(health_color);
        userHealthDate.setRemarks(remarks);
        userHealthDate.setShow_type(show_type);
        userHealthDate.setIscollect(iscollect);
        userService.updateUserHealthData(userHealthDate);


        return "userAction/updateHealthData";
    }


}






