package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunOutbound {
	private int outboundId;
	private Integer ratifId;
	private Integer productId;
	private String outboundNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp outboundTime;
	private String outboundStaff;

	private PslnvoiningWarehouse warehouse;
	@ManyToOne
	@JoinColumn(name = "warehouse_id",referencedColumnName = "warehouse_id")
	public PslnvoiningWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(PslnvoiningWarehouse warehouse) {
		this.warehouse = warehouse;
	}


	@Id
	@Column(name = "outbound_id")
	public int getOutboundId() {
		return outboundId;
	}

	public void setOutboundId(int outboundId) {
		this.outboundId = outboundId;
	}

	@Basic
	@Column(name = "ratif_id")
	public Integer getRatifId() {
		return ratifId;
	}

	public void setRatifId(Integer ratifId) {
		this.ratifId = ratifId;
	}

	@Basic
	@Column(name = "product_id")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Basic
	@Column(name = "outbound_number")
	public String getOutboundNumber() {
		return outboundNumber;
	}

	public void setOutboundNumber(String outboundNumber) {
		this.outboundNumber = outboundNumber;
	}

	@Basic
	@Column(name = "outbound_time")
	public Timestamp getOutboundTime() {
		return outboundTime;
	}

	public void setOutboundTime(Timestamp outboundTime) {
		this.outboundTime = outboundTime;
	}

	@Basic
	@Column(name = "outbound_staff")
	public String getOutboundStaff() {
		return outboundStaff;
	}

	public void setOutboundStaff(String outboundStaff) {
		this.outboundStaff = outboundStaff;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunOutbound that = (KucunOutbound) o;
		return outboundId == that.outboundId &&
				Objects.equals(ratifId, that.ratifId) &&
				Objects.equals(productId, that.productId) &&
				Objects.equals(outboundNumber, that.outboundNumber) &&
				Objects.equals(outboundTime, that.outboundTime) &&
				Objects.equals(outboundStaff, that.outboundStaff);
	}

	@Override
	public int hashCode() {
		return Objects.hash(outboundId, ratifId, productId, outboundNumber, outboundTime, outboundStaff);
	}
}
