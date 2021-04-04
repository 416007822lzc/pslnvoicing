package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;


public class KucunAllotDetails {
	private int allotDetailsId;
	private Integer allotDetailsProductId;
	private Integer allotDetailsNumber;
	private Integer allotDetailsCost;
	private String allotDetailsRemark;

	@Id
	@Column(name = "allot_details_id")
	public int getAllotDetailsId() {
		return allotDetailsId;
	}

	public void setAllotDetailsId(int allotDetailsId) {
		this.allotDetailsId = allotDetailsId;
	}

	@Basic
	@Column(name = "allot_details_productId")
	public Integer getAllotDetailsProductId() {
		return allotDetailsProductId;
	}

	public void setAllotDetailsProductId(Integer allotDetailsProductId) {
		this.allotDetailsProductId = allotDetailsProductId;
	}

	@Basic
	@Column(name = "allot_details_number")
	public Integer getAllotDetailsNumber() {
		return allotDetailsNumber;
	}

	public void setAllotDetailsNumber(Integer allotDetailsNumber) {
		this.allotDetailsNumber = allotDetailsNumber;
	}

	@Basic
	@Column(name = "allot_details_cost")
	public Integer getAllotDetailsCost() {
		return allotDetailsCost;
	}

	public void setAllotDetailsCost(Integer allotDetailsCost) {
		this.allotDetailsCost = allotDetailsCost;
	}

	@Basic
	@Column(name = "allot_details_remark")
	public String getAllotDetailsRemark() {
		return allotDetailsRemark;
	}

	public void setAllotDetailsRemark(String allotDetailsRemark) {
		this.allotDetailsRemark = allotDetailsRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAllotDetails that = (KucunAllotDetails) o;
		return allotDetailsId == that.allotDetailsId &&
				Objects.equals(allotDetailsProductId, that.allotDetailsProductId) &&
				Objects.equals(allotDetailsNumber, that.allotDetailsNumber) &&
				Objects.equals(allotDetailsCost, that.allotDetailsCost) &&
				Objects.equals(allotDetailsRemark, that.allotDetailsRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allotDetailsId, allotDetailsProductId, allotDetailsNumber, allotDetailsCost, allotDetailsRemark);
	}
}
