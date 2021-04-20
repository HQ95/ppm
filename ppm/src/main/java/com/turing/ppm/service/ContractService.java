package com.turing.ppm.service;

import com.turing.ppm.entity.Contract;
import com.turing.ppm.entity.DataGrid;

/**
 * 合同表
 */
public interface ContractService {
    /**
     * 查询合同表集合
     * @param name 物资名称
     * @param num 合同编号
     * @param date1 签订日期
     * @param date2 签订日期
     * @param pageNum
     * @param pageSize
     * @return
     */
    DataGrid selectList(String name, String num, String date1, String date2, Integer pageNum, Integer pageSize);

    /**
     * 根据id查询合同表信息
     * @param id
     * @return
     */
    Contract selectByid(Integer id);
}
