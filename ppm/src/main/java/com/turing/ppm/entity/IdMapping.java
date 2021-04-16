package com.turing.ppm.entity;

import java.io.Serializable;

public class IdMapping implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer stockId;

    private Integer enquireId;

    private Integer contAppId;

    private Integer quoteId;

    private Integer contId;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getEnquireId() {
        return enquireId;
    }

    public void setEnquireId(Integer enquireId) {
        this.enquireId = enquireId;
    }

    public Integer getContAppId() {
        return contAppId;
    }

    public void setContAppId(Integer contAppId) {
        this.contAppId = contAppId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getContId() {
        return contId;
    }

    public void setContId(Integer contId) {
        this.contId = contId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}