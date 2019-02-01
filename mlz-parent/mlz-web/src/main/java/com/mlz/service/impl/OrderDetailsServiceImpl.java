package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.OrderDetails;
import com.mlz.mapper.OrderDetailsMapper;
import com.mlz.service.OrderDetailsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 下单商品详细 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class OrderDetailsServiceImpl extends ServiceImpl<OrderDetailsMapper, OrderDetails> implements OrderDetailsService {

}
