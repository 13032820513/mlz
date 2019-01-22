package com.mlz.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/")
public class AdminAction {
    @RequestMapping("/")
    public String demoTest(Map<String, Object> model) {
        model.put("time", 548974561);
        model.put("name", "obsidian");
        model.put("qq", "450663584");
        model.put("message", "测试 Spring Boot 集成 Beetl");
        return "beetl_demo";
    }
}
