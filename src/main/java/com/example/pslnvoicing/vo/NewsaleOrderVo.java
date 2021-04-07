package com.example.pslnvoicing.vo;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.pojos.TbOrderDetails;
import java.sql.Timestamp;

import java.util.List;

public class NewsaleOrderVo {
    private Integer clientid;//客户Id
    private Integer warehouseId;//仓库id
    private Integer empId;//员工Id
    private String ordernumber;//销售订单编号
    private Double zj;//金额总计
    private Timestamp documentdate;//单据日期
    private Timestamp deliverydate;//交货日期
    private List<PslvoicingProduct> pslvoicingProducts;//销售订单详情

    public List<PslvoicingProduct> getPslvoicingProducts() {
        return pslvoicingProducts;
    }

    public void setPslvoicingProducts(List<PslvoicingProduct> pslvoicingProducts) {
        this.pslvoicingProducts = pslvoicingProducts;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Double getZj() {
        return zj;
    }

    public void setZj(Double zj) {
        this.zj = zj;
    }

    public Timestamp getDocumentdate() {
        return documentdate;
    }

    public void setDocumentdate(Timestamp documentdate) {
        this.documentdate = documentdate;
    }

    public Timestamp getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Timestamp deliverydate) {
        this.deliverydate = deliverydate;
    }

}
