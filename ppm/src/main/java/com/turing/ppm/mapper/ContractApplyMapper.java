package com.turing.ppm.mapper;

import com.turing.ppm.entity.ContractApply;
import com.turing.ppm.entity.ContractApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractApplyMapper {
    int countByExample(ContractApplyExample example);

    int deleteByExample(ContractApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractApply record);

    int insertSelective(ContractApply record);

    List<ContractApply> selectByExample(ContractApplyExample example);

    ContractApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractApply record, @Param("example") ContractApplyExample example);

    int updateByExample(@Param("record") ContractApply record, @Param("example") ContractApplyExample example);

    int updateByPrimaryKeySelective(ContractApply record);

    int updateByPrimaryKey(ContractApply record);
}