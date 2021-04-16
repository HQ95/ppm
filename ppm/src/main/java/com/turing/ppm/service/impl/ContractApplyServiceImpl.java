package com.turing.ppm.service.impl;

import com.turing.ppm.entity.ContractApply;
import com.turing.ppm.mapper.ContractApplyMapper;
import com.turing.ppm.service.ContractApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractApplyServiceImpl implements ContractApplyService {
   @Autowired
    private ContractApplyMapper contractApplyMapper;

    @Override
    public List<ContractApply> selectBy() {
        return null;
    }
}
