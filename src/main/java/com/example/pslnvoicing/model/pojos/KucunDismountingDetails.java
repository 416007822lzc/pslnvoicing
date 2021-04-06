package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class KucunDismountingDetails {
	private int dismountingDetailsId;
	private Integer dismountingId;
//	private Integer dismountingDetailsProuctId;
	private Integer dismountingDetailsWarehouse;
	private Integer dismountingDetailsNumber;
	private Integer dismountingDetailsCost;
	private String dismountingDetailsRemark;
	private PslvoicingProduct product;


	public PslvoicingProduct getProduct() {
		return product;
	}

	public void setProduct(PslvoicingProduct product) {
		this.product = product;
	}

	public Integer getDismountingId() {
		return dismountingId;
	}

	public void setDismountingId(Integer dismountingId) {
		this.dismountingId = dismountingId;
	}

	@Id
	@Column(name = "dismounting_details_id")
	public int getDismountingDetailsId() {
		return dismountingDetailsId;
	}

	public void setDismountingDetailsId(int dismountingDetailsId) {
		this.dismountingDetailsId = dismountingDetailsId;
	}


	@Basic
	@Column(name = "dismounting_details_warehouse")
	public Integer getDismountingDetailsWarehouse() {
		return dismountingDetailsWarehouse;
	}

	public void setDismountingDetailsWarehouse(Integer dismountingDetailsWarehouse) {
		this.dismountingDetailsWarehouse = dismountingDetailsWarehouse;
	}

	@Basic
	@Column(name = "dismounting_details_number")
	public Integer getDismountingDetailsNumber() {
		return dismountingDetailsNumber;
	}

	public void setDismountingDetailsNumber(Integer dismountingDetailsNumber) {
		this.dismountingDetailsNumber = dismountingDetailsNumber;
	}

	@Basic
	@Column(name = "dismounting_details_cost")
	public Integer getDismountingDetailsCost() {
		return dismountingDetailsCost;
	}

	public void setDismountingDetailsCost(Integer dismountingDetailsCost) {
		this.dismountingDetailsCost = dismountingDetailsCost;
	}

	@Basic
	@Column(name = "dismounting_details_remark")
	public String getDismountingDetailsRemark() {
		return dismountingDetailsRemark;
	}

	public void setDismountingDetailsRemark(String dismountingDetailsRemark) {
		this.dismountingDetailsRemark = dismountingDetailsRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunDismountingDetails that = (KucunDismountingDetails) o;
		return dismountingDetailsId == that.dismountingDetailsId &&
				Objects.equals(dismountingDetailsWarehouse, that.dismountingDetailsWarehouse) &&
				Objects.equals(dismountingDetailsNumber, that.dismountingDetailsNumber) &&
				Objects.equals(dismountingDetailsCost, that.dismountingDetailsCost) &&
				Objects.equals(dismountingDetailsRemark, that.dismountingDetailsRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dismountingDetailsId, dismountingDetailsWarehouse, dismountingDetailsNumber, dismountingDetailsCost, dismountingDetailsRemark);
	}
}
