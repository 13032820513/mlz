package com.mlz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.Admin;
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
    * @return: com.mlz.entity.pojo.Admin
    * @Author: Mr.Zhu
    * @Date: 2019/1/28
    */
    @Override
    public Admin checkPassword(Admin admin) throws Exception {
        String account = admin.getAccount();
        String password = admin.getPassword();
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("account", account);
        admin = this.getOne(wrapper);
        // 进行密码校验
        if ((Md5Util.getMd5String(password).equals(admin.getPassword()))){
            return admin;
        }else {
            throw new Exception("密码错误！");
        }
    }
    
    /** 
    * @Description: 分页查询用户和角色信息
    * @Param: [page, admin] 
    * @return: com.baomidou.mybatisplus.core.metadata.IPage<com.mlz.entity.pojo.Admin> 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/14 
    */ 
    @Override
    public IPage<Admin> selectAdminListPage(Page<Admin> page, Admin admin) {
        return page.setRecords(adminMapper.selectAdminListPage(page));
    }
}
