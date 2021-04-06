package com.example.pslnvoicing.vo;

import com.example.pslnvoicing.pojos.TbOrderDetails;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class TbOrderDetailsVo {
    private int orderId;
    private String empname;
    private String clientname;
    private String warehousename;
    private String clientContact;
    private String clientPhone;
    private String clientContactNumber;
    private String clientAddress;
    private String orderNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp documentDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp deliveryDate;
    private Double accountReceivable;
    private Double paymentReceived;
    private Integer deliveryStatus;
    private String creatorPerson;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp createTime;
    private Integer approvalStatus;
    private Integer orderStatus;
    private String currentExaminer;
    private String deliveryOrderNumber;
    private List<TbOrderDetails>  tbOrderDetails;

    public TbOrderDetailsVo() {
    }

    public TbOrderDetailsVo(int orderId, String empname, String clientname, String warehousename, String clientContact, String clientPhone, String clientContactNumber, String clientAddress, String orderNumber, Timestamp documentDate, Timestamp deliveryDate, Double accountReceivable, Double paymentReceived, Integer deliveryStatus, String creatorPerson, Timestamp createTime, Integer approvalStatus, Integer orderStatus, String currentExaminer, String deliveryOrderNumber, List<TbOrderDetails> tbOrderDetails) {
        this.orderId = orderId;
        this.empname = empname;
        this.clientname = clientname;
        this.warehousename = warehousename;
        this.clientContact = clientContact;
        this.clientPhone = clientPhone;
        this.clientContactNumber = clientContactNumber;
        this.clientAddress = clientAddress;
        this.orderNumber = orderNumber;
        this.documentDate = documentDate;
        this.deliveryDate = deliveryDate;
        this.accountReceivable = accountReceivable;
        this.paymentReceived = paymentReceived;
        this.deliveryStatus = deliveryStatus;
        this.creatorPerson = creatorPerson;
        this.createTime = createTime;
        this.approvalStatus = approvalStatus;
        this.orderStatus = orderStatus;
        this.currentExaminer = currentExaminer;
        this.deliveryOrderNumber = deliveryOrderNumber;
        this.tbOrderDetails = tbOrderDetails;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientContactNumber() {
        return clientContactNumber;
    }

    public void setClientContactNumber(String clientContactNumber) {
        this.clientContactNumber = clientContactNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Timestamp getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Timestamp documentDate) {
        this.documentDate = documentDate;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Double getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Double accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    public Double getPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(Double paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getCreatorPerson() {
        return creatorPerson;
    }

    public void setCreatorPerson(String creatorPerson) {
        this.creatorPerson = creatorPerson;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCurrentExaminer() {
        return currentExaminer;
    }

    public void setCurrentExaminer(String currentExaminer) {
        this.currentExaminer = currentExaminer;
    }

    public String getDeliveryOrderNumber() {
        return deliveryOrderNumber;
    }

    public void setDeliveryOrderNumber(String deliveryOrderNumber) {
        this.deliveryOrderNumber = deliveryOrderNumber;
    }

    public List<TbOrderDetails> getTbOrderDetails() {
        return tbOrderDetails;
    }

    public void setTbOrderDetails(List<TbOrderDetails> tbOrderDetails) {
        this.tbOrderDetails = tbOrderDetails;
    }
}
