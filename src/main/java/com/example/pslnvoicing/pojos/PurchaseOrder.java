package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class PurchaseOrder {
	private int pOId;
	private Integer supplierId;
	private Integer warehouseId;
	private Integer empId;
	private String pOPurchasenumber;
	private Timestamp pODocumentdate;
	private Timestamp pODeliverydate;
	private String pOPurchasingstaff;
	private Integer pOApprovalstatus;
	private Timestamp pOFinalapprovaltime;
	private Integer pOExecutionstatus;
	private Integer pORepositorystatus;
	private String pONotesondocuments;
	private Timestamp pOCreationtime;
	private Timestamp pOModificationtime;
	private String pWWarehousingnumber;

	@Id
	@Column(name = "p_o_id")
	public int getpOId() {
		return pOId;
	}

	public void setpOId(int pOId) {
		this.pOId = pOId;
	}

	@Basic
	@Column(name = "supplier_id")
	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
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
	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Basic
	@Column(name = "p_o_purchasenumber")
	public String getpOPurchasenumber() {
		return pOPurchasenumber;
	}

	public void setpOPurchasenumber(String pOPurchasenumber) {
		this.pOPurchasenumber = pOPurchasenumber;
	}

	@Basic
	@Column(name = "p_o_documentdate")
	public Timestamp getpODocumentdate() {
		return pODocumentdate;
	}

	public void setpODocumentdate(Timestamp pODocumentdate) {
		this.pODocumentdate = pODocumentdate;
	}

	@Basic
	@Column(name = "p_o_deliverydate")
	public Timestamp getpODeliverydate() {
		return pODeliverydate;
	}

	public void setpODeliverydate(Timestamp pODeliverydate) {
		this.pODeliverydate = pODeliverydate;
	}

	@Basic
	@Column(name = "p_o_purchasingstaff")
	public String getpOPurchasingstaff() {
		return pOPurchasingstaff;
	}

	public void setpOPurchasingstaff(String pOPurchasingstaff) {
		this.pOPurchasingstaff = pOPurchasingstaff;
	}

	@Basic
	@Column(name = "p_o_approvalstatus")
	public Integer getpOApprovalstatus() {
		return pOApprovalstatus;
	}

	public void setpOApprovalstatus(Integer pOApprovalstatus) {
		this.pOApprovalstatus = pOApprovalstatus;
	}

	@Basic
	@Column(name = "p_o_finalapprovaltime")
	public Timestamp getpOFinalapprovaltime() {
		return pOFinalapprovaltime;
	}

	public void setpOFinalapprovaltime(Timestamp pOFinalapprovaltime) {
		this.pOFinalapprovaltime = pOFinalapprovaltime;
	}

	@Basic
	@Column(name = "p_o_executionstatus")
	public Integer getpOExecutionstatus() {
		return pOExecutionstatus;
	}

	public void setpOExecutionstatus(Integer pOExecutionstatus) {
		this.pOExecutionstatus = pOExecutionstatus;
	}

	@Basic
	@Column(name = "p_o_repositorystatus")
	public Integer getpORepositorystatus() {
		return pORepositorystatus;
	}

	public void setpORepositorystatus(Integer pORepositorystatus) {
		this.pORepositorystatus = pORepositorystatus;
	}

	@Basic
	@Column(name = "p_o_notesondocuments")
	public String getpONotesondocuments() {
		return pONotesondocuments;
	}

	public void setpONotesondocuments(String pONotesondocuments) {
		this.pONotesondocuments = pONotesondocuments;
	}

	@Basic
	@Column(name = "p_o_creationtime")
	public Timestamp getpOCreationtime() {
		return pOCreationtime;
	}

	public void setpOCreationtime(Timestamp pOCreationtime) {
		this.pOCreationtime = pOCreationtime;
	}

	@Basic
	@Column(name = "p_o_modificationtime")
	public Timestamp getpOModificationtime() {
		return pOModificationtime;
	}

	public void setpOModificationtime(Timestamp pOModificationtime) {
		this.pOModificationtime = pOModificationtime;
	}

	@Basic
	@Column(name = "p_w_warehousingnumber")
	public String getpWWarehousingnumber() {
		return pWWarehousingnumber;
	}

	public void setpWWarehousingnumber(String pWWarehousingnumber) {
		this.pWWarehousingnumber = pWWarehousingnumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PurchaseOrder that = (PurchaseOrder) o;
		return pOId == that.pOId &&
				Objects.equals(supplierId, that.supplierId) &&
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(pOPurchasenumber, that.pOPurchasenumber) &&
				Objects.equals(pODocumentdate, that.pODocumentdate) &&
				Objects.equals(pODeliverydate, that.pODeliverydate) &&
				Objects.equals(pOPurchasingstaff, that.pOPurchasingstaff) &&
				Objects.equals(pOApprovalstatus, that.pOApprovalstatus) &&
				Objects.equals(pOFinalapprovaltime, that.pOFinalapprovaltime) &&
				Objects.equals(pOExecutionstatus, that.pOExecutionstatus) &&
				Objects.equals(pORepositorystatus, that.pORepositorystatus) &&
				Objects.equals(pONotesondocuments, that.pONotesondocuments) &&
				Objects.equals(pOCreationtime, that.pOCreationtime) &&
				Objects.equals(pOModificationtime, that.pOModificationtime) &&
				Objects.equals(pWWarehousingnumber, that.pWWarehousingnumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pOId, supplierId, warehouseId, empId, pOPurchasenumber, pODocumentdate, pODeliverydate, pOPurchasingstaff, pOApprovalstatus, pOFinalapprovaltime, pOExecutionstatus, pORepositorystatus, pONotesondocuments, pOCreationtime, pOModificationtime, pWWarehousingnumber);
	}
}
