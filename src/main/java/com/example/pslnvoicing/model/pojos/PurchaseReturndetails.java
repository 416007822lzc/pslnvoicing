package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "purchase_returndetails", schema = "pslnvoicing", catalog = "")
public class PurchaseReturndetails {
	private int pRdId;
	private Integer pRId;
	private String pRdName;
	private Integer pRdNumber;
	private String pRdCompany;
	private Double pRdUnitprice;
	private Double pRdTotalprice;

	@Id
	@Column(name = "p_rd_id")
	public int getpRdId() {
		return pRdId;
	}

	public void setpRdId(int pRdId) {
		this.pRdId = pRdId;
	}

	@Basic
	@Column(name = "p_r_id")
	public Integer getpRId() {
		return pRId;
	}

	public void setpRId(Integer pRId) {
		this.pRId = pRId;
	}

	@Basic
	@Column(name = "p_rd_name")
	public String getpRdName() {
		return pRdName;
	}

	public void setpRdName(String pRdName) {
		this.pRdName = pRdName;
	}

	@Basic
	@Column(name = "p_rd_number")
	public Integer getpRdNumber() {
		return pRdNumber;
	}

	public void setpRdNumber(Integer pRdNumber) {
		this.pRdNumber = pRdNumber;
	}

	@Basic
	@Column(name = "p_rd_company")
	public String getpRdCompany() {
		return pRdCompany;
	}

	public void setpRdCompany(String pRdCompany) {
		this.pRdCompany = pRdCompany;
	}

	@Basic
	@Column(name = "p_rd_unitprice")
	public Double getpRdUnitprice() {
		return pRdUnitprice;
	}

	public void setpRdUnitprice(Double pRdUnitprice) {
		this.pRdUnitprice = pRdUnitprice;
	}

	@Basic
	@Column(name = "p_rd_totalprice")
	public Double getpRdTotalprice() {
		return pRdTotalprice;
	}

	public void setpRdTotalprice(Double pRdTotalprice) {
		this.pRdTotalprice = pRdTotalprice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PurchaseReturndetails that = (PurchaseReturndetails) o;
		return pRdId == that.pRdId &&
				Objects.equals(pRId, that.pRId) &&
				Objects.equals(pRdName, that.pRdName) &&
				Objects.equals(pRdNumber, that.pRdNumber) &&
				Objects.equals(pRdCompany, that.pRdCompany) &&
				Objects.equals(pRdUnitprice, that.pRdUnitprice) &&
				Objects.equals(pRdTotalprice, that.pRdTotalprice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pRdId, pRId, pRdName, pRdNumber, pRdCompany, pRdUnitprice, pRdTotalprice);
	}
}
