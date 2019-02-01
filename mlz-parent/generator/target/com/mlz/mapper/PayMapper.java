package com.mlz.mapper;

import com.mlz.entity.pojo.Pay;
import com.mlz.entity.pojo.PayExample;
import com.mlz.entity.pojo.PayWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMapper {
    long countByExample(PayExample example);

    int deleteByExample(PayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayWithBLOBs record);

    int insertSelective(PayWithBLOBs record);

    List<PayWithBLOBs> selectByExampleWithBLOBs(PayExample example);

    List<Pay> selectByExample(PayExample example);

    PayWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayWithBLOBs record, @Param("example") PayExample example);

    int updateByExampleWithBLOBs(@Param("record") PayWithBLOBs record, @Param("example") PayExample example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByPrimaryKeySelective(PayWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PayWithBLOBs record);

    int updateByPrimaryKey(Pay record);
}