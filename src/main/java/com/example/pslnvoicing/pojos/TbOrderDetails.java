package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;


public class TbOrderDetails {
    private int orderDetailsId;
    private String orderId;
    private String productName;
    private String productNumber;
    private Integer number;
    private Double salesUnitPrice;
    private Double salesAmount;
    private String productUnit;
    private String orderDetailsRemarks;

    public TbOrderDetails() {
    }

    public TbOrderDetails(int orderDetailsId, String orderId, String productName, String productNumber, Integer number, Double salesUnitPrice, Double salesAmount, String productUnit, String orderDetailsRemarks) {
        this.orderDetailsId = orderDetailsId;
        this.orderId = orderId;
        this.productName = productName;
        this.productNumber = productNumber;
        this.number = number;
        this.salesUnitPrice = salesUnitPrice;
        this.salesAmount = salesAmount;
        this.productUnit = productUnit;
        this.orderDetailsRemarks = orderDetailsRemarks;
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSalesUnitPrice() {
        return salesUnitPrice;
    }

    public void setSalesUnitPrice(Double salesUnitPrice) {
        this.salesUnitPrice = salesUnitPrice;
    }

    public Double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getOrderDetailsRemarks() {
        return orderDetailsRemarks;
    }

    public void setOrderDetailsRemarks(String orderDetailsRemarks) {
        this.orderDetailsRemarks = orderDetailsRemarks;
    }
}
