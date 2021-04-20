package com.turing.ppm.service.impl;

import com.turing.ppm.entity.ContractDetail;
import com.turing.ppm.mapper.ContractDetailMapper;
import com.turing.ppm.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractDetailServiceImpl implements ContractDetailService {
   @Autowired
    private ContractDetailMapper contractDetailMapper;

    @Override
    public List<ContractDetail> selectDetailByConId(Integer id) {
        return contractDetailMapper.selectByContId(id);
    }
}
