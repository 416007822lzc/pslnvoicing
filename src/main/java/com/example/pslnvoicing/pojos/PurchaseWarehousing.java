package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class PurchaseWarehousing {
	private int pWId;
	private Integer supplierId;
	private Integer warehouseId;
	private Integer empId;
	private String pWWarehousingnumber;
	private String pWPurchasingstaff;
	private Timestamp pWStoragedate;
	private Integer pWApprovalstatus;
	private Integer pWExecutionstatus;
	private Integer pWRepositorystatus;
	private String pWNotesondocuments;
	private Timestamp pWCreationtime;
	private Timestamp pWModificationtime;
	private String pOPurchasenumber;
	private String pRReturnnumber;

	@Id
	@Column(name = "p_w_id")
	public int getpWId() {
		return pWId;
	}

	public void setpWId(int pWId) {
		this.pWId = pWId;
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
	@Column(name = "p_w_warehousingnumber")
	public String getpWWarehousingnumber() {
		return pWWarehousingnumber;
	}

	public void setpWWarehousingnumber(String pWWarehousingnumber) {
		this.pWWarehousingnumber = pWWarehousingnumber;
	}

	@Basic
	@Column(name = "p_w_purchasingstaff")
	public String getpWPurchasingstaff() {
		return pWPurchasingstaff;
	}

	public void setpWPurchasingstaff(String pWPurchasingstaff) {
		this.pWPurchasingstaff = pWPurchasingstaff;
	}

	@Basic
	@Column(name = "p_w_storagedate")
	public Timestamp getpWStoragedate() {
		return pWStoragedate;
	}

	public void setpWStoragedate(Timestamp pWStoragedate) {
		this.pWStoragedate = pWStoragedate;
	}

	@Basic
	@Column(name = "p_w_approvalstatus")
	public Integer getpWApprovalstatus() {
		return pWApprovalstatus;
	}

	public void setpWApprovalstatus(Integer pWApprovalstatus) {
		this.pWApprovalstatus = pWApprovalstatus;
	}

	@Basic
	@Column(name = "p_w_executionstatus")
	public Integer getpWExecutionstatus() {
		return pWExecutionstatus;
	}

	public void setpWExecutionstatus(Integer pWExecutionstatus) {
		this.pWExecutionstatus = pWExecutionstatus;
	}

	@Basic
	@Column(name = "p_w_repositorystatus")
	public Integer getpWRepositorystatus() {
		return pWRepositorystatus;
	}

	public void setpWRepositorystatus(Integer pWRepositorystatus) {
		this.pWRepositorystatus = pWRepositorystatus;
	}

	@Basic
	@Column(name = "p_w_notesondocuments")
	public String getpWNotesondocuments() {
		return pWNotesondocuments;
	}

	public void setpWNotesondocuments(String pWNotesondocuments) {
		this.pWNotesondocuments = pWNotesondocuments;
	}

	@Basic
	@Column(name = "p_w_creationtime")
	public Timestamp getpWCreationtime() {
		return pWCreationtime;
	}

	public void setpWCreationtime(Timestamp pWCreationtime) {
		this.pWCreationtime = pWCreationtime;
	}

	@Basic
	@Column(name = "p_w_modificationtime")
	public Timestamp getpWModificationtime() {
		return pWModificationtime;
	}

	public void setpWModificationtime(Timestamp pWModificationtime) {
		this.pWModificationtime = pWModificationtime;
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
	@Column(name = "p_r_returnnumber")
	public String getpRReturnnumber() {
		return pRReturnnumber;
	}

	public void setpRReturnnumber(String pRReturnnumber) {
		this.pRReturnnumber = pRReturnnumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PurchaseWarehousing that = (PurchaseWarehousing) o;
		return pWId == that.pWId &&
				Objects.equals(supplierId, that.supplierId) &&
				Objects.equals(warehouseId, that.warehouseId) &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(pWWarehousingnumber, that.pWWarehousingnumber) &&
				Objects.equals(pWPurchasingstaff, that.pWPurchasingstaff) &&
				Objects.equals(pWStoragedate, that.pWStoragedate) &&
				Objects.equals(pWApprovalstatus, that.pWApprovalstatus) &&
				Objects.equals(pWExecutionstatus, that.pWExecutionstatus) &&
				Objects.equals(pWRepositorystatus, that.pWRepositorystatus) &&
				Objects.equals(pWNotesondocuments, that.pWNotesondocuments) &&
				Objects.equals(pWCreationtime, that.pWCreationtime) &&
				Objects.equals(pWModificationtime, that.pWModificationtime) &&
				Objects.equals(pOPurchasenumber, that.pOPurchasenumber) &&
				Objects.equals(pRReturnnumber, that.pRReturnnumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pWId, supplierId, warehouseId, empId, pWWarehousingnumber, pWPurchasingstaff, pWStoragedate, pWApprovalstatus, pWExecutionstatus, pWRepositorystatus, pWNotesondocuments, pWCreationtime, pWModificationtime, pOPurchasenumber, pRReturnnumber);
	}
}
