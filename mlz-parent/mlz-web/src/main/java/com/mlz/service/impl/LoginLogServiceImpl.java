package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.LoginLog;
import com.mlz.mapper.LoginLogMapper;
import com.mlz.service.LoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录记录 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
