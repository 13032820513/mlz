package com.mlz.controller;


import com.mlz.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@RestController
@RequestMapping("/admin")
public class AdminAction {
    @Autowired
    private AdminServiceImpl adminService;
    @RequestMapping("/login")
    public String login() {
        return adminService.getAdminById(1).toString();
    }
}
