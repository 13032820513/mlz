package com.mlz.config.security;

import com.mlz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
        SysUser admin = adminService.getAdminAndRoleByName(username);
        if (admin == null)
            throw new UsernameNotFoundException("用户名不存在");
        return admin;
    }
}
