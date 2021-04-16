package com.turing.ppm.mapper;

import com.turing.ppm.entity.Material;
import com.turing.ppm.entity.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    int countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Material record);

    int insertSelective(Material record);

    List<Material> selectByExample(MaterialExample example);

    Material selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);

    /**
     * 根据供应商编号获取所有物资信息
     * @param id 用户序号
     *@param mid 产品编号
     * @param name 产品名称
     * @param sort 排列的属性
     * @param order 排序顺序
     * @param pageNum 第几页
     * @param pageSize 每页数量
     * @return
     */
    List<Material> selectBySupplierId(@Param("id") Integer id,@Param("mid")String mid,@Param("name")String name,@Param("sort")String sort,@Param("order")String order,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);
    /**
     * 根据供应商编号获取所有物资信息
     * @param id 用户序号
     *@param mid 产品编号
     * @param name 产品名称
     * @return
     */
    List<Material> selectCount(@Param("id")Integer id,@Param("mid")String mid,@Param("name")String name);

    /**
     * 删除选中的产品信息
     * @param ids 数组
     * @return
     */
    int deleteIds(String [] ids);
}