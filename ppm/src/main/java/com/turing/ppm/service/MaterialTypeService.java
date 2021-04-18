package com.turing.ppm.service;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.MaterialType;

import java.util.List;
/**
 * 产品类型
 */
public interface MaterialTypeService {
    /**
     * 查询所有产品类型
     * @return
     */
    public List<MaterialType> selectType();
    /**
     * 添加产品类型
     * @param type
     * @return
     */
    int addType(MaterialType type);

    /**
     * 修改产品类型
     * @param type
     * @return
     */
    int updType(MaterialType type);

    /**
     * 删除产品类型
     * @param id
     * @return
     */
    int deleteType(int id);
    /**
     * 分页查询
     * @param id 编号
     * @param type 名称
     * @param pageNum 当前页
     * @param pageSize 每页数据
     * @return
     */
    DataGrid selectPage(Integer id, String type, Integer pageNum, Integer pageSize);

}
