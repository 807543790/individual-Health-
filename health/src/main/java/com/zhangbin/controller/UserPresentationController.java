package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
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

    //  跳转特别关注页面specialfocus
    @RequestMapping("/charts")
    public String charts(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {

        List<UserHealthDate> userHealthDate = userService.queryHealthDataById((Integer) session.getAttribute("id"));
        System.out.println(session.getAttribute("id"));
        System.out.println(userHealthDate);
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
            System.out.println(datelist);
        }
        System.out.println(userHealthDate.get(0).getId());
        System.out.println(userHealthDate.get(0).getHealth_name());



        return "userAction/charts";
    }
    //修改数据页面
    @RequestMapping("/updateHealth")
    public String updateHealth(String id){
        System.out.println(id);
        return "userAction/updateHealthData";
    }

    //  跳转特别关注页面
    @RequestMapping("/specialfocus")
    public String specialfocus(HttpSession session, Model model) {
        List<UserHealthDate> userHealthDate = userService.queryHealthDataById((Integer) session.getAttribute("id"));
        System.out.println(session.getAttribute("id"));
        System.out.println(userHealthDate);
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
            System.out.println(datelist);
        }
        System.out.println(userHealthDate.get(0).getId());
        System.out.println(userHealthDate.get(0).getHealth_name());



        return "userAction/charts";
    }


}






