package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


public class PslnvoicingSuppier {
	private String supplierName;
	private Integer supplierId;
	private int supplierNum;
	private String supplierType;
	private BigDecimal supplierShouldPayments;
	private BigDecimal supplierPillPayments;
	private BigDecimal supplierActualPayments;
	private String supplierAddress;
	private String supplierHead;
	private String supplierContact;
	private String supplierCreator;
	private Timestamp supplierCreateTime;
	private Timestamp supplierUpdateTime;

	@Basic
	@Column(name = "supplier_name")
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Id
	@Column(name = "supplier_id")
	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@Basic
	@Column(name = "supplier_num")
	public int getSupplierNum() {
		return supplierNum;
	}

	public void setSupplierNum(int supplierNum) {
		this.supplierNum = supplierNum;
	}

	@Basic
	@Column(name = "supplier_type")
	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	@Basic
	@Column(name = "supplier_should_payments")
	public BigDecimal getSupplierShouldPayments() {
		return supplierShouldPayments;
	}

	public void setSupplierShouldPayments(BigDecimal supplierShouldPayments) {
		this.supplierShouldPayments = supplierShouldPayments;
	}

	@Basic
	@Column(name = "supplier_pill_payments")
	public BigDecimal getSupplierPillPayments() {
		return supplierPillPayments;
	}

	public void setSupplierPillPayments(BigDecimal supplierPillPayments) {
		this.supplierPillPayments = supplierPillPayments;
	}

	@Basic
	@Column(name = "supplier_actual_payments")
	public BigDecimal getSupplierActualPayments() {
		return supplierActualPayments;
	}

	public void setSupplierActualPayments(BigDecimal supplierActualPayments) {
		this.supplierActualPayments = supplierActualPayments;
	}

	@Basic
	@Column(name = "supplier_address")
	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Basic
	@Column(name = "supplier_head")
	public String getSupplierHead() {
		return supplierHead;
	}

	public void setSupplierHead(String supplierHead) {
		this.supplierHead = supplierHead;
	}

	@Basic
	@Column(name = "supplier_contact")
	public String getSupplierContact() {
		return supplierContact;
	}

	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	@Basic
	@Column(name = "supplier_creator")
	public String getSupplierCreator() {
		return supplierCreator;
	}

	public void setSupplierCreator(String supplierCreator) {
		this.supplierCreator = supplierCreator;
	}

	@Basic
	@Column(name = "supplier_create_time")
	public Timestamp getSupplierCreateTime() {
		return supplierCreateTime;
	}

	public void setSupplierCreateTime(Timestamp supplierCreateTime) {
		this.supplierCreateTime = supplierCreateTime;
	}

	@Basic
	@Column(name = "supplier_update_time")
	public Timestamp getSupplierUpdateTime() {
		return supplierUpdateTime;
	}

	public void setSupplierUpdateTime(Timestamp supplierUpdateTime) {
		this.supplierUpdateTime = supplierUpdateTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslnvoicingSuppier that = (PslnvoicingSuppier) o;
		return supplierId == that.supplierId &&
				supplierNum == that.supplierNum &&
				Objects.equals(supplierName, that.supplierName) &&
				Objects.equals(supplierType, that.supplierType) &&
				Objects.equals(supplierShouldPayments, that.supplierShouldPayments) &&
				Objects.equals(supplierPillPayments, that.supplierPillPayments) &&
				Objects.equals(supplierActualPayments, that.supplierActualPayments) &&
				Objects.equals(supplierAddress, that.supplierAddress) &&
				Objects.equals(supplierHead, that.supplierHead) &&
				Objects.equals(supplierContact, that.supplierContact) &&
				Objects.equals(supplierCreator, that.supplierCreator) &&
				Objects.equals(supplierCreateTime, that.supplierCreateTime) &&
				Objects.equals(supplierUpdateTime, that.supplierUpdateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(supplierName, supplierId, supplierNum, supplierType, supplierShouldPayments, supplierPillPayments, supplierActualPayments, supplierAddress, supplierHead, supplierContact, supplierCreator, supplierCreateTime, supplierUpdateTime);
	}
}
