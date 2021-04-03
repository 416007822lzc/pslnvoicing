package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "capital_payment", schema = "pslnvoicing", catalog = "")
public class CapitalPayment {
	private int paymentId;
	private Integer pOId;
	private Integer supplierId;
	private Integer ieId;
	private String paymentNumber;
	private Timestamp paymentDat;
	private Integer paymentMoney;
	private Integer paymentAmoney;
	private Integer rpaymentState;
	private String rpaymentAccount;

	@Id
	@Column(name = "payment_id")
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Basic
	@Column(name = "p_o_id")
	public Integer getpOId() {
		return pOId;
	}

	public void setpOId(Integer pOId) {
		this.pOId = pOId;
	}

	@Basic
	@Column(name = "supplier_id")
	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@Basic
	@Column(name = "ie_id")
	public Integer getIeId() {
		return ieId;
	}

	public void setIeId(Integer ieId) {
		this.ieId = ieId;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalPayment that = (CapitalPayment) o;
		return paymentId == that.paymentId &&
				Objects.equals(pOId, that.pOId) &&
				Objects.equals(supplierId, that.supplierId) &&
				Objects.equals(ieId, that.ieId) &&
				Objects.equals(paymentNumber, that.paymentNumber) &&
				Objects.equals(paymentDat, that.paymentDat) &&
				Objects.equals(paymentMoney, that.paymentMoney) &&
				Objects.equals(paymentAmoney, that.paymentAmoney) &&
				Objects.equals(rpaymentState, that.rpaymentState) &&
				Objects.equals(rpaymentAccount, that.rpaymentAccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(paymentId, pOId, supplierId, ieId, paymentNumber, paymentDat, paymentMoney, paymentAmoney, rpaymentState, rpaymentAccount);
	}
}
