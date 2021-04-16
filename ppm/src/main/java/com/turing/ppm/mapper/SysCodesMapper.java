package com.turing.ppm.mapper;

import com.turing.ppm.entity.SysCodes;
import com.turing.ppm.entity.SysCodesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodesMapper {
    int countByExample(SysCodesExample example);

    int deleteByExample(SysCodesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCodes record);

    int insertSelective(SysCodes record);

    List<SysCodes> selectByExample(SysCodesExample example);

    SysCodes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCodes record, @Param("example") SysCodesExample example);

    int updateByExample(@Param("record") SysCodes record, @Param("example") SysCodesExample example);

    int updateByPrimaryKeySelective(SysCodes record);

    int updateByPrimaryKey(SysCodes record);
}