package com.mlz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mlz.entity.pojo.Admin;

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
}
