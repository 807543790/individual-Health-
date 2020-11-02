package com.zhangbin.cogfig;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/11/2-15:37
 *
 * Shiro配置类
 */
@Configuration
public class ShiroConfig {


//  第四步
    @Bean
    //整合shiro，用来整合thymeleaf-shiro
    public ShiroDialect getshiroDialect(){
        return  new ShiroDialect();
    }


    //    @Autowired默认按照类型匹配注入bean，如果有多个实现类，搭配@Qualifier(“实现类名称”)表明注入的是哪一个实现类的bean：
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager defaultWebSecurityManager){

        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //        设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        //        添加shiro的内置过滤器
        /**
           anon:无需认证就可以访问
         * authc:必须认证才能访问
         * user：必须拥有记住我功能才能使用
         * perms:拥有对某个资源的权限才能访问
         * role：拥有某个角色权限才能访问
         * */
        //创建LinkedHashMap
        LinkedHashMap<String, String> filterMap = new LinkedHashMap<>();

        //设置拦截：第一个参数为拦截的URL，第二个参数为拦截的用户权限，正常情况下，没有授权会跳转到未授权页面
        //登录注册页面无需认证即可访问
        filterMap.put("user/login","anon");
        filterMap.put("user/register","anon");
        //主页面拦截，只有有权限为0的人才可以进入
        filterMap.put("user/index","perms[0]");

        //设置未授权页面
        bean.setUnauthorizedUrl("/noauth");

        //将设置权限MAP集合传入方法
        bean.setFilterChainDefinitionMap(filterMap);

        //设置登录页面
        bean.setLoginUrl("/toLogin");

        return bean;

    }


//  第二步
//  @Autowired默认按照类型匹配注入bean，如果有多个实现类，搭配@Qualifier(“实现类名称”)表明注入的是哪一个实现类的bean：
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
//      将realm对象传入
        securityManager.setRealm(userRealm);
        return securityManager;
    }

//  第一步:创建realm对象
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }
}
