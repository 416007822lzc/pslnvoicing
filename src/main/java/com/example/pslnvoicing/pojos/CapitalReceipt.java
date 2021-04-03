package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class CapitalReceipt {
	private int receiptId;
	private String receiptNumber;
	private Timestamp receiptDat;
	private Integer receiptMoney;
	private Integer receiptAmoney;
	private Integer receiptState;
	private String receiptAccount;

	@Id
	@Column(name = "receipt_id")
	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	@Basic
	@Column(name = "receipt_number")
	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	@Basic
	@Column(name = "receipt_dat")
	public Timestamp getReceiptDat() {
		return receiptDat;
	}

	public void setReceiptDat(Timestamp receiptDat) {
		this.receiptDat = receiptDat;
	}

	@Basic
	@Column(name = "receipt_money")
	public Integer getReceiptMoney() {
		return receiptMoney;
	}

	public void setReceiptMoney(Integer receiptMoney) {
		this.receiptMoney = receiptMoney;
	}

	@Basic
	@Column(name = "receipt_amoney")
	public Integer getReceiptAmoney() {
		return receiptAmoney;
	}

	public void setReceiptAmoney(Integer receiptAmoney) {
		this.receiptAmoney = receiptAmoney;
	}

	@Basic
	@Column(name = "receipt_state")
	public Integer getReceiptState() {
		return receiptState;
	}

	public void setReceiptState(Integer receiptState) {
		this.receiptState = receiptState;
	}

	@Basic
	@Column(name = "receipt_account")
	public String getReceiptAccount() {
		return receiptAccount;
	}

	public void setReceiptAccount(String receiptAccount) {
		this.receiptAccount = receiptAccount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalReceipt that = (CapitalReceipt) o;
		return receiptId == that.receiptId &&
				Objects.equals(receiptNumber, that.receiptNumber) &&
				Objects.equals(receiptDat, that.receiptDat) &&
				Objects.equals(receiptMoney, that.receiptMoney) &&
				Objects.equals(receiptAmoney, that.receiptAmoney) &&
				Objects.equals(receiptState, that.receiptState) &&
				Objects.equals(receiptAccount, that.receiptAccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(receiptId, receiptNumber, receiptDat, receiptMoney, receiptAmoney, receiptState, receiptAccount);
	}
}
