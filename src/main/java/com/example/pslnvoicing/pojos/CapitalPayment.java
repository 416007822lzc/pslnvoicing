package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class CapitalPayment {
	private Integer paymentId;
	private PurchaseOrders pOId;
	private PslnvoicingSuppier supplierId;
	private PslnvoicingIncomeExpenses ieId;
	private String paymentNumber;
	private Timestamp paymentDat;
	private Integer paymentMoney;
	private Integer paymentAmoney;
	private Integer rpaymentState;
	private Integer zjId;



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




	/**
	 * 关系
	 * @return
	 */

	@ManyToOne
	@JoinColumn(name = "p_o_id", referencedColumnName = "p_o_id")

	public PurchaseOrders getpOId() {
		return pOId;
	}

	public void setpOId(PurchaseOrders pOId) {
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


	public Integer getZjId() {
		return zjId;
	}

	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}

	@Override
	public String toString() {
		return "CapitalPayment{" +
				"paymentId=" + paymentId +
				", paymentNumber='" + paymentNumber + '\'' +
				", paymentDat=" + paymentDat +
				", paymentMoney=" + paymentMoney +
				", paymentAmoney=" + paymentAmoney +
				", rpaymentState=" + rpaymentState +
				'}';
	}
}
