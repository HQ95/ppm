package com.turing.ppm.mapper;

import com.turing.ppm.entity.Contract;
import com.turing.ppm.entity.ContractExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ContractMapper {
    int countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
    /**
     * 根据合同申请表的合同编号查询合同表
     * @param contNum 合同编号
     * @return
     */
    @Select("select * from contract where cont_num=#{contNum}")
    Contract selectByContNum(@Param("contNum") String contNum);
}