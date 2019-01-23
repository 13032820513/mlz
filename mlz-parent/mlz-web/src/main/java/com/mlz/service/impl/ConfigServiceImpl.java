package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.Config;
import com.mlz.mapper.ConfigMapper;
import com.mlz.service.ConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements ConfigService {

}
