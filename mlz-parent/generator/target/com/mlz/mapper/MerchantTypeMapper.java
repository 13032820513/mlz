package com.mlz.mapper;

import com.mlz.entity.pojo.MerchantType;
import com.mlz.entity.pojo.MerchantTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantTypeMapper {
    long countByExample(MerchantTypeExample example);

    int deleteByExample(MerchantTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantType record);

    int insertSelective(MerchantType record);

    List<MerchantType> selectByExample(MerchantTypeExample example);

    MerchantType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantType record, @Param("example") MerchantTypeExample example);

    int updateByExample(@Param("record") MerchantType record, @Param("example") MerchantTypeExample example);

    int updateByPrimaryKeySelective(MerchantType record);

    int updateByPrimaryKey(MerchantType record);
}