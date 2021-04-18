package com.turing.ppm.service.impl;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Material;
import com.turing.ppm.entity.MaterialExample;
import com.turing.ppm.mapper.MaterialMapper;
import com.turing.ppm.mapper.SuppMaterialMapper;
import com.turing.ppm.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;
    @Autowired
    private SuppMaterialMapper suppMaterialMapper;

    @Override
    public DataGrid selectList(Integer id, String mid, String name, String sort, String order, Integer pageNum, Integer pageSize) {
        List<Material> m = materialMapper.selectCount(id, mid, name);
        List<Material> materials= materialMapper.selectBySupplierId(id,mid,name,sort,order,pageNum,pageSize);
        DataGrid dataGrid= new DataGrid(m.size(),materials);
        return dataGrid;
    }

    @Override
    public int updateMaterial(Material material) {
        return materialMapper.updateByPrimaryKeySelective(material);
    }

    @Override
    @Transactional
    public int deleteMaterial(String [] ids) {
        suppMaterialMapper.deleteByIds(ids);
        return materialMapper.deleteIds(ids);
    }

    @Override
    public int addMaterial(Material material) {
        return materialMapper.insertSelective(material);
    }

    @Override
    public List<Material> selectByType(Integer materialType) {
        MaterialExample example=new MaterialExample();
        example.createCriteria().andMaterialTypeEqualTo(materialType.toString());
        return materialMapper.selectByExample(example);
    }
}
