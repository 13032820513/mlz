package com.mlz.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mlz.entity.pojo.Admin;
import com.mlz.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class AdminAction {
    @Autowired
    private AdminServiceImpl adminService;
    /** 
    * @Description: 用户密码检验和登陆,验证成功跳转到首页
    * @Param: [admin, model] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/1/25 
    */ 
    @RequestMapping(value = "/login")
    public String index(Admin admin, Model model){
        try {
            admin = adminService.checkPassword(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (admin == null){
            return "redirect:/";
        }
        model.addAttribute("admin", admin);
        return "index";
    }

    /**
    * @Description:  管理员用户列表
    * @Param: [model]
    * @return: java.lang.String
    * @Author: Mr.Zhu
    * @Date: 2019/1/30
    */
    @RequestMapping("/admin/index")
    public String adminIndex(Model model){
        Page<Admin> page = new Page<>();
        IPage<Admin> admins = adminService.page(page);
        model.addAttribute("admins",admins);
        System.out.println(admins);
        return "admin/index";
    }

}
