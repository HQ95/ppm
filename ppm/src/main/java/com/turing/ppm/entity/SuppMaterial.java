package com.turing.ppm.entity;

import java.io.Serializable;

public class SuppMaterial implements Serializable {
    private Integer supplierId;

    private Integer materialId;

    private static final long serialVersionUID = 1L;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}