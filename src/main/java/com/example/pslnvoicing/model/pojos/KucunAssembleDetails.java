package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kucun_assemble_details", schema = "pslnvoicing", catalog = "")
public class KucunAssembleDetails {
	private int assembleDetailsId;
	private Integer assembleDetailsProuctId;
	private Integer assembleDetailsWarehouse;
	private Integer assembleDetailsNumber;
	private Integer assembleDetailsCost;
	private String assembleDetailsRemark;

	@Id
	@Column(name = "assemble_details_id")
	public int getAssembleDetailsId() {
		return assembleDetailsId;
	}

	public void setAssembleDetailsId(int assembleDetailsId) {
		this.assembleDetailsId = assembleDetailsId;
	}

	@Basic
	@Column(name = "assemble_details_prouctId")
	public Integer getAssembleDetailsProuctId() {
		return assembleDetailsProuctId;
	}

	public void setAssembleDetailsProuctId(Integer assembleDetailsProuctId) {
		this.assembleDetailsProuctId = assembleDetailsProuctId;
	}

	@Basic
	@Column(name = "assemble_details_warehouse")
	public Integer getAssembleDetailsWarehouse() {
		return assembleDetailsWarehouse;
	}

	public void setAssembleDetailsWarehouse(Integer assembleDetailsWarehouse) {
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
				Objects.equals(assembleDetailsProuctId, that.assembleDetailsProuctId) &&
				Objects.equals(assembleDetailsWarehouse, that.assembleDetailsWarehouse) &&
				Objects.equals(assembleDetailsNumber, that.assembleDetailsNumber) &&
				Objects.equals(assembleDetailsCost, that.assembleDetailsCost) &&
				Objects.equals(assembleDetailsRemark, that.assembleDetailsRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assembleDetailsId, assembleDetailsProuctId, assembleDetailsWarehouse, assembleDetailsNumber, assembleDetailsCost, assembleDetailsRemark);
	}
}
