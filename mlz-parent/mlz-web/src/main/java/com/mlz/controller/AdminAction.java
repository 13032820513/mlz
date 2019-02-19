package com.mlz.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mlz.common.utils.ConsoleJsonFormat;
import com.mlz.entity.pojo.Admin;
import com.mlz.entity.pojo.Role;
import com.mlz.service.impl.AdminServiceImpl;
import com.mlz.service.impl.RoleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    protected  static final Logger logger = LoggerFactory.getLogger(AdminAction.class);

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private RoleServiceImpl roleService;
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
    public String adminIndex(Model model, Admin admin){
        Page<Admin> page = new Page<>(1,10);
        adminService.selectAdminAndRolePage();
        IPage<Admin> admins = adminService.selectAdminListPage(page, admin);
        model.addAttribute("admins",admins);
        logger.info(ConsoleJsonFormat.responseFormat(JSON.toJSONString(admins)));
        return "admin/index";
    }

    /** 
    * @Description: 修改信息
    * @Param: [id] 
    * @return: java.util.Map<java.lang.String,java.lang.Object> 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/19 
    */ 
    @RequestMapping("/admin/update")
    public @ResponseBody Map<String, Object> update(Integer id){
        Map<String, Object> map = new HashMap();
        List<Role> roles = roleService.list();
        map.put("roles",roles);
        Admin admin = adminService.getById(id);
        map.put("admin",admin);
        logger.info(ConsoleJsonFormat.responseFormat(JSON.toJSONString(roles)));
        logger.info(ConsoleJsonFormat.responseFormat(JSON.toJSONString(admin)));
        return map;
    }

    /** 
    * @Description: 删除记录
    * @Param: [admin] 
    * @return: java.lang.Boolean 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/19 
    */
    @GetMapping("/admin/delete")
    public Boolean delete(Admin admin){
        admin.setDeleted(true);
        boolean result = adminService.updateById(admin);
        return result;
    }
    /** 
    * @Description: 检查用户名是否已经存在
    * @Param: [account] 
    * @return: com.mlz.entity.pojo.Admin 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/19 
    */ 
    @GetMapping("/admin/check")
    public @ResponseBody Admin checkAccount(String account){
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("account", account);
        Admin admin = adminService.getOne(wrapper);
        return admin;
    }
    /** 
    * @Description: 表单提交 添加或者更新
    * @Param: [admin] 
    * @return: java.lang.Boolean 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/19 
    */ 
    @PostMapping("/admin/save")
    public Boolean save(Admin admin){
        return adminService.saveOrUpdate(admin);
    }

}
