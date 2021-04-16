package com.turing.ppm.mapper;

import com.turing.ppm.entity.Quote;
import com.turing.ppm.entity.QuoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuoteMapper {
    int countByExample(QuoteExample example);

    int deleteByExample(QuoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Quote record);

    int insertSelective(Quote record);

    List<Quote> selectByExample(QuoteExample example);

    Quote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Quote record, @Param("example") QuoteExample example);

    int updateByExample(@Param("record") Quote record, @Param("example") QuoteExample example);

    int updateByPrimaryKeySelective(Quote record);

    int updateByPrimaryKey(Quote record);
}