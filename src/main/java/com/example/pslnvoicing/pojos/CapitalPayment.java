package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class CapitalPayment {
	private Integer paymentId;
	private PurchaseOrder pOId;
	private PslnvoicingSuppier supplierId;
	private PslnvoicingIncomeExpenses ieId;
	private String paymentNumber;
	private Timestamp paymentDat;
	private Integer paymentMoney;
	private Integer paymentAmoney;
	private Integer rpaymentState;
	private String rpaymentAccount;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	public Integer getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	@Basic
	@Column(name = "payment_number")
	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	@Basic
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@Column(name = "payment_dat")
	public Timestamp getPaymentDat() {
		return paymentDat;
	}

	public void setPaymentDat(Timestamp paymentDat) {
		this.paymentDat = paymentDat;
	}

	@Basic
	@Column(name = "payment_money")
	public Integer getPaymentMoney() {
		return paymentMoney;
	}

	public void setPaymentMoney(Integer paymentMoney) {
		this.paymentMoney = paymentMoney;
	}

	@Basic
	@Column(name = "payment_amoney")
	public Integer getPaymentAmoney() {
		return paymentAmoney;
	}

	public void setPaymentAmoney(Integer paymentAmoney) {
		this.paymentAmoney = paymentAmoney;
	}

	@Basic
	@Column(name = "rpayment_state")
	public Integer getRpaymentState() {
		return rpaymentState;
	}

	public void setRpaymentState(Integer rpaymentState) {
		this.rpaymentState = rpaymentState;
	}

	@Basic
	@Column(name = "rpayment_account")
	public String getRpaymentAccount() {
		return rpaymentAccount;
	}

	public void setRpaymentAccount(String rpaymentAccount) {
		this.rpaymentAccount = rpaymentAccount;
	}




	/**
	 * 关系
	 * @return
	 */

	@ManyToOne
	@JoinColumn(name = "p_o_id", referencedColumnName = "p_o_id")

	public PurchaseOrder getpOId() {
		return pOId;
	}

	public void setpOId(PurchaseOrder pOId) {
		this.pOId = pOId;
	}



	@ManyToOne
	@JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")

	public PslnvoicingSuppier getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(PslnvoicingSuppier supplierId) {
		this.supplierId = supplierId;
	}

	@ManyToOne
	@JoinColumn(name = "ie_id", referencedColumnName = "ie_id")

	public PslnvoicingIncomeExpenses getIeId() {
		return ieId;
	}

	public void setIeId(PslnvoicingIncomeExpenses ieId) {
		this.ieId = ieId;
	}
}
