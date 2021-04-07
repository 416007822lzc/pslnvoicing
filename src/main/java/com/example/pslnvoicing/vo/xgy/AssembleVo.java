package com.example.pslnvoicing.vo.xgy;

public class AssembleVo {
    private int productId;
    private String chuku;
    private int assembleDetailsNumber;
    private int assembleDetailsCost;

    @Override
    public String toString() {
        return "AssembleVo{" +
                "productId=" + productId +
                ", chuku='" + chuku + '\'' +
                ", assembleDetailsNumber=" + assembleDetailsNumber +
                ", assembleDetailsCost=" + assembleDetailsCost +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getChuku() {
        return chuku;
    }

    public void setChuku(String chuku) {
        this.chuku = chuku;
    }

    public int getAssembleDetailsNumber() {
        return assembleDetailsNumber;
    }

    public void setAssembleDetailsNumber(int assembleDetailsNumber) {
        this.assembleDetailsNumber = assembleDetailsNumber;
    }

    public int getAssembleDetailsCost() {
        return assembleDetailsCost;
    }

    public void setAssembleDetailsCost(int assembleDetailsCost) {
        this.assembleDetailsCost = assembleDetailsCost;
    }
}
