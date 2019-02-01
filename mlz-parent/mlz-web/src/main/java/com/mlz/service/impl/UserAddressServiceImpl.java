package com.mlz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mlz.entity.pojo.UserAddress;
import com.mlz.mapper.UserAddressMapper;
import com.mlz.service.UserAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户地址管理 服务实现类
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

}
