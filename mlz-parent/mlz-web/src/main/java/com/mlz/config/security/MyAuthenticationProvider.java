/*
package com.mlz.config.security;

import com.mlz.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

*/
/**
 * @program: mlz-parent
 * @description:
 * @author: Mr.Zhu
 * @create: 2019-02-13 16:43
 **//*

public class MyAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    AdminDetailService adminDetailService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        System.out.println("前端传过来的明文密码:" + password);
        System.out.println("加密后的密码:" + Md5Util.getMd5String(password));
        UserDetails user = adminDetailService.loadUserByUsername(username);

        //加密过程在这里体现
        System.out.println("查询出来的数据库存储密码:" + user.getPassword());
        if (!user.getPassword().equals(Md5Util.getMd5String(password))) {
            throw new DisabledException("Wrong password.");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        //判断传进来的 authentication 是不是该 AuthenticationProvider 能够处理的类型。
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
*/
