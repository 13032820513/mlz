package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.Pay;
import com.mlz.mapper.PayMapper;
import com.mlz.service.PayService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 第三方支付记录及回调表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, Pay> implements PayService {

}
