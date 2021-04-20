package com.turing.ppm.service.impl;


import com.turing.ppm.entity.QuoteDetail;
import com.turing.ppm.entity.QuoteDetailExample;
import com.turing.ppm.mapper.QuoteDetailMapper;
import com.turing.ppm.service.QuoteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteDetailServiceImpl implements QuoteDetailService {
    @Autowired
    private QuoteDetailMapper  quoteDetailMapper;
    @Override
    public List<QuoteDetail> selectById(Integer id) {
        QuoteDetailExample example=new QuoteDetailExample();
        example.createCriteria().andQuoteIdEqualTo(id);
        return quoteDetailMapper.selectByExample(example);
    }

    @Override
    public int updateDetail(QuoteDetail quoteDetail) {
        return quoteDetailMapper.updateByPrimaryKeySelective(quoteDetail);
    }

    @Override
    public int deleteDetail(Integer id) {
        QuoteDetailExample example=new QuoteDetailExample();
        example.createCriteria().andQuoteIdEqualTo(id);
        return quoteDetailMapper.deleteByExample(example);
    }

    @Override
    public int addDetail(QuoteDetail quoteDetail) {
        return quoteDetailMapper.insertSelective(quoteDetail);
    }
}
