package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchase_return", schema = "pslnvoicing", catalog = "")
public class PurchaseReturn {
	private int pRId;
	private Integer supplierId;
	private Integer warehouseId;
	private Integer empId;
	private String pRReturnnumber;
	private String pRPurchasingstaff;
	private Timestamp pRDate;
	private Integer pRApprovalstatus;
	private Integer pRExecutionstatus;
	private Integer pRRepositorystatus;
	private String pRNotesondocuments;
	private Timestamp pRCreationtime;
	private Timestamp pRModificationtime;
	private String pWWarehousingnumber;

	@Id
	@Column(name = "p_r_id")
	public int getpRId() {
		return pRId;
	}

	public void setpRId(int pRId) {
		this.pRId = pRId;
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
	@Column(name = "p_r_returnnumber")
	public String getpRReturnnumber() {
		return pRReturnnumber;
	}

	public void setpRReturnnumber(String pRReturnnumber) {
		this.pRReturnnumber = pRReturnnumber;
	}

	@Basic
	@Column(name = "p_r_purchasingstaff")
	public String getpRPurchasingstaff() {
		return pRPurchasingstaff;
	}

	public void setpRPurchasingstaff(String pRPurchasingstaff) {
		this.pRPurchasingstaff = pRPurchasingstaff;
	}

	@Basic
	@Column(name = "p_r_date")
	public Timestamp getpRDate() {
		return pRDate;
	}

	public void setpRDate(Timestamp pRDate) {
		this.pRDate = pRDate;
	}

	@Basic
	@Column(name = "p_r_approvalstatus")
	public Integer getpRApprovalstatus() {
		return pRApprovalstatus;
	}

	public void setpRApprovalstatus(Integer pRApprovalstatus) {
		this.pRApprovalstatus = pRApprovalstatus;
	}

	@Basic
	@Column(name = "p_r_executionstatus")
	public Integer getpRExecutionstatus() {
		return pRExecutionstatus;
	}

	public void setpRExecutionstatus(Integer pRExecutionstatus) {
		this.pRExecutionstatus = pRExecutionstatus;
	}

	@Basic
	@Column(name = "p_r_repositorystatus")
	public Integer getpRRepositorystatus() {
		return pRRepositorystatus;
	}

	public void setpRRepositorystatus(Integer pRRepositorystatus) {
		this.pRRepositorystatus = pRRepositorystatus;
	}

	@Basic
	@Column(name = "p_r_notesondocuments")
	public String getpRNotesondocuments() {
		return pRNotesondocuments;
	}

	public void setpRNotesondocuments(String pRNotesondocuments) {
		this.pRNotesondocuments = pRNotesondocuments;
	}

	@Basic
	@Column(name = "p_r_creationtime")
	public Timestamp getpRCreationtime() {
		return pRCreationtime;
	}

	public void setpRCreationtime(Timestamp pRCreationtime) {
		this.pRCreationtime = pRCreationtime;
	}

	@Basic
	@Column(name = "p_r_modificationtime")
	public Timestamp getpRModificationtime() {
		return pRModificationtime;
	}

	public void setpRModificationtime(Timestamp pRModificationtime) {
		this.pRModificationtime = pRModificationtime;
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
		PurchaseReturn that = (PurchaseReturn) o;
		return pRId == that.pRId &&
				Objects.equals(supplierId, that.supplierId) &&
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(pRReturnnumber, that.pRReturnnumber) &&
				Objects.equals(pRPurchasingstaff, that.pRPurchasingstaff) &&
				Objects.equals(pRDate, that.pRDate) &&
				Objects.equals(pRApprovalstatus, that.pRApprovalstatus) &&
				Objects.equals(pRExecutionstatus, that.pRExecutionstatus) &&
				Objects.equals(pRRepositorystatus, that.pRRepositorystatus) &&
				Objects.equals(pRNotesondocuments, that.pRNotesondocuments) &&
				Objects.equals(pRCreationtime, that.pRCreationtime) &&
				Objects.equals(pRModificationtime, that.pRModificationtime) &&
				Objects.equals(pWWarehousingnumber, that.pWWarehousingnumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pRId, supplierId, warehouseId, empId, pRReturnnumber, pRPurchasingstaff, pRDate, pRApprovalstatus, pRExecutionstatus, pRRepositorystatus, pRNotesondocuments, pRCreationtime, pRModificationtime, pWWarehousingnumber);
	}
}
