package com.example.pslnvoicing.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {
	private int pOId;
	private PslnvoicingSuppier supplierId;
	private PslnvoiningWarehouse warehouseId;
	private PersonnelEmp empId;
	private String pOPurchasenumber;
	private Timestamp pODocumentdate;
	private Timestamp pODeliverydate;
	private Double pOJine;
	private String pOPurchasingstaff;
	private Integer pOApprovalstatus;
	private Timestamp pOFinalapprovaltime;
	private Integer pOExecutionstatus;
	private Integer pORepositorystatus;
	private String pONotesondocuments;
	private Timestamp pOCreationtime;
	private Timestamp pOModificationtime;
	private String pWWarehousingnumber;


}
