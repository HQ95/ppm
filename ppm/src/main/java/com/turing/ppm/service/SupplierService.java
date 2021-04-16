package com.turing.ppm.service;

import com.turing.ppm.entity.Supplier;

/**
 * 供应商基本信息
 */
public interface SupplierService {
    /**
     * 根据登录的供应商查询该信息
     * @param id 用户序号
     * @return
     */
    Supplier selectByName(Integer id);


}
