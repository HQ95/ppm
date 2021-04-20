package com.turing.ppm.service;

import com.turing.ppm.entity.ContractDetail;

import java.util.List;

/**
 * 合同明细表
 */
public interface ContractDetailService {
    /**
     * 根据合同表id查看合同明细表
     * @param id
     * @return
     */
    List<ContractDetail> selectDetailByConId(Integer id);
}
