package com.turing.ppm.service.impl;

import com.turing.ppm.entity.Supplier;
import com.turing.ppm.entity.SupplierExample;
import com.turing.ppm.mapper.SupplierMapper;
import com.turing.ppm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public Supplier selectByName(Integer id) {
        SupplierExample example=new SupplierExample();
        example.createCriteria().andUserIdEqualTo(id);
        List<Supplier> list = supplierMapper.selectByExample(example);
        return list.size()>0?list.get(0):null;
    }
}
