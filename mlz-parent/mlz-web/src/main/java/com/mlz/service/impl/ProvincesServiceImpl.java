package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.Provinces;
import com.mlz.mapper.ProvincesMapper;
import com.mlz.service.ProvincesService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 区县行政编码字典表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class ProvincesServiceImpl extends ServiceImpl<ProvincesMapper, Provinces> implements ProvincesService {

}
