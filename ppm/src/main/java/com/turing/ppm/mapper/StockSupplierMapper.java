package com.turing.ppm.mapper;

import com.turing.ppm.entity.StockSupplier;
import com.turing.ppm.entity.StockSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockSupplierMapper {
    int countByExample(StockSupplierExample example);

    int deleteByExample(StockSupplierExample example);

    int insert(StockSupplier record);

    int insertSelective(StockSupplier record);

    List<StockSupplier> selectByExample(StockSupplierExample example);

    int updateByExampleSelective(@Param("record") StockSupplier record, @Param("example") StockSupplierExample example);

    int updateByExample(@Param("record") StockSupplier record, @Param("example") StockSupplierExample example);
}