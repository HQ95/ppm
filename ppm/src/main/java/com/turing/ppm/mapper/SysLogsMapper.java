package com.turing.ppm.mapper;

import com.turing.ppm.entity.SysLogs;
import com.turing.ppm.entity.SysLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogsMapper {
    int countByExample(SysLogsExample example);

    int deleteByExample(SysLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLogs record);

    int insertSelective(SysLogs record);

    List<SysLogs> selectByExample(SysLogsExample example);

    SysLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLogs record, @Param("example") SysLogsExample example);

    int updateByExample(@Param("record") SysLogs record, @Param("example") SysLogsExample example);

    int updateByPrimaryKeySelective(SysLogs record);

    int updateByPrimaryKey(SysLogs record);
}