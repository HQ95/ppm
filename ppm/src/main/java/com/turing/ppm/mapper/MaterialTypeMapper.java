package com.turing.ppm.mapper;

import com.turing.ppm.entity.MaterialType;
import com.turing.ppm.entity.MaterialTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialTypeMapper {
    int countByExample(MaterialTypeExample example);

    int deleteByExample(MaterialTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialType record);

    int insertSelective(MaterialType record);

    List<MaterialType> selectByExample(MaterialTypeExample example);

    MaterialType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialType record, @Param("example") MaterialTypeExample example);

    int updateByExample(@Param("record") MaterialType record, @Param("example") MaterialTypeExample example);

    int updateByPrimaryKeySelective(MaterialType record);

    int updateByPrimaryKey(MaterialType record);

    /**
     * 分页查询产品类别
     * @param id
     * @param type
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<MaterialType> selectListPage(@Param("id") Integer id,@Param("type") String type,@Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize);

    /**
     * 获取产品的总数量
     * @param id
     * @param type
     * @return
     */
    List<MaterialType> selectListCount(@Param("id") Integer id,@Param("type") String type);
}