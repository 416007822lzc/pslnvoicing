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
public class PurchaseWarehousing {
	private int pWId;
	private Integer supplierId;
	private Integer warehouseId;
	private Integer empId;
	private String pWWarehousingnumber;
	private String pWPurchasingstaff;
	private Timestamp pWStoragedate;
	private Double pwJine;
	private Integer pWApprovalstatus;
	private Integer pWExecutionstatus;
	private Integer pWRepositorystatus;
	private String pWNotesondocuments;
	private Timestamp pWCreationtime;
	private Timestamp pWModificationtime;
	private String pOPurchasenumber;
	private String pRReturnnumber;


}
