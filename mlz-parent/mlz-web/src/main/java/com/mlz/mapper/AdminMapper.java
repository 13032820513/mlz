package com.mlz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mlz.entity.example.AdminExample;
import com.mlz.entity.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
public interface AdminMapper extends BaseMapper<Admin> {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    // 根据用户名查询用户信息和对应的角色信息，一对多查询
    Admin selectAdminAndRoleByAccount(String username);
}
