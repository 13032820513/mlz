package com.mlz.mapper;

import com.mlz.entity.pojo.UserWallet;
import com.mlz.entity.pojo.UserWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWalletMapper {
    long countByExample(UserWalletExample example);

    int deleteByExample(UserWalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWallet record);

    int insertSelective(UserWallet record);

    List<UserWallet> selectByExample(UserWalletExample example);

    UserWallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWallet record, @Param("example") UserWalletExample example);

    int updateByExample(@Param("record") UserWallet record, @Param("example") UserWalletExample example);

    int updateByPrimaryKeySelective(UserWallet record);

    int updateByPrimaryKey(UserWallet record);
}