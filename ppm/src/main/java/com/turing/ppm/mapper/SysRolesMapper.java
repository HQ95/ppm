package com.turing.ppm.mapper;

import com.turing.ppm.entity.SysRoles;
import com.turing.ppm.entity.SysRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMapper {
    int countByExample(SysRolesExample example);

    int deleteByExample(SysRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    List<SysRoles> selectByExample(SysRolesExample example);

    SysRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    int updateByExample(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}