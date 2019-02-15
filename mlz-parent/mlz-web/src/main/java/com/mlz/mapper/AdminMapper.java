package com.mlz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mlz.entity.example.AdminExample;
import com.mlz.entity.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    List<Admin> findAdminRolesList(Page<Admin> page);

    // 分页查询用户
    @Select("select a.*, r.name roleName FROM jia_admin a left join jia_role r on r.id = a.role_id")
    List<Admin> selectAdminListPage(Page<Admin> page);

}
