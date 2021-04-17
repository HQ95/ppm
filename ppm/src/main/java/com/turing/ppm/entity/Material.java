package com.turing.ppm.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Material implements Serializable {
    private Integer id;

    private String materialNum;

    private String materialName;

    private String materialUnit;

    private Integer materialType;

    @JsonProperty("material_count")
    private Integer materialCount;

    @JsonProperty("material_money")
    private Double materialMoney;

    private MaterialType mType;

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
        this.materialNum = materialNum;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public Integer getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
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

    public MaterialType getmType() {
        return mType;
    }

    public void setmType(MaterialType mType) {
        this.mType = mType;
    }
}