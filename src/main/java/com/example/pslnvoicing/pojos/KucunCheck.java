package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunCheck {
	private int checkId;
	private Integer empId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp checkTime;
	private Integer checkProduct;
	private Integer checkProductEnd;
	private String checkStaff;
	private String checkState;
	private Integer checkInventory;
	private String checkNote;
	private Integer checkNumber;
	private String checkNum;


	private PslnvoiningWarehouse warehouse;

	@ManyToOne
	@JoinColumn(name = "warehouse_id",referencedColumnName = "warehouse_id")
	public PslnvoiningWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(PslnvoiningWarehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Id
	@Column(name = "check_id")
	public int getCheckId() {
		return checkId;
	}

	public void setCheckId(int checkId) {
		this.checkId = checkId;
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
	@Column(name = "check_time")
	public Timestamp getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	@Basic
	@Column(name = "check_product")
	public Integer getCheckProduct() {
		return checkProduct;
	}

	public void setCheckProduct(Integer checkProduct) {
		this.checkProduct = checkProduct;
	}

	@Basic
	@Column(name = "check_product_end")
	public Integer getCheckProductEnd() {
		return checkProductEnd;
	}

	public void setCheckProductEnd(Integer checkProductEnd) {
		this.checkProductEnd = checkProductEnd;
	}

	@Basic
	@Column(name = "check_staff")
	public String getCheckStaff() {
		return checkStaff;
	}

	public void setCheckStaff(String checkStaff) {
		this.checkStaff = checkStaff;
	}

	@Basic
	@Column(name = "check_state")
	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	@Basic
	@Column(name = "check_inventory")
	public Integer getCheckInventory() {
		return checkInventory;
	}

	public void setCheckInventory(Integer checkInventory) {
		this.checkInventory = checkInventory;
	}

	@Basic
	@Column(name = "check_note")
	public String getCheckNote() {
		return checkNote;
	}

	public void setCheckNote(String checkNote) {
		this.checkNote = checkNote;
	}

	@Basic
	@Column(name = "check_number")
	public Integer getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}
	@Basic
	@Column(name = "check_num")
	public String getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunCheck that = (KucunCheck) o;
		return checkId == that.checkId &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(checkTime, that.checkTime) &&
				Objects.equals(checkProduct, that.checkProduct) &&
				Objects.equals(checkProductEnd, that.checkProductEnd) &&
				Objects.equals(checkStaff, that.checkStaff) &&
				Objects.equals(checkState, that.checkState) &&
				Objects.equals(checkInventory, that.checkInventory) &&
				Objects.equals(checkNote, that.checkNote) &&
				Objects.equals(checkNumber, that.checkNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(checkId, empId, checkTime, checkProduct, checkProductEnd, checkStaff, checkState, checkInventory, checkNote, checkNumber);
	}
}
