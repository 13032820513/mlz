package com.mlz.config.beetl;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.ext.web.WebRenderExt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: mlz-parent
 * @description: beetl模板全局变量自定义类
 * @author: Mr.Zhu
 * @create: 2019-01-29 14:11
 **/
public class BeetlGlobalExt implements WebRenderExt {

    public static final String STATIC_PATH = "static";

    @Override
    public void modify(Template template, GroupTemplate gt, HttpServletRequest request, HttpServletResponse response) {
        // 静态资源路径
        template.binding("staticPath",  request.getContextPath() + STATIC_PATH);
    }
}
