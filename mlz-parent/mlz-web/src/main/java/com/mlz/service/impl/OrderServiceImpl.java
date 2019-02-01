package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.Order;
import com.mlz.mapper.OrderMapper;
import com.mlz.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 下单表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
