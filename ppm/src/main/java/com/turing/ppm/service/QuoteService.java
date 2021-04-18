package com.turing.ppm.service;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Quote;

import java.util.List;

public interface QuoteService {
    /**
     * 根据供应商编号查询报价表集合
     */
   DataGrid selectList(Integer id, String title, String eTitle, Integer pageNum, Integer pageSize);

    /**
     * 删除报价
     * @param ids
     * @return
     */
   int delQuote(String [] ids);

    /**
     * 根据id查询报价书
     * @param id
     * @return
     */
   Quote selectQuote(Integer id);

    /**
     * 修改报价书
     * @param quote
     * @return
     */
   int updateQuote(Quote quote);
}
