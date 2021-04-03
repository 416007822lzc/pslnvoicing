package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "capital_sale", schema = "pslnvoicing", catalog = "")
public class CapitalSale {
	private int saleId;
	private String saleNumber;
	private Integer clientId;
	private Integer lbId;
	private Integer xsId;
	private Timestamp saleDat;
	private Integer saleMoney;
	private Integer saleAmoney;
	private Integer saleState;
	private CapitalReceipt capitalReceiptByReceiptId;

	@Id
	@Column(name = "sale_id")
	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	@Basic
	@Column(name = "sale_number")
	public String getSaleNumber() {
		return saleNumber;
	}

	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}

	@Basic
	@Column(name = "client_id")
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	@Basic
	@Column(name = "lb_id")
	public Integer getLbId() {
		return lbId;
	}

	public void setLbId(Integer lbId) {
		this.lbId = lbId;
	}

	@Basic
	@Column(name = "xs_id")
	public Integer getXsId() {
		return xsId;
	}

	public void setXsId(Integer xsId) {
		this.xsId = xsId;
	}

	@Basic
	@Column(name = "sale_dat")
	public Timestamp getSaleDat() {
		return saleDat;
	}

	public void setSaleDat(Timestamp saleDat) {
		this.saleDat = saleDat;
	}

	@Basic
	@Column(name = "sale_money")
	public Integer getSaleMoney() {
		return saleMoney;
	}

	public void setSaleMoney(Integer saleMoney) {
		this.saleMoney = saleMoney;
	}

	@Basic
	@Column(name = "sale_amoney")
	public Integer getSaleAmoney() {
		return saleAmoney;
	}

	public void setSaleAmoney(Integer saleAmoney) {
		this.saleAmoney = saleAmoney;
	}

	@Basic
	@Column(name = "sale_state")
	public Integer getSaleState() {
		return saleState;
	}

	public void setSaleState(Integer saleState) {
		this.saleState = saleState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalSale that = (CapitalSale) o;
		return saleId == that.saleId &&
				Objects.equals(saleNumber, that.saleNumber) &&
				Objects.equals(clientId, that.clientId) &&
				Objects.equals(lbId, that.lbId) &&
				Objects.equals(xsId, that.xsId) &&
				Objects.equals(saleDat, that.saleDat) &&
				Objects.equals(saleMoney, that.saleMoney) &&
				Objects.equals(saleAmoney, that.saleAmoney) &&
				Objects.equals(saleState, that.saleState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(saleId, saleNumber, clientId, lbId, xsId, saleDat, saleMoney, saleAmoney, saleState);
	}

	@ManyToOne
	@JoinColumn(name = "receipt_id", referencedColumnName = "receipt_id")
	public CapitalReceipt getCapitalReceiptByReceiptId() {
		return capitalReceiptByReceiptId;
	}

	public void setCapitalReceiptByReceiptId(CapitalReceipt capitalReceiptByReceiptId) {
		this.capitalReceiptByReceiptId = capitalReceiptByReceiptId;
	}
}
