package com.mlz.config.security;

import com.mlz.entity.pojo.Admin;
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

    /* 
    * @Description: 重写获取用户的方法
    * @Param: [username] 
    * @return: org.springframework.security.core.userdetails.UserDetails 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/13 
    */ 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminService.getAdminAndRoleByName(username);
        System.out.println("当前登陆用户的信息为admin====："+ admin);
        if (admin == null)
            throw new UsernameNotFoundException("用户名不存在");
        return admin;
    }
}
