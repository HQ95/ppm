package com.turing.ppm.mapper;

import com.turing.ppm.entity.Enquire;
import com.turing.ppm.entity.EnquireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnquireMapper {
    int countByExample(EnquireExample example);

    int deleteByExample(EnquireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Enquire record);

    int insertSelective(Enquire record);

    List<Enquire> selectByExample(EnquireExample example);

    Enquire selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Enquire record, @Param("example") EnquireExample example);

    int updateByExample(@Param("record") Enquire record, @Param("example") EnquireExample example);

    int updateByPrimaryKeySelective(Enquire record);

    int updateByPrimaryKey(Enquire record);
}