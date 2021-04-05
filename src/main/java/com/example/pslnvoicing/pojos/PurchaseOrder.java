package com.example.pslnvoicing.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {
	private int pOId;
	private PslnvoicingSuppier supplierId;
	private Integer warehouseId;
	private Integer empId;
	private String pOPurchasenumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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

