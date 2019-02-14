package com.mlz.config.security;

import com.mlz.entity.pojo.Admin;
import com.mlz.entity.pojo.Role;
import com.mlz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mlz-parent
 * @description: 重新根据用户名查询用户详情的方法
 * @author: Mr.Zhu
 * @create: 2019-02-01 09:26
 **/
public class AdminDetailService implements UserDetailsService {
    @Autowired
    private AdminService adminService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminService.getAdminAndRoleByName(username);
        System.out.println("当前登陆用户的信息为admin====："+ admin);
        if (admin == null)
            throw new UsernameNotFoundException("用户名不存在");
        List<GrantedAuthority> auths = new ArrayList<>();
        // 添加用户的所有角色  (注册当前用户的角色)  将用户的角色作为权限
        for (Role role : admin.getRoles()) {
            java.lang.System.out.println("添加用户角色role="+ role.getName());
            auths.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new User(admin.getAccount(), admin.getPassword(), auths);
    }
}
