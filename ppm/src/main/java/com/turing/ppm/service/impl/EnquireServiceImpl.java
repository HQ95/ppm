package com.turing.ppm.service.impl;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Enquire;
import com.turing.ppm.entity.EnquireExample;
import com.turing.ppm.mapper.EnquireMapper;
import com.turing.ppm.service.EnquireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnquireServiceImpl implements EnquireService {
    @Autowired
    private EnquireMapper enquireMapper;
    @Override
    public DataGrid selectList(Integer id, String enquireNum, String enquireName, Integer pageNum, Integer pageSize) {
        List<Enquire> list = enquireMapper.selectEnquireCount(id, enquireNum, enquireName);
        List<Enquire> enquires = enquireMapper.selectEnquireList(id, enquireNum, enquireName, pageNum, pageSize);
        return new DataGrid(list.size(), enquires);
    }

    @Override
    public Enquire selectById(Integer id) {
        return enquireMapper.selectByPrimaryKey(id);
    }
}
