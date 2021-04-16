package com.turing.ppm.service;

import com.turing.ppm.entity.SuppMaterial;

/**
 * 供应商对于产品表
 */
public interface SuppMaterialService {
    /**
     * 添加供应商对于产品表
     * @return
     */
    int addSm(SuppMaterial sm);

}
