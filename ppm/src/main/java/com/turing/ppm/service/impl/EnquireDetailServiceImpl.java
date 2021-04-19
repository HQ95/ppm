package com.turing.ppm.service.impl;

import com.turing.ppm.entity.EnquireDetail;
import com.turing.ppm.entity.EnquireDetailExample;
import com.turing.ppm.mapper.EnquireDetailMapper;
import com.turing.ppm.service.EnquireDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnquireDetailServiceImpl implements EnquireDetailService {
    @Autowired
    private EnquireDetailMapper enquireDetailMapper;
    @Override
    public List<EnquireDetail> selectByEid(Integer id) {
        EnquireDetailExample example=new EnquireDetailExample();
        example.createCriteria().andEnquireIdEqualTo(id);
        return  enquireDetailMapper.selectByExample(example);
    }
}
