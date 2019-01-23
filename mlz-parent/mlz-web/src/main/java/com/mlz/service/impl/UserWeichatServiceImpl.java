package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.UserWeichat;
import com.mlz.mapper.UserWeichatMapper;
import com.mlz.service.UserWeichatService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信用户表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class UserWeichatServiceImpl extends ServiceImpl<UserWeichatMapper, UserWeichat> implements UserWeichatService {

}
