package com.turing.ppm.mapper;

import com.turing.ppm.entity.SuppMaterial;
import com.turing.ppm.entity.SuppMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppMaterialMapper {
    int countByExample(SuppMaterialExample example);

    int deleteByExample(SuppMaterialExample example);

    int insert(SuppMaterial record);

    int insertSelective(SuppMaterial record);

    List<SuppMaterial> selectByExample(SuppMaterialExample example);

    int updateByExampleSelective(@Param("record") SuppMaterial record, @Param("example") SuppMaterialExample example);

    int updateByExample(@Param("record") SuppMaterial record, @Param("example") SuppMaterialExample example);

    /**
     * 根据物资序号删除供应商对于产品表
     * @param mids 物资序号
     * @return
     */
    int deleteByIds(String[] mids);
}