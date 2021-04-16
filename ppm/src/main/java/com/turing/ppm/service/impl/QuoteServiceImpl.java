package com.turing.ppm.service.impl;

import com.turing.ppm.entity.Quote;
import com.turing.ppm.entity.QuoteExample;
import com.turing.ppm.mapper.QuoteMapper;
import com.turing.ppm.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    private QuoteMapper quoteMapper;
    @Override
    public List<Quote> seletBySupplierId(Integer id) {
        QuoteExample example=new QuoteExample();
        example.createCriteria().andSupplierIdEqualTo(id);
        return quoteMapper.selectByExample(example);
    }
}
