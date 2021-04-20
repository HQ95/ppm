package com.turing.ppm.service.impl;

import com.turing.ppm.entity.Contract;
import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.mapper.ContractMapper;
import com.turing.ppm.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;
    @Override
    public DataGrid selectList(String name, String num, String date1, String date2, Integer pageNum, Integer pageSize) {
        List<Contract> list = contractMapper.selectContractCount(name, num, date1, date2);
        List<Contract> contracts= contractMapper.selectContractList(name, num, date1, date2, pageNum, pageSize);
        return new DataGrid(list.size(), contracts);
    }

    @Override
    public Contract selectByid(Integer id) {
        return contractMapper.selectByPrimaryKey(id);
    }
}
