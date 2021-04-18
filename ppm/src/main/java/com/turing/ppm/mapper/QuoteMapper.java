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

    /**
     * 根据供应商编号查询报价表集合
     * @param id 供应商编号
     * @param title 报价书标题
     * @param eTitle 询价书标题
     * @param pageNum 当前页数
     * @param pageSize 没页数量
     * @return
     */
    List<Quote> selectQuoteList(@Param("id") Integer id,@Param("title")String title,@Param("eTitle")String eTitle,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

    /**
     * 根据供应商编号查询报价表总数量
     * @param id 供应商编号
     * @param title 报价书标题
     * @param eTitle 询价书标题
     * @return
     */
    List<Quote> selectQuoteListCount(@Param("id") Integer id,@Param("title")String title,@Param("eTitle")String eTitle);

}