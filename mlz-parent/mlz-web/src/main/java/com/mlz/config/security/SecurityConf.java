/*
package com.mlz.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

*/
/**
 * @program: mlz-parent
 * @description: spring security 额外配置
 * @author: Mr.Zhu
 * @create: 2019-02-01 09:06
 **//*

@Configuration
//@EnableWebSecurity  spring boot自动配置已经开启security
public class SecurityConf extends WebSecurityConfigurerAdapter {
    //注册自定义的用户查询的方法
    @Bean
    UserDetailsService customerUserService(){
        return new AdminDetailService();
    }

*/
/*
    @Bean
    public AuthenticationProvider authenticationProvider() {
        AuthenticationProvider authenticationProvider = new MyAuthenticationProvider();
        return authenticationProvider;
    }
*//*



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customerUserService());
        // 注册自定义验证方法
//        auth.authenticationProvider(authenticationProvider());

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //取消继承父类配置，自己重新配置
//        super.configure(http);
        http.authorizeRequests()
                // 所有用户均可访问的资源
                .antMatchers("/static/**","/index").permitAll()
                // ROLE_USER的权限才能访问的资源
//                .antMatchers("/user/**").hasRole("USER")
                // 任何尚未匹配的URL只需要验证用户即可访问
                .anyRequest().authenticated()
                .and()
                .formLogin()
                // 指定登录页面,授予所有用户访问登录页面
                .loginPage("/")
                //设置默认登录成功跳转页面,错误回到login界面
                .defaultSuccessUrl("/index").failureUrl("/login?error").permitAll()
                .and()
                //开启cookie保存用户数据
                .rememberMe()
                //设置cookie有效期
                .tokenValiditySeconds(60 * 60 * 24 * 7)
                //设置cookie的私钥
                .key("mlz")
                .and()
                .logout().logoutUrl("/logout")
                .permitAll();
    }
}
*/
