package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunDismounting {
	private int dismountingId;
	private String dismountingOdd;
	private Timestamp dismountingDate;
	private Integer dismountingMoney;
	private Integer dismountingProductId;
	private Integer dismountingWarehouse;
	private Integer dismountingNumber;
	private Integer dismountingCost;
	private String dismountingName;
	private Timestamp dismountingTime;
	private Integer dismountingState;
	private String dismountingRemark;

	@Id
	@Column(name = "dismounting_id")
	public int getDismountingId() {
		return dismountingId;
	}

	public void setDismountingId(int dismountingId) {
		this.dismountingId = dismountingId;
	}

	@Basic
	@Column(name = "dismounting_odd")
	public String getDismountingOdd() {
		return dismountingOdd;
	}

	public void setDismountingOdd(String dismountingOdd) {
		this.dismountingOdd = dismountingOdd;
	}

	@Basic
	@Column(name = "dismounting_date")
	public Timestamp getDismountingDate() {
		return dismountingDate;
	}

	public void setDismountingDate(Timestamp dismountingDate) {
		this.dismountingDate = dismountingDate;
	}

	@Basic
	@Column(name = "dismounting_money")
	public Integer getDismountingMoney() {
		return dismountingMoney;
	}

	public void setDismountingMoney(Integer dismountingMoney) {
		this.dismountingMoney = dismountingMoney;
	}

	@Basic
	@Column(name = "dismounting_productId")
	public Integer getDismountingProductId() {
		return dismountingProductId;
	}

	public void setDismountingProductId(Integer dismountingProductId) {
		this.dismountingProductId = dismountingProductId;
	}

	@Basic
	@Column(name = "dismounting_warehouse")
	public Integer getDismountingWarehouse() {
		return dismountingWarehouse;
	}

	public void setDismountingWarehouse(Integer dismountingWarehouse) {
		this.dismountingWarehouse = dismountingWarehouse;
	}

	@Basic
	@Column(name = "dismounting_number")
	public Integer getDismountingNumber() {
		return dismountingNumber;
	}

	public void setDismountingNumber(Integer dismountingNumber) {
		this.dismountingNumber = dismountingNumber;
	}

	@Basic
	@Column(name = "dismounting_cost")
	public Integer getDismountingCost() {
		return dismountingCost;
	}

	public void setDismountingCost(Integer dismountingCost) {
		this.dismountingCost = dismountingCost;
	}

	@Basic
	@Column(name = "dismounting_name")
	public String getDismountingName() {
		return dismountingName;
	}

	public void setDismountingName(String dismountingName) {
		this.dismountingName = dismountingName;
	}

	@Basic
	@Column(name = "dismounting_time")
	public Timestamp getDismountingTime() {
		return dismountingTime;
	}

	public void setDismountingTime(Timestamp dismountingTime) {
		this.dismountingTime = dismountingTime;
	}

	@Basic
	@Column(name = "dismounting_state")
	public Integer getDismountingState() {
		return dismountingState;
	}

	public void setDismountingState(Integer dismountingState) {
		this.dismountingState = dismountingState;
	}

	@Basic
	@Column(name = "dismounting_remark")
	public String getDismountingRemark() {
		return dismountingRemark;
	}

	public void setDismountingRemark(String dismountingRemark) {
		this.dismountingRemark = dismountingRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunDismounting that = (KucunDismounting) o;
		return dismountingId == that.dismountingId &&
				Objects.equals(dismountingOdd, that.dismountingOdd) &&
				Objects.equals(dismountingDate, that.dismountingDate) &&
				Objects.equals(dismountingMoney, that.dismountingMoney) &&
				Objects.equals(dismountingProductId, that.dismountingProductId) &&
				Objects.equals(dismountingWarehouse, that.dismountingWarehouse) &&
				Objects.equals(dismountingNumber, that.dismountingNumber) &&
				Objects.equals(dismountingCost, that.dismountingCost) &&
				Objects.equals(dismountingName, that.dismountingName) &&
				Objects.equals(dismountingTime, that.dismountingTime) &&
				Objects.equals(dismountingState, that.dismountingState) &&
				Objects.equals(dismountingRemark, that.dismountingRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dismountingId, dismountingOdd, dismountingDate, dismountingMoney, dismountingProductId, dismountingWarehouse, dismountingNumber, dismountingCost, dismountingName, dismountingTime, dismountingState, dismountingRemark);
	}
}
