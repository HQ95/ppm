package com.turing.ppm.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Material implements Serializable {
    private Integer id;

    private String materialNum;

    private String materialName;

    private String materialUnit;

    private String materialType;

    @JsonProperty("material_count")
    private Integer materialCount;

    @JsonProperty("material_money")
    private Double materialMoney;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum == null ? null : materialNum.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit == null ? null : materialUnit.trim();
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    public Integer getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(Integer materialCount) {
        this.materialCount = materialCount;
    }

    public Double getMaterialMoney() {
        return materialMoney;
    }

    public void setMaterialMoney(Double materialMoney) {
        this.materialMoney = materialMoney;
    }
}