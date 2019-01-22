package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.Admin;
import com.mlz.mapper.AdminMapper;
import com.mlz.service.AdminService;
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
}
