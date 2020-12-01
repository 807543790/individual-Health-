package com.zhangbin.controller;

import com.zhangbin.pojo.UserHealthDate;
import com.zhangbin.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/22-14:06
 */
//用户操作业务
@Controller
public class BusinessController {
    @Autowired
    UserService userService;


//  添加用户健康数据
    @RequestMapping("/addHealthData")
    public String addHealthData(String health_scope_min, String health_scope_max, @Param("health_name") String health_name, String remarks, HttpSession session,
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
        userHealthDate.setUser_id((Integer) session.getAttribute("id"));
        userHealthDate.setRemarks(remarks);
        userService.addUserHealthData(userHealthDate);


        return "userAction/charts";
    }



    //  跳转至添加健康数据
    @RequestMapping("/toaddhealth")
    public String toaddhealth( ){
        return "userAction/addhealthdata";
    }



}
