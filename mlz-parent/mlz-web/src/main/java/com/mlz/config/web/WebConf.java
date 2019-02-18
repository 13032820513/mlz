package com.mlz.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: mlz-parent
 * @description: web相关的配置(该类不用继承WebMvcConfigurerAdapter,可以直接实现WebMvcConfigurer接口)
 * @author: Mr.Zhu
 * @create: 2019-02-01 09:43
 **/
@Configuration
public class WebConf implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 注册访问/,/login专项login.html页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index/info").setViewName("info");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        允许所有的跨域请求
        registry.addMapping("/**");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义的拦截器类
    }
}
