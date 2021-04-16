package com.turing.ppm.service;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Material;

import java.util.List;

/**
 * 物资信息
 */
public interface MaterialService {
    /**
     * 根据用户名序号查询物资信息
     * @param id
     * @return
     */
    DataGrid selectList(Integer id, String mid, String name, String sort, String order,Integer pageNum, Integer pageSize);

    /**
     * 修改物资信息
     * @param material
     * @return
     */
    int updateMaterial(Material material);

    /**
     * 删除物资信息
     * @param ids
     * @return
     */
    int deleteMaterial(String[]ids);

    /**
     * 添加物资信息
     * @param material
     * @return
     */
    int addMaterial(Material material);
}
