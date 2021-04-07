package com.example.pslnvoicing.vo;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.pojos.TbOrderDetails;
import java.sql.Timestamp;

import java.util.List;

public class NewsaleOrderVo {
    private Integer empId;//员工Id
    private Integer clientid;//客户Id
    private Integer warehouseId;//仓库id
    private String ordernumber;//销售订单编号
    private Double zj;//金额总计
    private Timestamp documentdate;//单据日期
    private Timestamp deliverydate;//交货日期
    private List<PslvoicingProduct> pslvoicingproducts;//销售订单详情

    public NewsaleOrderVo(Integer empId, Integer clientid, Integer warehouseId, String ordernumber, Double zj, Timestamp documentdate, Timestamp deliverydate, List<PslvoicingProduct> pslvoicingproducts) {
        this.empId = empId;
        this.clientid = clientid;
        this.warehouseId = warehouseId;
        this.ordernumber = ordernumber;
        this.zj = zj;
        this.documentdate = documentdate;
        this.deliverydate = deliverydate;
        this.pslvoicingproducts = pslvoicingproducts;
    }

    public NewsaleOrderVo() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public List<PslvoicingProduct> getPslvoicingproducts() {
        return pslvoicingproducts;
    }

    public void setPslvoicingproducts(List<PslvoicingProduct> pslvoicingproducts) {
        this.pslvoicingproducts = pslvoicingproducts;
    }
}
