package com.mlz.mapper;

import com.mlz.entity.pojo.OperationLog;
import com.mlz.entity.pojo.OperationLogExample;
import com.mlz.entity.pojo.OperationLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationLogMapper {
    long countByExample(OperationLogExample example);

    int deleteByExample(OperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLogWithBLOBs record);

    int insertSelective(OperationLogWithBLOBs record);

    List<OperationLogWithBLOBs> selectByExampleWithBLOBs(OperationLogExample example);

    List<OperationLog> selectByExample(OperationLogExample example);

    OperationLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationLogWithBLOBs record, @Param("example") OperationLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OperationLogWithBLOBs record, @Param("example") OperationLogExample example);

    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    int updateByPrimaryKeySelective(OperationLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OperationLogWithBLOBs record);

    int updateByPrimaryKey(OperationLog record);
}