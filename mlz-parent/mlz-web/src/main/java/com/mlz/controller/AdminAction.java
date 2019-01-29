package com.mlz.controller;


import com.mlz.entity.Admin;
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
    * @Description: 跟路径跳转到登陆页面
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/1/25 
    */ 
    @RequestMapping("/")
    public String login() {
        return "login" ;
    }

    /** 
    * @Description: 用户密码检验和登陆
    * @Param: [admin, model] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/1/25 
    */ 
    @RequestMapping("/index")
    public String index(Admin admin, Model model){
        admin = adminService.checkPassword(admin);
        if (admin == null){
            return "redirect:/";
        }
        model.addAttribute(admin);
        return "index";
    }
    @RequestMapping("index/info")
    public String info(Admin admin, Model model){

        model.addAttribute("name","zhujun");
        return "info";
    }

}
