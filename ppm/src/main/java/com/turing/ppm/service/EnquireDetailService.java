package com.turing.ppm.service;

import com.turing.ppm.entity.EnquireDetail;

import java.util.List;

/**
 * 询价明细表
 */
public interface EnquireDetailService {
    /**
     * 根据询价表的id查询询价明细表的信息
     * @param id
     * @return
     */
    List<EnquireDetail> selectByEid(Integer id);
}
