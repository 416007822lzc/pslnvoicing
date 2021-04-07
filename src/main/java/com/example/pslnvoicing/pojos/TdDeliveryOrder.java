package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class TdDeliveryOrder {
	private int deliveryOrderId;
	private PersonnelEmp personnelEmp;
	private PslnvoicingClient pslnvoicingClient;
	private PslnvoiningWarehouse PslnvoiningWarehouse;
	private String deliveryOrderNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Timestamp deliveryTime;
	private Double receivables;
	private Integer deliveryStatus;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Timestamp createTime;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Timestamp updateTime;
	private Integer approvalStatus;
	private String currentExaminer;
	private String orderNumber;
	private String salesReturnsNumber;

	public TdDeliveryOrder() {
	}

	public TdDeliveryOrder(int deliveryOrderId, PersonnelEmp personnelEmp, PslnvoicingClient pslnvoicingClient, com.example.pslnvoicing.pojos.PslnvoiningWarehouse pslnvoiningWarehouse, String deliveryOrderNumber, Timestamp deliveryTime, Double receivables, Integer deliveryStatus, Timestamp createTime, Timestamp updateTime, Integer approvalStatus, String currentExaminer, String orderNumber, String salesReturnsNumber) {
		this.deliveryOrderId = deliveryOrderId;
		this.personnelEmp = personnelEmp;
		this.pslnvoicingClient = pslnvoicingClient;
		PslnvoiningWarehouse = pslnvoiningWarehouse;
		this.deliveryOrderNumber = deliveryOrderNumber;
		this.deliveryTime = deliveryTime;
		this.receivables = receivables;
		this.deliveryStatus = deliveryStatus;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.approvalStatus = approvalStatus;
		this.currentExaminer = currentExaminer;
		this.orderNumber = orderNumber;
		this.salesReturnsNumber = salesReturnsNumber;
	}

	public int getDeliveryOrderId() {
		return deliveryOrderId;
	}

	public void setDeliveryOrderId(int deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

	public PersonnelEmp getPersonnelEmp() {
		return personnelEmp;
	}

	public void setPersonnelEmp(PersonnelEmp personnelEmp) {
		this.personnelEmp = personnelEmp;
	}

	public PslnvoicingClient getPslnvoicingClient() {
		return pslnvoicingClient;
	}

	public void setPslnvoicingClient(PslnvoicingClient pslnvoicingClient) {
		this.pslnvoicingClient = pslnvoicingClient;
	}

	public com.example.pslnvoicing.pojos.PslnvoiningWarehouse getPslnvoiningWarehouse() {
		return PslnvoiningWarehouse;
	}

	public void setPslnvoiningWarehouse(com.example.pslnvoicing.pojos.PslnvoiningWarehouse pslnvoiningWarehouse) {
		PslnvoiningWarehouse = pslnvoiningWarehouse;
	}

	public String getDeliveryOrderNumber() {
		return deliveryOrderNumber;
	}

	public void setDeliveryOrderNumber(String deliveryOrderNumber) {
		this.deliveryOrderNumber = deliveryOrderNumber;
	}

	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Double getReceivables() {
		return receivables;
	}

	public void setReceivables(Double receivables) {
		this.receivables = receivables;
	}

	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getCurrentExaminer() {
		return currentExaminer;
	}

	public void setCurrentExaminer(String currentExaminer) {
		this.currentExaminer = currentExaminer;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSalesReturnsNumber() {
		return salesReturnsNumber;
	}

	public void setSalesReturnsNumber(String salesReturnsNumber) {
		this.salesReturnsNumber = salesReturnsNumber;
	}
}
