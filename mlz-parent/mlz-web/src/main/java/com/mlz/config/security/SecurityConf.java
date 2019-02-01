package com.mlz.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @program: mlz-parent
 * @description: spring security 额外配置
 * @author: Mr.Zhu
 * @create: 2019-02-01 09:06
 **/
@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter {
    //注册用户查询的方法
    @Bean
    UserDetailsService customerUserService(){
        return new AdminDetailService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //取消继承父类配置，自己重新配置
//        super.configure(http);
        http
            .authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .formLogin()
                .loginPage("/")
                .permitAll()
            .and()
            .logout()
                .permitAll();
    }
}
