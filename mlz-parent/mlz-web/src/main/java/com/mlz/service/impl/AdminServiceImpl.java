package com.mlz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.Admin;
import com.mlz.mapper.AdminMapper;
import com.mlz.service.AdminService;
import com.mlz.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    /**
    * @Description:   校验密码进行登陆
    * @Param: [admin]
    * @return: com.mlz.entity.Admin
    * @Author: Mr.Zhu
    * @Date: 2019/1/28
    */
    @Override
    public Admin checkPassword(Admin admin) {
        String account = admin.getAccount();
        String password = admin.getPassword();
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("account", account);
        wrapper.eq("password", Md5Util.getMd5String(password));
        admin = this.getOne(wrapper);
        return admin == null? null:admin;
    }
}
