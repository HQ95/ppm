package com.turing.ppm.mapper;

import com.turing.ppm.entity.IdMapping;
import com.turing.ppm.entity.IdMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdMappingMapper {
    int countByExample(IdMappingExample example);

    int deleteByExample(IdMappingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IdMapping record);

    int insertSelective(IdMapping record);

    List<IdMapping> selectByExample(IdMappingExample example);

    IdMapping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IdMapping record, @Param("example") IdMappingExample example);

    int updateByExample(@Param("record") IdMapping record, @Param("example") IdMappingExample example);

    int updateByPrimaryKeySelective(IdMapping record);

    int updateByPrimaryKey(IdMapping record);
}