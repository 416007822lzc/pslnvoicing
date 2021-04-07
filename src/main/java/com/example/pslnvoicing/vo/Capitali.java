package com.example.pslnvoicing.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class Capitali {
	private Integer xqid;
	private Integer id;
	private String incomeName;
	private Timestamp paymentDat;
	private String popurchasingstaff;
	private Integer pojinne;
	private Integer paymenMoney;
	private String supplierName;
	private String paymentNumber;
	private String zjname;
	private Integer rpaymentState;


	public Integer getXqid() {
		return xqid;
	}

	public void setXqid(Integer xqid) {
		this.xqid = xqid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIncomeName() {
		return incomeName;
	}

	public void setIncomeName(String incomeName) {
		this.incomeName = incomeName;
	}

	public Timestamp getPaymentDat() {
		return paymentDat;
	}


	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public void setPaymentDat(Timestamp paymentDat) {
		this.paymentDat = paymentDat;
	}

	public String getPopurchasingstaff() {
		return popurchasingstaff;
	}

	public void setPopurchasingstaff(String popurchasingstaff) {
		this.popurchasingstaff = popurchasingstaff;
	}

	public Integer getPojinne() {
		return pojinne;
	}

	public void setPojinne(Integer pojinne) {
		this.pojinne = pojinne;
	}

	public Integer getPaymenMoney() {
		return paymenMoney;
	}

	public void setPaymenMoney(Integer paymenMoney) {
		this.paymenMoney = paymenMoney;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public String getZjname() {
		return zjname;
	}

	public void setZjname(String zjname) {
		this.zjname = zjname;
	}

	public Integer getRpaymentState() {
		return rpaymentState;
	}

	public void setRpaymentState(Integer rpaymentState) {
		this.rpaymentState = rpaymentState;
	}

	public Capitali(Integer xqid, Integer id, String incomeName, Timestamp paymentDat, String popurchasingstaff, Integer pojinne, Integer paymenMoney, String supplierName, String paymentNumber, String zjname, Integer rpaymentState) {
		this.xqid = xqid;
		this.id = id;
		this.incomeName = incomeName;
		this.paymentDat = paymentDat;
		this.popurchasingstaff = popurchasingstaff;
		this.pojinne = pojinne;
		this.paymenMoney = paymenMoney;
		this.supplierName = supplierName;
		this.paymentNumber = paymentNumber;
		this.zjname = zjname;
		this.rpaymentState = rpaymentState;
	}

	public Capitali() {
	}

	@Override
	public String toString() {
		return "Capitali{" +
				"xqid=" + xqid +
				", id=" + id +
				", incomeName='" + incomeName + '\'' +
				", paymentDat=" + paymentDat +
				", popurchasingstaff='" + popurchasingstaff + '\'' +
				", pojinne=" + pojinne +
				", paymenMoney=" + paymenMoney +
				", supplierName='" + supplierName + '\'' +
				", paymentNumber='" + paymentNumber + '\'' +
				", zjname='" + zjname + '\'' +
				", rpaymentState=" + rpaymentState +
				'}';
	}
}
