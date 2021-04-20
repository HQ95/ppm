package com.turing.ppm.mapper;

import com.turing.ppm.entity.ContractDetail;
import com.turing.ppm.entity.ContractDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ContractDetailMapper {
    int countByExample(ContractDetailExample example);

    int deleteByExample(ContractDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractDetail record);

    int insertSelective(ContractDetail record);

    List<ContractDetail> selectByExample(ContractDetailExample example);

    ContractDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractDetail record, @Param("example") ContractDetailExample example);

    int updateByExample(@Param("record") ContractDetail record, @Param("example") ContractDetailExample example);

    int updateByPrimaryKeySelective(ContractDetail record);

    int updateByPrimaryKey(ContractDetail record);

    /**
     * 根据合同表的序号查询合同明细表的信息
     * @param contId 合同序号
     * @return
     */
    List<ContractDetail> selectByContId(@Param("contId") Integer contId);

}