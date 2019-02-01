package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.Attribute;
import com.mlz.mapper.AttributeMapper;
import com.mlz.service.AttributeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class AttributeServiceImpl extends ServiceImpl<AttributeMapper, Attribute> implements AttributeService {

}
