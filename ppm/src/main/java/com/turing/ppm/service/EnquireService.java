package com.turing.ppm.service;

import com.turing.ppm.entity.DataGrid;
import com.turing.ppm.entity.Enquire;


/**
 * 询价表
 */
public interface EnquireService {
    /**
     * 查询所有的询价表（当前时间<报价截止时间）
     * @return
     */
    public DataGrid selectList(Integer id, String enquireNum, String enquireName, Integer pageNum, Integer pageSize);

    /**
     * 根据询价表id查询信息
     * @param id
     * @return
     */
    Enquire selectById(Integer id);

}
