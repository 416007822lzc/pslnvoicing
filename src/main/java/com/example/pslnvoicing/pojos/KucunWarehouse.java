package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunWarehouse {
	private int warehouseId;
	private Integer ratifId;
	private String warehouseNumber;
	private Timestamp warehouseTime;
	private String warehouseStaff;

	@Id
	@Column(name = "warehouse_id")
	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
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
	@Column(name = "warehouse_number")
	public String getWarehouseNumber() {
		return warehouseNumber;
	}

	public void setWarehouseNumber(String warehouseNumber) {
		this.warehouseNumber = warehouseNumber;
	}

	@Basic
	@Column(name = "warehouse_time")
	public Timestamp getWarehouseTime() {
		return warehouseTime;
	}

	public void setWarehouseTime(Timestamp warehouseTime) {
		this.warehouseTime = warehouseTime;
	}

	@Basic
	@Column(name = "warehouse_staff")
	public String getWarehouseStaff() {
		return warehouseStaff;
	}

	public void setWarehouseStaff(String warehouseStaff) {
		this.warehouseStaff = warehouseStaff;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunWarehouse that = (KucunWarehouse) o;
		return warehouseId == that.warehouseId &&
				Objects.equals(ratifId, that.ratifId) &&
				Objects.equals(warehouseNumber, that.warehouseNumber) &&
				Objects.equals(warehouseTime, that.warehouseTime) &&
				Objects.equals(warehouseStaff, that.warehouseStaff);
	}

	@Override
	public int hashCode() {
		return Objects.hash(warehouseId, ratifId, warehouseNumber, warehouseTime, warehouseStaff);
	}
}
