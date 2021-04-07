package com.example.pslnvoicing.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;


public class TborderVo {
	private int orderId;
	private int empId;
	private int clientId;
	private int warehouseId;
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

	public TborderVo() {
	}

	public TborderVo(int orderId, int empId, int clientId, int warehouseId, String orderNumber, Timestamp documentDate, Timestamp deliveryDate, Double accountReceivable, Double paymentReceived, Integer deliveryStatus, String creatorPerson, Timestamp createTime, Integer approvalStatus, Integer orderStatus, String currentExaminer, String deliveryOrderNumber) {
		this.orderId = orderId;
		this.empId = empId;
		this.clientId = clientId;
		this.warehouseId = warehouseId;
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
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
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
}
