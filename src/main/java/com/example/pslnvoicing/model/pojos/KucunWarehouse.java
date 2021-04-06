package com.example.pslnvoicing.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunWarehouse {
	private int kWarehouseId;
	private Integer ratifId;
	private String kWarehouseNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp kWarehouseTime;
	private String kWarehouseStaff;

	private PslnvoiningWarehouse warehouse;

	@ManyToOne
	public PslnvoiningWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(PslnvoiningWarehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Id
	@Column(name = "k_warehouse_id")
	public int getKWarehouseId() {
		return kWarehouseId;
	}

	public void setKWarehouseId(int kWarehouseId) {
		this.kWarehouseId = kWarehouseId;
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
	@Column(name = "K_warehouse_number")
	public String getKWarehouseNumber() {
		return kWarehouseNumber;
	}

	public void setKWarehouseNumber(String kWarehouseNumber) {
		this.kWarehouseNumber = kWarehouseNumber;
	}

	@Basic
	@Column(name = "k_warehouse_time")
	public Timestamp getKWarehouseTime() {
		return kWarehouseTime;
	}

	public void setKWarehouseTime(Timestamp kWarehouseTime) {
		this.kWarehouseTime = kWarehouseTime;
	}

	@Basic
	@Column(name = "k_warehouse_staff")
	public String getKWarehouseStaff() {
		return kWarehouseStaff;
	}

	public void setKWarehouseStaff(String kWarehouseStaff) {
		this.kWarehouseStaff = kWarehouseStaff;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunWarehouse that = (KucunWarehouse) o;
		return kWarehouseId == that.kWarehouseId &&
				Objects.equals(ratifId, that.ratifId) &&
				Objects.equals(kWarehouseNumber, that.kWarehouseNumber) &&
				Objects.equals(kWarehouseTime, that.kWarehouseTime) &&
				Objects.equals(kWarehouseStaff, that.kWarehouseStaff);
	}

	@Override
	public int hashCode() {
		return Objects.hash(kWarehouseId, ratifId, kWarehouseNumber, kWarehouseTime, kWarehouseStaff);
	}

}
