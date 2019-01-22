package com.mlz.service.impl;

import com.mlz.entity.MerchantUser;
import com.mlz.mapper.MerchantUserMapper;
import com.mlz.service.MerchantUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商户与用户关联表 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class MerchantUserServiceImpl extends ServiceImpl<MerchantUserMapper, MerchantUser> implements MerchantUserService {

}
