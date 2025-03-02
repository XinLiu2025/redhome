package com.rems.boot.config;

import com.rems.boot.config.interceptors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 登录页面映射
        registry.addViewController("/").setViewName("rems-front/login");
        registry.addViewController("/login.html").setViewName("rems-front/login");
        // 注册页面映射
        registry.addViewController("/toRegister").setViewName("rems-front/register");
        registry.addViewController("/back").setViewName("rems-back/index");
        registry.addViewController("/iframe").setViewName("rems-back/rems-core/iframe");
        registry.addViewController("/course01").setViewName("rems-back/rems-course-learning-manage/course-learning-01");
        registry.addViewController("/course02").setViewName("rems-back/rems-course-learning-manage/course-learning-02");
        registry.addViewController("/course03").setViewName("rems-back/rems-course-learning-manage/course-learning-03");
        registry.addViewController("/course04").setViewName("rems-back/rems-course-learning-manage/course-learning-04");
        registry.addViewController("/course05").setViewName("rems-back/rems-course-learning-manage/course-learning-05");
        registry.addViewController("/course06").setViewName("rems-back/rems-course-learning-manage/course-learning-06");
        registry.addViewController("/course07").setViewName("rems-back/rems-course-learning-manage/course-learning-07");
        registry.addViewController("/course08").setViewName("rems-back/rems-course-learning-manage/course-learning-08");
        registry.addViewController("/course09").setViewName("rems-back/rems-course-learning-manage/course-learning-09");
        registry.addViewController("/course10").setViewName("rems-back/rems-course-learning-manage/course-learning-10");
        registry.addViewController("/course11").setViewName("rems-back/rems-course-learning-manage/course-learning-11");
        registry.addViewController("/course12").setViewName("rems-back/rems-course-learning-manage/course-learning-12");
        registry.addViewController("/course13").setViewName("rems-back/rems-course-learning-manage/course-learning-13");
        registry.addViewController("/course14").setViewName("rems-back/rems-course-learning-manage/course-learning-14");
        registry.addViewController("/course15").setViewName("rems-back/rems-course-learning-manage/course-learning-15");
//        详细信息
        registry.addViewController("/001").setViewName("rems-back/rems-course-learning-manage/xiangxi/001");
        registry.addViewController("/002").setViewName("rems-back/rems-course-learning-manage/xiangxi/002");
        registry.addViewController("/003").setViewName("rems-back/rems-course-learning-manage/xiangxi/003");
        registry.addViewController("/004").setViewName("rems-back/rems-course-learning-manage/xiangxi/004");
        registry.addViewController("/005").setViewName("rems-back/rems-course-learning-manage/xiangxi/005");
        registry.addViewController("/006").setViewName("rems-back/rems-course-learning-manage/xiangxi/006");
        registry.addViewController("/007").setViewName("rems-back/rems-course-learning-manage/xiangxi/007");
        registry.addViewController("/008").setViewName("rems-back/rems-course-learning-manage/xiangxi/008");
        registry.addViewController("/009").setViewName("rems-back/rems-course-learning-manage/xiangxi/009");
        registry.addViewController("/010").setViewName("rems-back/rems-course-learning-manage/xiangxi/010");
        registry.addViewController("/011").setViewName("rems-back/rems-course-learning-manage/xiangxi/011");
        registry.addViewController("/012").setViewName("rems-back/rems-course-learning-manage/xiangxi/012");
        registry.addViewController("/013").setViewName("rems-back/rems-course-learning-manage/xiangxi/013");
        registry.addViewController("/014").setViewName("rems-back/rems-course-learning-manage/xiangxi/014");
        registry.addViewController("/015").setViewName("rems-back/rems-course-learning-manage/xiangxi/015");
        
        registry.addViewController("/rems-user-manage-list").setViewName("rems-back/rems-user-manage/rems-user-manage-list");
        registry.addViewController("/rems-admin-manage-list").setViewName("rems-back/rems-user-manage/rems-admin-manage-list");
        registry.addViewController("/rems-user-info").setViewName("rems-back/rems-user-manage/rems-user-info");
        registry.addViewController("/rems-modify-password").setViewName("rems-back/rems-user-manage/rems-modify-password");
        registry.addViewController("/rems-course-learning-manage-list").setViewName("rems-back/rems-course-learning-manage/rems-course-learning-manage-list");
        registry.addViewController("/rems-question-manage-list").setViewName("rems-back/rems-question-manage/rems-question-manage-list");
        registry.addViewController("/rems-popular-nav-manage-list").setViewName("rems-back/rems-popular-nav-manage/rems-popular-nav-manage-list");
        registry.addViewController("/rems-message-manage-list").setViewName("rems-back/rems-message-manage/rems-message-manage-list");

        registry.addViewController("/course-learning").setViewName("rems-back/rems-course-learning-manage/course-learning");
    
        System.out.println("所有的试图添加完成。。。");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
            // 拦截规则 ，拦截那些路径
            .addPathPatterns("/**")
            // 那些路径不拦截
            .excludePathPatterns(
                    "/",
                    "/login",
                    "/error",
                    "/index",
                    "/toRegister",
                    "/register",
                    "/static/**",
                    "/css/**",
                    "/images/**",
                    "/js/**",
                    "/layui/**",
                    "/jquery/**",
                    "/md5/**",
                    "/bootstrap/**",
                    "/**/**/*.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
