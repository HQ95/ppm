package com.turing.ppm.service;

import com.turing.ppm.entity.Quote;

import java.util.List;

public interface QuoteService {
    /**
     * 根据供应商编号查询报价表集合
     * @param id 供应商编号
     * @return
     */
    List<Quote> seletBySupplierId(Integer id);
}
