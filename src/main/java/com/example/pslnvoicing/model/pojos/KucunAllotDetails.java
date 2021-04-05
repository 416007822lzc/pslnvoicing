package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


public class KucunAllotDetails {
	private int allotDetailsId;
//	private Integer allotDetailsProductId;
	private Integer allotDetailsNumber;
	private Integer allotDetailsCost;
	private String allotDetailsRemark;
	private PslvoicingProduct products;
	private KucunAllot kucunAllot;

	@Override
	public String toString() {
		return "KucunAllotDetails{" +
				"allotDetailsId=" + allotDetailsId +
				", allotDetailsNumber=" + allotDetailsNumber +
				", allotDetailsCost=" + allotDetailsCost +
				", allotDetailsRemark='" + allotDetailsRemark + '\'' +
				", products=" + products +
				", kucunAllot=" + kucunAllot +
				'}';
	}

	@Id
	@Column(name = "allot_details_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAllotDetailsId() {
		return allotDetailsId;
	}

	public void setAllotDetailsId(int allotDetailsId) {
		this.allotDetailsId = allotDetailsId;
	}


	@ManyToOne
	@JoinColumn(name = "product_id")
	public PslvoicingProduct getProducts() {
		return products;
	}

	public void setProducts(PslvoicingProduct products) {
		this.products = products;
	}

	@ManyToOne
	@JoinColumn(name = "allot_id")
	public KucunAllot getKucunAllot() {
		return kucunAllot;
	}

	public void setKucunAllot(KucunAllot kucunAllot) {
		this.kucunAllot = kucunAllot;
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

				Objects.equals(allotDetailsNumber, that.allotDetailsNumber) &&
				Objects.equals(allotDetailsCost, that.allotDetailsCost) &&
				Objects.equals(allotDetailsRemark, that.allotDetailsRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allotDetailsId,allotDetailsNumber, allotDetailsCost, allotDetailsRemark);
	}
}
