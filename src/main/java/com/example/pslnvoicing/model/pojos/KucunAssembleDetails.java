package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class KucunAssembleDetails {
	private int assembleDetailsId;
	private String assembleDetailsWarehouse;
	private Integer assembleDetailsNumber;
	private Integer assembleDetailsCost;
	private String assembleDetailsRemark;
	private PslvoicingProduct product;
	private KucunAssemble kucunAssemble;

	@ManyToOne
	@JoinColumn(name = "assemble_id")
	public KucunAssemble getKucunAssemble() {
		return kucunAssemble;
	}

	public void setKucunAssemble(KucunAssemble kucunAssemble) {
		this.kucunAssemble = kucunAssemble;
	}

	@Id
	@Column(name = "assemble_details_id")
	public int getAssembleDetailsId() {
		return assembleDetailsId;
	}

	public void setAssembleDetailsId(int assembleDetailsId) {
		this.assembleDetailsId = assembleDetailsId;
	}

	@ManyToOne
	@JoinColumn(name = "product_id")
	public PslvoicingProduct getProduct() {
		return product;
	}

	public void setProduct(PslvoicingProduct product) {
		this.product = product;
	}

	@Basic
	@Column(name = "assemble_details_warehouse")
	public String getAssembleDetailsWarehouse() {
		return assembleDetailsWarehouse;
	}

	public void setAssembleDetailsWarehouse(String assembleDetailsWarehouse) {
		this.assembleDetailsWarehouse = assembleDetailsWarehouse;
	}

	@Basic
	@Column(name = "assemble_details_number")
	public Integer getAssembleDetailsNumber() {
		return assembleDetailsNumber;
	}

	public void setAssembleDetailsNumber(Integer assembleDetailsNumber) {
		this.assembleDetailsNumber = assembleDetailsNumber;
	}

	@Basic
	@Column(name = "assemble_details_cost")
	public Integer getAssembleDetailsCost() {
		return assembleDetailsCost;
	}

	public void setAssembleDetailsCost(Integer assembleDetailsCost) {
		this.assembleDetailsCost = assembleDetailsCost;
	}

	@Basic
	@Column(name = "assemble_details_remark")
	public String getAssembleDetailsRemark() {
		return assembleDetailsRemark;
	}

	public void setAssembleDetailsRemark(String assembleDetailsRemark) {
		this.assembleDetailsRemark = assembleDetailsRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAssembleDetails that = (KucunAssembleDetails) o;
		return assembleDetailsId == that.assembleDetailsId &&
				Objects.equals(assembleDetailsWarehouse, that.assembleDetailsWarehouse) &&
				Objects.equals(assembleDetailsNumber, that.assembleDetailsNumber) &&
				Objects.equals(assembleDetailsCost, that.assembleDetailsCost) &&
				Objects.equals(assembleDetailsRemark, that.assembleDetailsRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assembleDetailsId, assembleDetailsWarehouse, assembleDetailsNumber, assembleDetailsCost, assembleDetailsRemark);
	}
}