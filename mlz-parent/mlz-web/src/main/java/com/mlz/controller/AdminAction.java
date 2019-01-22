package com.mlz.controller;


import com.mlz.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Controller
@RequestMapping("/admin")
public class AdminAction {
    @Autowired
    private AdminServiceImpl adminService;
    @RequestMapping("/")
    public String login() {
        return "login";
    }
}
