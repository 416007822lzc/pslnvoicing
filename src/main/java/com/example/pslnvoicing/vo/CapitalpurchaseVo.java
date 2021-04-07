package com.example.pslnvoicing.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

public class CapitalpurchaseVo {
	private Integer purid;
	private Integer id;
	private String incomeName;
	private Timestamp paymentDat;
	private Timestamp purchaseDat;
	private String popurchasingstaff;
	private Integer pojinne;
	private Integer paymenMoney;
	private String supplierName;
	private String paymentNumber;
	private String purchaseNumber;
	private String zjname;
	private Integer purchasetState;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPurid() {
		return purid;
	}

	public void setPurid(Integer purid) {
		this.purid = purid;
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


	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Timestamp getPaymentDat() {
		return paymentDat;
	}

	public void setPaymentDat(Timestamp paymentDat) {
		this.paymentDat = paymentDat;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Timestamp getPurchaseDat() {
		return purchaseDat;
	}

	public void setPurchaseDat(Timestamp purchaseDat) {
		this.purchaseDat = purchaseDat;
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

	public String getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public String getZjname() {
		return zjname;
	}

	public void setZjname(String zjname) {
		this.zjname = zjname;
	}

	public Integer getPurchasetState() {
		return purchasetState;
	}

	public void setPurchasetState(Integer purchasetState) {
		this.purchasetState = purchasetState;
	}

	public CapitalpurchaseVo(Integer purid, Integer id, String incomeName, Timestamp paymentDat, Timestamp purchaseDat, String popurchasingstaff, Integer pojinne, Integer paymenMoney, String supplierName, String paymentNumber, String purchaseNumber, String zjname, Integer purchasetState) {
		this.purid = purid;
		this.id = id;
		this.incomeName = incomeName;
		this.paymentDat = paymentDat;
		this.purchaseDat = purchaseDat;
		this.popurchasingstaff = popurchasingstaff;
		this.pojinne = pojinne;
		this.paymenMoney = paymenMoney;
		this.supplierName = supplierName;
		this.paymentNumber = paymentNumber;
		this.purchaseNumber = purchaseNumber;
		this.zjname = zjname;
		this.purchasetState = purchasetState;
	}

	public CapitalpurchaseVo() {
	}

	@Override
	public String toString() {
		return "CapitalpurchaseVo{" +
				"purid=" + purid +
				", id=" + id +
				", incomeName='" + incomeName + '\'' +
				", paymentDat=" + paymentDat +
				", purchaseDat=" + purchaseDat +
				", popurchasingstaff='" + popurchasingstaff + '\'' +
				", pojinne=" + pojinne +
				", paymenMoney=" + paymenMoney +
				", supplierName='" + supplierName + '\'' +
				", paymentNumber='" + paymentNumber + '\'' +
				", purchaseNumber='" + purchaseNumber + '\'' +
				", zjname='" + zjname + '\'' +
				", purchasetState=" + purchasetState +
				'}';
	}
}
