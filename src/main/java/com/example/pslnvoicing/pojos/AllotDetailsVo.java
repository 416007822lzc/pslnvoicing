package com.example.pslnvoicing.model.pojos;

public class AllotDetailsVo {
    private Integer productId;
    private Integer allotId;
    private Integer allotDetailsNumber;
    private Integer allotDetailsCost;

    @Override
    public String toString() {
        return "AllotDetailsVo{" +
                "productId=" + productId +
                ", allotId=" + allotId +
                ", allotDetailsNumber=" + allotDetailsNumber +
                ", allotDetailsCost=" + allotDetailsCost +
                '}';
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAllotId() {
        return allotId;
    }

    public void setAllotId(Integer allotId) {
        this.allotId = allotId;
    }

    public Integer getAllotDetailsNumber() {
        return allotDetailsNumber;
    }

    public void setAllotDetailsNumber(Integer allotDetailsNumber) {
        this.allotDetailsNumber = allotDetailsNumber;
    }

    public Integer getAllotDetailsCost() {
        return allotDetailsCost;
    }

    public void setAllotDetailsCost(Integer allotDetailsCost) {
        this.allotDetailsCost = allotDetailsCost;
    }
}
