package com.turing.ppm.service.impl;

import com.turing.ppm.entity.SuppMaterial;
import com.turing.ppm.mapper.SuppMaterialMapper;
import com.turing.ppm.service.SuppMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuppMaterialServiceImpl implements SuppMaterialService {
    @Autowired
    private SuppMaterialMapper suppMaterialMapper;

    @Override
    public int addSm(SuppMaterial sm) {
        return suppMaterialMapper.insertSelective(sm);
    }
}
