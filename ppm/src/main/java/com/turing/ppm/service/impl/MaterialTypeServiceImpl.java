package com.turing.ppm.service.impl;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.MaterialType;
import com.turing.ppm.mapper.MaterialTypeMapper;
import com.turing.ppm.service.MaterialTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialTypeServiceImpl implements MaterialTypeService {
    @Autowired
    private MaterialTypeMapper materialTypeMapper;

    @Override
    public List<MaterialType> selectType() {
        return materialTypeMapper.selectByExample(null);
    }

    @Override
    public int addType(MaterialType type) {
        return materialTypeMapper.insertSelective(type);
    }

    @Override
    public int deleteType(int id) {
        return materialTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public DataGrid selectPage(Integer id, String type, Integer pageNum, Integer pageSize) {
        List<MaterialType> mt = materialTypeMapper.selectListCount(id,type);
        List<MaterialType> materialTypes = materialTypeMapper.selectListPage(id, type, pageNum, pageSize);
        return new DataGrid(mt.size(), materialTypes);
    }
}
