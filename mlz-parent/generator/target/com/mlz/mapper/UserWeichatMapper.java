package com.mlz.mapper;

import com.mlz.entity.pojo.UserWeichat;
import com.mlz.entity.pojo.UserWeichatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeichatMapper {
    long countByExample(UserWeichatExample example);

    int deleteByExample(UserWeichatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWeichat record);

    int insertSelective(UserWeichat record);

    List<UserWeichat> selectByExampleWithBLOBs(UserWeichatExample example);

    List<UserWeichat> selectByExample(UserWeichatExample example);

    UserWeichat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWeichat record, @Param("example") UserWeichatExample example);

    int updateByExampleWithBLOBs(@Param("record") UserWeichat record, @Param("example") UserWeichatExample example);

    int updateByExample(@Param("record") UserWeichat record, @Param("example") UserWeichatExample example);

    int updateByPrimaryKeySelective(UserWeichat record);

    int updateByPrimaryKeyWithBLOBs(UserWeichat record);

    int updateByPrimaryKey(UserWeichat record);
}