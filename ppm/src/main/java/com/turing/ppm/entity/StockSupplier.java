package com.turing.ppm.entity;

import java.io.Serializable;

public class StockSupplier implements Serializable {
    private Integer stockId;

    private Integer supplierId;

    private static final long serialVersionUID = 1L;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}