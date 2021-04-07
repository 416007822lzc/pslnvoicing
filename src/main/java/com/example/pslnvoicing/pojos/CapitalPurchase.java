package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class CapitalPurchase {
	private int purchaseId;
	private Integer paymentId;
	private String purchaseNumber;
	private Timestamp purchaseDat;
	private BigDecimal purchaseMoney;
	private BigDecimal purchaseAmoney;
	private Integer purchaseState;

	@Id
	@Column(name = "purchase_id")
	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	@Basic
	@Column(name = "payment_id")
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Basic
	@Column(name = "purchase_number")
	public String getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	@Basic
	@Column(name = "purchase_dat")
	public Timestamp getPurchaseDat() {
		return purchaseDat;
	}

	public void setPurchaseDat(Timestamp purchaseDat) {
		this.purchaseDat = purchaseDat;
	}

	@Basic
	@Column(name = "purchase_money")
	public BigDecimal getPurchaseMoney() {
		return purchaseMoney;
	}

	public void setPurchaseMoney(BigDecimal purchaseMoney) {
		this.purchaseMoney = purchaseMoney;
	}

	@Basic
	@Column(name = "purchase_amoney")
	public BigDecimal getPurchaseAmoney() {
		return purchaseAmoney;
	}

	public void setPurchaseAmoney(BigDecimal purchaseAmoney) {
		this.purchaseAmoney = purchaseAmoney;
	}

	@Basic
	@Column(name = "purchase_state")
	public Integer getPurchaseState() {
		return purchaseState;
	}

	public void setPurchaseState(Integer purchaseState) {
		this.purchaseState = purchaseState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalPurchase that = (CapitalPurchase) o;
		return purchaseId == that.purchaseId &&
				Objects.equals(paymentId, that.paymentId) &&
				Objects.equals(purchaseNumber, that.purchaseNumber) &&
				Objects.equals(purchaseDat, that.purchaseDat) &&
				Objects.equals(purchaseMoney, that.purchaseMoney) &&
				Objects.equals(purchaseAmoney, that.purchaseAmoney) &&
				Objects.equals(purchaseState, that.purchaseState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(purchaseId, paymentId, purchaseNumber, purchaseDat, purchaseMoney, purchaseAmoney, purchaseState);
	}
}
