package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class TbOrder {
	private int orderId;
	private Integer empId;
	private Integer clientId;
	private Integer warehouseId;
	private String orderNumber;
	private Timestamp documentDate;
	private Timestamp deliveryDate;
	private Double accountReceivable;
	private Double paymentReceived;
	private Integer deliveryStatus;
	private String creatorPerson;
	private Timestamp createTime;
	private Integer approvalStatus;
	private Integer orderStatus;
	private String currentExaminer;
	private String deliveryOrderNumber;

	@Id
	@Column(name = "order_id")
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Basic
	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Basic
	@Column(name = "client_id")
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	@Basic
	@Column(name = "warehouse_id")
	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Basic
	@Column(name = "order_number")
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Basic
	@Column(name = "document_date")
	public Timestamp getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Timestamp documentDate) {
		this.documentDate = documentDate;
	}

	@Basic
	@Column(name = "delivery_date")
	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Basic
	@Column(name = "account_receivable")
	public Double getAccountReceivable() {
		return accountReceivable;
	}

	public void setAccountReceivable(Double accountReceivable) {
		this.accountReceivable = accountReceivable;
	}

	@Basic
	@Column(name = "payment_received")
	public Double getPaymentReceived() {
		return paymentReceived;
	}

	public void setPaymentReceived(Double paymentReceived) {
		this.paymentReceived = paymentReceived;
	}

	@Basic
	@Column(name = "delivery_status")
	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Basic
	@Column(name = "creator_person")
	public String getCreatorPerson() {
		return creatorPerson;
	}

	public void setCreatorPerson(String creatorPerson) {
		this.creatorPerson = creatorPerson;
	}

	@Basic
	@Column(name = "create_time")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Basic
	@Column(name = "approval_status")
	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	@Basic
	@Column(name = "order_status")
	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Basic
	@Column(name = "current_examiner")
	public String getCurrentExaminer() {
		return currentExaminer;
	}

	public void setCurrentExaminer(String currentExaminer) {
		this.currentExaminer = currentExaminer;
	}

	@Basic
	@Column(name = "delivery_order_number")
	public String getDeliveryOrderNumber() {
		return deliveryOrderNumber;
	}

	public void setDeliveryOrderNumber(String deliveryOrderNumber) {
		this.deliveryOrderNumber = deliveryOrderNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TbOrder tbOrder = (TbOrder) o;
		return orderId == tbOrder.orderId &&
				Objects.equals(empId, tbOrder.empId) &&
				Objects.equals(clientId, tbOrder.clientId) &&
				Objects.equals(warehouseId, tbOrder.warehouseId) &&
				Objects.equals(orderNumber, tbOrder.orderNumber) &&
				Objects.equals(documentDate, tbOrder.documentDate) &&
				Objects.equals(deliveryDate, tbOrder.deliveryDate) &&
				Objects.equals(accountReceivable, tbOrder.accountReceivable) &&
				Objects.equals(paymentReceived, tbOrder.paymentReceived) &&
				Objects.equals(deliveryStatus, tbOrder.deliveryStatus) &&
				Objects.equals(creatorPerson, tbOrder.creatorPerson) &&
				Objects.equals(createTime, tbOrder.createTime) &&
				Objects.equals(approvalStatus, tbOrder.approvalStatus) &&
				Objects.equals(orderStatus, tbOrder.orderStatus) &&
				Objects.equals(currentExaminer, tbOrder.currentExaminer) &&
				Objects.equals(deliveryOrderNumber, tbOrder.deliveryOrderNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, empId, clientId, warehouseId, orderNumber, documentDate, deliveryDate, accountReceivable, paymentReceived, deliveryStatus, creatorPerson, createTime, approvalStatus, orderStatus, currentExaminer, deliveryOrderNumber);
	}
}
