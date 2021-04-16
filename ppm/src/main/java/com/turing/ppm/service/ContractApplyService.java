package com.turing.ppm.service;

import com.turing.ppm.entity.ContractApply;

import java.util.List;

/**
 * 合同申请表
 */
public interface ContractApplyService {
    /**
     * 获取所有合同
     * @return
     */
    List<ContractApply> selectBy();
}
