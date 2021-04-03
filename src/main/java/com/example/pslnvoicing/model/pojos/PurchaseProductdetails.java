package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "purchase_productdetails", schema = "pslnvoicing", catalog = "")
public class PurchaseProductdetails {
	private int pPdId;
	private Integer pOId;
	private String pPdCpid;
	private String pPdSname;
	private Integer pPdNumber;
	private byte[] pPdCompany;
	private Double pPdUnitprice;
	private Double pPdTotalprice;

	@Id
	@Column(name = "p_pd_id")
	public int getpPdId() {
		return pPdId;
	}

	public void setpPdId(int pPdId) {
		this.pPdId = pPdId;
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
	@Column(name = "p_pd_cpid")
	public String getpPdCpid() {
		return pPdCpid;
	}

	public void setpPdCpid(String pPdCpid) {
		this.pPdCpid = pPdCpid;
	}

	@Basic
	@Column(name = "p_pd_sname")
	public String getpPdSname() {
		return pPdSname;
	}

	public void setpPdSname(String pPdSname) {
		this.pPdSname = pPdSname;
	}

	@Basic
	@Column(name = "p_pd_number")
	public Integer getpPdNumber() {
		return pPdNumber;
	}

	public void setpPdNumber(Integer pPdNumber) {
		this.pPdNumber = pPdNumber;
	}

	@Basic
	@Column(name = "p_pd_company")
	public byte[] getpPdCompany() {
		return pPdCompany;
	}

	public void setpPdCompany(byte[] pPdCompany) {
		this.pPdCompany = pPdCompany;
	}

	@Basic
	@Column(name = "p_pd_unitprice")
	public Double getpPdUnitprice() {
		return pPdUnitprice;
	}

	public void setpPdUnitprice(Double pPdUnitprice) {
		this.pPdUnitprice = pPdUnitprice;
	}

	@Basic
	@Column(name = "p_pd_totalprice")
	public Double getpPdTotalprice() {
		return pPdTotalprice;
	}

	public void setpPdTotalprice(Double pPdTotalprice) {
		this.pPdTotalprice = pPdTotalprice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PurchaseProductdetails that = (PurchaseProductdetails) o;
		return pPdId == that.pPdId &&
				Objects.equals(pOId, that.pOId) &&
				Objects.equals(pPdCpid, that.pPdCpid) &&
				Objects.equals(pPdSname, that.pPdSname) &&
				Objects.equals(pPdNumber, that.pPdNumber) &&
				Arrays.equals(pPdCompany, that.pPdCompany) &&
				Objects.equals(pPdUnitprice, that.pPdUnitprice) &&
				Objects.equals(pPdTotalprice, that.pPdTotalprice);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(pPdId, pOId, pPdCpid, pPdSname, pPdNumber, pPdUnitprice, pPdTotalprice);
		result = 31 * result + Arrays.hashCode(pPdCompany);
		return result;
	}
}
