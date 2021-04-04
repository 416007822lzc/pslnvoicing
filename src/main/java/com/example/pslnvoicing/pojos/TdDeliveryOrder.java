package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class TdDeliveryOrder {
	private int deliveryOrderId;
	private Integer empId;
	private Integer clientId;
	private Integer warehouseId;
	private String deliveryOrderNumber;
	private Timestamp deliveryTime;
	private Double receivables;
	private Integer deliveryStatus;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer approvalStatus;
	private String currentExaminer;
	private String orderNumber;
	private String salesReturnsNumber;

	@Id
	@Column(name = "delivery_order_id")
	public int getDeliveryOrderId() {
		return deliveryOrderId;
	}

	public void setDeliveryOrderId(int deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
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
	@Column(name = "delivery_order_number")
	public String getDeliveryOrderNumber() {
		return deliveryOrderNumber;
	}

	public void setDeliveryOrderNumber(String deliveryOrderNumber) {
		this.deliveryOrderNumber = deliveryOrderNumber;
	}

	@Basic
	@Column(name = "delivery_time")
	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Basic
	@Column(name = "receivables")
	public Double getReceivables() {
		return receivables;
	}

	public void setReceivables(Double receivables) {
		this.receivables = receivables;
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
	@Column(name = "create_time")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Basic
	@Column(name = "update_time")
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
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
	@Column(name = "current_examiner")
	public String getCurrentExaminer() {
		return currentExaminer;
	}

	public void setCurrentExaminer(String currentExaminer) {
		this.currentExaminer = currentExaminer;
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
	@Column(name = "sales_returns_number")
	public String getSalesReturnsNumber() {
		return salesReturnsNumber;
	}

	public void setSalesReturnsNumber(String salesReturnsNumber) {
		this.salesReturnsNumber = salesReturnsNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TdDeliveryOrder that = (TdDeliveryOrder) o;
		return deliveryOrderId == that.deliveryOrderId &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(clientId, that.clientId) &&
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(deliveryOrderNumber, that.deliveryOrderNumber) &&
				Objects.equals(deliveryTime, that.deliveryTime) &&
				Objects.equals(receivables, that.receivables) &&
				Objects.equals(deliveryStatus, that.deliveryStatus) &&
				Objects.equals(createTime, that.createTime) &&
				Objects.equals(updateTime, that.updateTime) &&
				Objects.equals(approvalStatus, that.approvalStatus) &&
				Objects.equals(currentExaminer, that.currentExaminer) &&
				Objects.equals(orderNumber, that.orderNumber) &&
				Objects.equals(salesReturnsNumber, that.salesReturnsNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deliveryOrderId, empId, clientId, warehouseId, deliveryOrderNumber, deliveryTime, receivables, deliveryStatus, createTime, updateTime, approvalStatus, currentExaminer, orderNumber, salesReturnsNumber);
	}
}
