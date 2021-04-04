package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class TdSalesReturns {
	private int salesReturnsId;
	private Integer empId;
	private Integer clientId;
	private Integer warehouseId;
	private String salesReturnsNumber;
	private Timestamp warehousingTime;
	private Double receivables;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer approvalStatus;
	private String currentExaminer;
	private String deliveryOrderNumber;

	@Id
	@Column(name = "sales_returns_id")
	public int getSalesReturnsId() {
		return salesReturnsId;
	}

	public void setSalesReturnsId(int salesReturnsId) {
		this.salesReturnsId = salesReturnsId;
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
	@Column(name = "sales_returns_number")
	public String getSalesReturnsNumber() {
		return salesReturnsNumber;
	}

	public void setSalesReturnsNumber(String salesReturnsNumber) {
		this.salesReturnsNumber = salesReturnsNumber;
	}

	@Basic
	@Column(name = "warehousing_time")
	public Timestamp getWarehousingTime() {
		return warehousingTime;
	}

	public void setWarehousingTime(Timestamp warehousingTime) {
		this.warehousingTime = warehousingTime;
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
		TdSalesReturns that = (TdSalesReturns) o;
		return salesReturnsId == that.salesReturnsId &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(clientId, that.clientId) &&
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(salesReturnsNumber, that.salesReturnsNumber) &&
				Objects.equals(warehousingTime, that.warehousingTime) &&
				Objects.equals(receivables, that.receivables) &&
				Objects.equals(createTime, that.createTime) &&
				Objects.equals(updateTime, that.updateTime) &&
				Objects.equals(approvalStatus, that.approvalStatus) &&
				Objects.equals(currentExaminer, that.currentExaminer) &&
				Objects.equals(deliveryOrderNumber, that.deliveryOrderNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(salesReturnsId, empId, clientId, warehouseId, salesReturnsNumber, warehousingTime, receivables, createTime, updateTime, approvalStatus, currentExaminer, deliveryOrderNumber);
	}
}
