package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "purchase_storagedetails", schema = "pslnvoicing", catalog = "")
public class PurchaseStoragedetails {
	private int pSdId;
	private Integer pWId;
	private String pSdName;
	private Integer pSdNumber;
	private String pSdCompany;
	private Double pSdUnitprice;
	private Double pSdTotalprice;

	@Id
	@Column(name = "p_sd_id")
	public int getpSdId() {
		return pSdId;
	}

	public void setpSdId(int pSdId) {
		this.pSdId = pSdId;
	}

	@Basic
	@Column(name = "p_w_id")
	public Integer getpWId() {
		return pWId;
	}

	public void setpWId(Integer pWId) {
		this.pWId = pWId;
	}

	@Basic
	@Column(name = "p_sd_name")
	public String getpSdName() {
		return pSdName;
	}

	public void setpSdName(String pSdName) {
		this.pSdName = pSdName;
	}

	@Basic
	@Column(name = "p_sd_number")
	public Integer getpSdNumber() {
		return pSdNumber;
	}

	public void setpSdNumber(Integer pSdNumber) {
		this.pSdNumber = pSdNumber;
	}

	@Basic
	@Column(name = "p_sd_company")
	public String getpSdCompany() {
		return pSdCompany;
	}

	public void setpSdCompany(String pSdCompany) {
		this.pSdCompany = pSdCompany;
	}

	@Basic
	@Column(name = "p_sd_unitprice")
	public Double getpSdUnitprice() {
		return pSdUnitprice;
	}

	public void setpSdUnitprice(Double pSdUnitprice) {
		this.pSdUnitprice = pSdUnitprice;
	}

	@Basic
	@Column(name = "p_sd_totalprice")
	public Double getpSdTotalprice() {
		return pSdTotalprice;
	}

	public void setpSdTotalprice(Double pSdTotalprice) {
		this.pSdTotalprice = pSdTotalprice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PurchaseStoragedetails that = (PurchaseStoragedetails) o;
		return pSdId == that.pSdId &&
				Objects.equals(pWId, that.pWId) &&
				Objects.equals(pSdName, that.pSdName) &&
				Objects.equals(pSdNumber, that.pSdNumber) &&
				Objects.equals(pSdCompany, that.pSdCompany) &&
				Objects.equals(pSdUnitprice, that.pSdUnitprice) &&
				Objects.equals(pSdTotalprice, that.pSdTotalprice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pSdId, pWId, pSdName, pSdNumber, pSdCompany, pSdUnitprice, pSdTotalprice);
	}
}
