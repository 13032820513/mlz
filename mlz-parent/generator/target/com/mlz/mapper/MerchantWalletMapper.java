package com.mlz.mapper;

import com.mlz.entity.pojo.MerchantWallet;
import com.mlz.entity.pojo.MerchantWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantWalletMapper {
    long countByExample(MerchantWalletExample example);

    int deleteByExample(MerchantWalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantWallet record);

    int insertSelective(MerchantWallet record);

    List<MerchantWallet> selectByExample(MerchantWalletExample example);

    MerchantWallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantWallet record, @Param("example") MerchantWalletExample example);

    int updateByExample(@Param("record") MerchantWallet record, @Param("example") MerchantWalletExample example);

    int updateByPrimaryKeySelective(MerchantWallet record);

    int updateByPrimaryKey(MerchantWallet record);
}