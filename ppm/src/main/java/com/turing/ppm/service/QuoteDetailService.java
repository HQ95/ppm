package com.turing.ppm.service;

import com.turing.ppm.entity.QuoteDetail;

import java.util.List;

public interface QuoteDetailService {
    /**
     * 根据报价的id查询报价详细表
     * @param id 报价报的id
     * @return
     */
    List<QuoteDetail> selectById(Integer id);

    /**
     * 修改报价明细表
     * @param quoteDetail
     * @return
     */
    int updateDetail(QuoteDetail quoteDetail);

    /**
     * 删除报价明细表
     * @param id
     * @return
     */
    int deleteDetail(Integer id);

    /**
     * 添加报价明细表
     * @param quoteDetail
     * @return
     */
    int addDetail(QuoteDetail quoteDetail);
}
