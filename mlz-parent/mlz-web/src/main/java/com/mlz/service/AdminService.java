package com.mlz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mlz.entity.pojo.Admin;

import java.util.List;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
public interface AdminService extends IService<Admin> {


    Admin checkPassword(Admin admin) throws Exception;

    IPage<Admin> selectAdminListPage(Page<Admin> page, Admin admin);
    
    /** 
    * @Description: 一对多分页查询用户及响应的权限
    * @Param: [] 
    * @return: java.util.List<com.mlz.entity.pojo.Admin> 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/15 
    */ 
    List<Admin> selectAdminAndRolePage();
}
