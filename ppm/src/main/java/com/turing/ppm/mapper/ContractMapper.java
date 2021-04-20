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
     * 查询合同表
     * @param name 物资名称
     * @param num 合同编号
     * @param date1 签订日期
     * @param date2 签订日期
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Contract> selectContractList(@Param("name") String name,@Param("num")String num,@Param("date1")String date1,@Param("date2")String date2,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

    /**
     * 获取合同表总数
     * @param name 物资名称
     * @param num 合同编号
     * @param date1 签订日期
     * @param date2 签订日期
     * @return
     */
    List<Contract> selectContractCount(@Param("name") String name,@Param("num")String num,@Param("date1")String date1,@Param("date2")String date2);
}