package com.turing.ppm.mapper;

import com.turing.ppm.entity.SysMenus;
import com.turing.ppm.entity.SysMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenusMapper {
    int countByExample(SysMenusExample example);

    int deleteByExample(SysMenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenus record);

    int insertSelective(SysMenus record);

    List<SysMenus> selectByExample(SysMenusExample example);

    SysMenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenus record, @Param("example") SysMenusExample example);

    int updateByExample(@Param("record") SysMenus record, @Param("example") SysMenusExample example);

    int updateByPrimaryKeySelective(SysMenus record);

    int updateByPrimaryKey(SysMenus record);
}