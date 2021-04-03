package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class KucunWarehouseDetail {
	private int warehouseDetailId;
	private KucunWarehouse kucunWarehouseByWarehouseId;

	@Id
	@Column(name = "warehouse_detail_id")
	public int getWarehouseDetailId() {
		return warehouseDetailId;
	}

	public void setWarehouseDetailId(int warehouseDetailId) {
		this.warehouseDetailId = warehouseDetailId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunWarehouseDetail that = (KucunWarehouseDetail) o;
		return warehouseDetailId == that.warehouseDetailId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(warehouseDetailId);
	}

	@ManyToOne
	@JoinColumn(name = "warehouse_id", referencedColumnName = "warehouse_id")
	public KucunWarehouse getKucunWarehouseByWarehouseId() {
		return kucunWarehouseByWarehouseId;
	}

	public void setKucunWarehouseByWarehouseId(KucunWarehouse kucunWarehouseByWarehouseId) {
		this.kucunWarehouseByWarehouseId = kucunWarehouseByWarehouseId;
	}
}
