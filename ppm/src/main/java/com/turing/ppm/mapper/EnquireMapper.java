package com.turing.ppm.mapper;

import com.turing.ppm.entity.Enquire;
import com.turing.ppm.entity.EnquireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnquireMapper {
    int countByExample(EnquireExample example);

    int deleteByExample(EnquireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Enquire record);

    int insertSelective(Enquire record);

    List<Enquire> selectByExample(EnquireExample example);

    Enquire selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Enquire record, @Param("example") EnquireExample example);

    int updateByExample(@Param("record") Enquire record, @Param("example") EnquireExample example);

    int updateByPrimaryKeySelective(Enquire record);

    int updateByPrimaryKey(Enquire record);

    /**
     * 获取询价表信息（已经报价的就不需要在显示了）
     * @param id 供应商序号
     * @param enquireNum  询价书编号
     * @param enquireName 询价书名称
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Enquire> selectEnquireList(@Param("id") Integer id,@Param("enquireNum") String enquireNum,@Param("enquireName")String enquireName,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);


    /**
     * 获取总数量（已经报价的就不需要在显示了）
     * @param id 供应商序号
     * @param enquireNum  询价书编号
     * @param enquireName 询价书名称
     * @return
     */
    List<Enquire> selectEnquireCount(@Param("id") Integer id,@Param("enquireNum") String enquireNum,@Param("enquireName")String enquireName);

}