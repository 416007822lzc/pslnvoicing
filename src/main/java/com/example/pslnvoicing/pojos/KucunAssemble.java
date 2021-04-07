package com.example.pslnvoicing.pojos;

import com.example.pslnvoicing.vo.xgy.ProductVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class KucunAssemble {
	private int assembleId;
	private String assembleOdd;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp assembleDate;
	private Integer assembleMoney;
	//	private Integer assembleProductId;
	private String assembleWarehouse;
	private Integer assembleNumber;
	private Integer assembleCost;
	private String assembleName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp assembleTime;
	private Integer assembleState;
	private String assembleRemark;
	private String assembleCjr;
	private ProductVo product;

	public String getAssembleCjr() {
		return assembleCjr;
	}

	public void setAssembleCjr(String assembleCjr) {
		this.assembleCjr = assembleCjr;
	}

	@Override
	public String toString() {
		return "KucunAssemble{" +
				"assembleId=" + assembleId +
				", assembleOdd='" + assembleOdd + '\'' +
				", assembleDate=" + assembleDate +
				", assembleMoney=" + assembleMoney +
				", assembleWarehouse='" + assembleWarehouse + '\'' +
				", assembleNumber=" + assembleNumber +
				", assembleCost=" + assembleCost +
				", assembleName='" + assembleName + '\'' +
				", assembleTime=" + assembleTime +
				", assembleState=" + assembleState +
				", assembleRemark='" + assembleRemark + '\'' +
				'}';
	}

	@Id
	@Column(name = "assemble_id")
	public int getAssembleId() {
		return assembleId;
	}

	public void setAssembleId(int assembleId) {
		this.assembleId = assembleId;
	}

	@ManyToOne
	@JoinColumn(name = "product_id")
	public ProductVo getProduct() {
		return product;
	}

	public void setProduct(ProductVo product) {
		this.product = product;
	}

	@Basic
	@Column(name = "assemble_odd")
	public String getAssembleOdd() {
		return assembleOdd;
	}

	public void setAssembleOdd(String assembleOdd) {
		this.assembleOdd = assembleOdd;
	}

	@Basic
	@Column(name = "assemble_date")
	public Timestamp getAssembleDate() {
		return assembleDate;
	}

	public void setAssembleDate(Timestamp assembleDate) {
		this.assembleDate = assembleDate;
	}

	@Basic
	@Column(name = "assemble_money")
	public Integer getAssembleMoney() {
		return assembleMoney;
	}

	public void setAssembleMoney(Integer assembleMoney) {
		this.assembleMoney = assembleMoney;
	}



	@Basic
	@Column(name = "assemble_warehouse")
	public String getAssembleWarehouse() {
		return assembleWarehouse;
	}

	public void setAssembleWarehouse(String assembleWarehouse) {
		this.assembleWarehouse = assembleWarehouse;
	}




	@Basic
	@Column(name = "assemble_number")
	public Integer getAssembleNumber() {
		return assembleNumber;
	}

	public void setAssembleNumber(Integer assembleNumber) {
		this.assembleNumber = assembleNumber;
	}

	@Basic
	@Column(name = "assemble_cost")
	public Integer getAssembleCost() {
		return assembleCost;
	}

	public void setAssembleCost(Integer assembleCost) {
		this.assembleCost = assembleCost;
	}

	@Basic
	@Column(name = "assemble_name")
	public String getAssembleName() {
		return assembleName;
	}

	public void setAssembleName(String assembleName) {
		this.assembleName = assembleName;
	}

	@Basic
	@Column(name = "assemble_time")
	public Timestamp getAssembleTime() {
		return assembleTime;
	}

	public void setAssembleTime(Timestamp assembleTime) {
		this.assembleTime = assembleTime;
	}

	@Basic
	@Column(name = "assemble_state")
	public Integer getAssembleState() {
		return assembleState;
	}

	public void setAssembleState(Integer assembleState) {
		this.assembleState = assembleState;
	}

	@Basic
	@Column(name = "assemble_remark")
	public String getAssembleRemark() {
		return assembleRemark;
	}

	public void setAssembleRemark(String assembleRemark) {
		this.assembleRemark = assembleRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAssemble that = (KucunAssemble) o;
		return assembleId == that.assembleId &&
				Objects.equals(assembleOdd, that.assembleOdd) &&
				Objects.equals(assembleDate, that.assembleDate) &&
				Objects.equals(assembleMoney, that.assembleMoney) &&
				Objects.equals(assembleWarehouse, that.assembleWarehouse) &&
				Objects.equals(assembleNumber, that.assembleNumber) &&
				Objects.equals(assembleCost, that.assembleCost) &&
				Objects.equals(assembleName, that.assembleName) &&
				Objects.equals(assembleTime, that.assembleTime) &&
				Objects.equals(assembleState, that.assembleState) &&
				Objects.equals(assembleRemark, that.assembleRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assembleId, assembleOdd, assembleDate, assembleMoney, assembleWarehouse, assembleNumber, assembleCost, assembleName, assembleTime, assembleState, assembleRemark);
	}
}
