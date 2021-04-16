package com.turing.ppm.mapper;

import com.turing.ppm.entity.QuoteDetail;
import com.turing.ppm.entity.QuoteDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuoteDetailMapper {
    int countByExample(QuoteDetailExample example);

    int deleteByExample(QuoteDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuoteDetail record);

    int insertSelective(QuoteDetail record);

    List<QuoteDetail> selectByExample(QuoteDetailExample example);

    QuoteDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuoteDetail record, @Param("example") QuoteDetailExample example);

    int updateByExample(@Param("record") QuoteDetail record, @Param("example") QuoteDetailExample example);

    int updateByPrimaryKeySelective(QuoteDetail record);

    int updateByPrimaryKey(QuoteDetail record);
}