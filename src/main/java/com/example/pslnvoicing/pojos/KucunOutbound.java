package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunOutbound {
	private int outboundId;
	private Integer ratifId;
	private Integer warehouseId;
	private Integer productId;
	private String outboundNumber;
	private Timestamp outboundTime;
	private String outboundStaff;

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
	@Column(name = "warehouse_id")
	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
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
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(productId, that.productId) &&
				Objects.equals(outboundNumber, that.outboundNumber) &&
				Objects.equals(outboundTime, that.outboundTime) &&
				Objects.equals(outboundStaff, that.outboundStaff);
	}

	@Override
	public int hashCode() {
		return Objects.hash(outboundId, ratifId, warehouseId, productId, outboundNumber, outboundTime, outboundStaff);
	}
}
