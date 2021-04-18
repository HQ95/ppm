package com.turing.ppm.service.impl;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Quote;
import com.turing.ppm.entity.QuoteExample;
import com.turing.ppm.mapper.QuoteMapper;
import com.turing.ppm.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    private QuoteMapper quoteMapper;

    @Override
    public DataGrid selectList(Integer id, String title, String eTitle, Integer pageNum, Integer pageSize) {
        List<Quote> list = quoteMapper.selectQuoteListCount(id, title, eTitle);
        List<Quote> quotes = quoteMapper.selectQuoteList(id, title, eTitle, pageNum, pageSize);
        return new DataGrid(list.size(), quotes);
    }

    @Override
    public int delQuote(String[] ids) {
        return quoteMapper.deleteQuote(ids);
    }

    @Override
    public Quote selectQuote(Integer id) {
        return quoteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateQuote(Quote quote) {
        return quoteMapper.updateByPrimaryKeySelective(quote);
    }
}
