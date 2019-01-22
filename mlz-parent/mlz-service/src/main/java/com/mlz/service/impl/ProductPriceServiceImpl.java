package com.mlz.service.impl;

import com.mlz.entity.ProductPrice;
import com.mlz.mapper.ProductPriceMapper;
import com.mlz.service.ProductPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品价格变动记录表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class ProductPriceServiceImpl extends ServiceImpl<ProductPriceMapper, ProductPrice> implements ProductPriceService {

}
