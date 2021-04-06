package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class KucunAssemble {
	private int assembleId;
	private String assembleOdd;
	private Timestamp assembleDate;
	private Integer assembleMoney;
	private Integer assembleProductId;
	private Integer assembleWarehouse;
	private Integer assembleNumber;
	private Integer assembleCost;
	private String assembleName;
	private Timestamp assembleTime;
	private Integer assembleState;
	private String assembleRemark;

	@Id
	@Column(name = "assemble_id")
	public int getAssembleId() {
		return assembleId;
	}

	public void setAssembleId(int assembleId) {
		this.assembleId = assembleId;
	}

	@Basic
	@Column(name = "assemble_odd")
	public String getAssembleOdd() {
		return assembleOdd;
	}

	public void setAssembleOdd(String assembleOdd) {
		this.assembleOdd = assembleOdd;
	}

	@Basic
	@Column(name = "assemble_date")
	public Timestamp getAssembleDate() {
		return assembleDate;
	}

	public void setAssembleDate(Timestamp assembleDate) {
		this.assembleDate = assembleDate;
	}

	@Basic
	@Column(name = "assemble_money")
	public Integer getAssembleMoney() {
		return assembleMoney;
	}

	public void setAssembleMoney(Integer assembleMoney) {
		this.assembleMoney = assembleMoney;
	}

	@Basic
	@Column(name = "assemble_productId")
	public Integer getAssembleProductId() {
		return assembleProductId;
	}

	public void setAssembleProductId(Integer assembleProductId) {
		this.assembleProductId = assembleProductId;
	}

	@Basic
	@Column(name = "assemble_warehouse")
	public Integer getAssembleWarehouse() {
		return assembleWarehouse;
	}

	public void setAssembleWarehouse(Integer assembleWarehouse) {
		this.assembleWarehouse = assembleWarehouse;
	}

	@Basic
	@Column(name = "assemble_number")
	public Integer getAssembleNumber() {
		return assembleNumber;
	}

	public void setAssembleNumber(Integer assembleNumber) {
		this.assembleNumber = assembleNumber;
	}

	@Basic
	@Column(name = "assemble_cost")
	public Integer getAssembleCost() {
		return assembleCost;
	}

	public void setAssembleCost(Integer assembleCost) {
		this.assembleCost = assembleCost;
	}

	@Basic
	@Column(name = "assemble_name")
	public String getAssembleName() {
		return assembleName;
	}

	public void setAssembleName(String assembleName) {
		this.assembleName = assembleName;
	}

	@Basic
	@Column(name = "assemble_time")
	public Timestamp getAssembleTime() {
		return assembleTime;
	}

	public void setAssembleTime(Timestamp assembleTime) {
		this.assembleTime = assembleTime;
	}

	@Basic
	@Column(name = "assemble_state")
	public Integer getAssembleState() {
		return assembleState;
	}

	public void setAssembleState(Integer assembleState) {
		this.assembleState = assembleState;
	}

	@Basic
	@Column(name = "assemble_remark")
	public String getAssembleRemark() {
		return assembleRemark;
	}

	public void setAssembleRemark(String assembleRemark) {
		this.assembleRemark = assembleRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAssemble that = (KucunAssemble) o;
		return assembleId == that.assembleId &&
				Objects.equals(assembleOdd, that.assembleOdd) &&
				Objects.equals(assembleDate, that.assembleDate) &&
				Objects.equals(assembleMoney, that.assembleMoney) &&
				Objects.equals(assembleProductId, that.assembleProductId) &&
				Objects.equals(assembleWarehouse, that.assembleWarehouse) &&
				Objects.equals(assembleNumber, that.assembleNumber) &&
				Objects.equals(assembleCost, that.assembleCost) &&
				Objects.equals(assembleName, that.assembleName) &&
				Objects.equals(assembleTime, that.assembleTime) &&
				Objects.equals(assembleState, that.assembleState) &&
				Objects.equals(assembleRemark, that.assembleRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assembleId, assembleOdd, assembleDate, assembleMoney, assembleProductId, assembleWarehouse, assembleNumber, assembleCost, assembleName, assembleTime, assembleState, assembleRemark);
	}
}
