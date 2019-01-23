package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.Relation;
import com.mlz.mapper.RelationMapper;
import com.mlz.service.RelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements RelationService {

}
