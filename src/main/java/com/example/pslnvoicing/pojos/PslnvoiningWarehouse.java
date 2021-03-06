package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


public class PslnvoiningWarehouse {
	private String warehouseName;
	private int warehouseId;
	private String warehouseNum;
	private String warehouseAddress;
	private String warehouseHead;
	private String warehousePhone;
	private int warehouseCall;
	private String warehouseNote;
	private int warehouseDisable;
	private int warehouseAmount;



	@Basic
	@Column(name = "warehouse_name")
	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	@Id
	@Column(name = "warehouse_id")
	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Basic
	@Column(name = "warehouse_num")
	public String getWarehouseNum() {
		return warehouseNum;
	}

	public void setWarehouseNum(String warehouseNum) {
		this.warehouseNum = warehouseNum;
	}

	@Basic
	@Column(name = "warehouse_address")
	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	@Basic
	@Column(name = "warehouse_head")
	public String getWarehouseHead() {
		return warehouseHead;
	}

	public void setWarehouseHead(String warehouseHead) {
		this.warehouseHead = warehouseHead;
	}

	@Basic
	@Column(name = "warehouse_phone")
	public String getWarehousePhone() {
		return warehousePhone;
	}

	public void setWarehousePhone(String warehousePhone) {
		this.warehousePhone = warehousePhone;
	}

	@Basic
	@Column(name = "warehouse_call")
	public int getWarehouseCall() {
		return warehouseCall;
	}

	public void setWarehouseCall(int warehouseCall) {
		this.warehouseCall = warehouseCall;
	}

	@Basic
	@Column(name = "warehouse_note")
	public String getWarehouseNote() {
		return warehouseNote;
	}

	public void setWarehouseNote(String warehouseNote) {
		this.warehouseNote = warehouseNote;
	}

	@Basic
	@Column(name = "warehouse_disable")
	public int getWarehouseDisable() {
		return warehouseDisable;
	}

	public void setWarehouseDisable(int warehouseDisable) {
		this.warehouseDisable = warehouseDisable;
	}

	@Basic
	@Column(name = "warehouse_amount")
	public int getWarehouseAmount() {
		return warehouseAmount;
	}

	public void setWarehouseAmount(int warehouseAmount) {
		this.warehouseAmount = warehouseAmount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslnvoiningWarehouse that = (PslnvoiningWarehouse) o;
		return warehouseId == that.warehouseId &&
				warehouseNum == that.warehouseNum &&
				warehousePhone == that.warehousePhone &&
				warehouseCall == that.warehouseCall &&
				warehouseDisable == that.warehouseDisable &&
				Objects.equals(warehouseName, that.warehouseName) &&
				Objects.equals(warehouseAddress, that.warehouseAddress) &&
				Objects.equals(warehouseHead, that.warehouseHead) &&
				Objects.equals(warehouseAmount, that.warehouseAmount) &&
				Objects.equals(warehouseNote, that.warehouseNote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(warehouseName, warehouseId, warehouseNum, warehouseAddress, warehouseHead, warehousePhone, warehouseCall, warehouseNote, warehouseDisable,warehouseAmount);
	}

	private List<KucunWarehouse> kucunWarehouses;


	@OneToMany
	public List<KucunWarehouse> getKucunWarehouses() {
		return kucunWarehouses;
	}

	public void setKucunWarehouses(List<KucunWarehouse> kucunWarehouses) {
		this.kucunWarehouses = kucunWarehouses;
	}
}
