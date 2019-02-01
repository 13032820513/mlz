package com.mlz.mapper;

import com.mlz.entity.pojo.MerchantUser;
import com.mlz.entity.pojo.MerchantUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantUserMapper {
    long countByExample(MerchantUserExample example);

    int deleteByExample(MerchantUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantUser record);

    int insertSelective(MerchantUser record);

    List<MerchantUser> selectByExample(MerchantUserExample example);

    MerchantUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantUser record, @Param("example") MerchantUserExample example);

    int updateByExample(@Param("record") MerchantUser record, @Param("example") MerchantUserExample example);

    int updateByPrimaryKeySelective(MerchantUser record);

    int updateByPrimaryKey(MerchantUser record);
}