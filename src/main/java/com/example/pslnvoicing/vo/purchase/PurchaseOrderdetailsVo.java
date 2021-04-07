package com.example.pslnvoicing.vo.purchase;

import com.example.pslnvoicing.pojos.PurchaseProductdetails;
import com.example.pslnvoicing.pojos.TbOrderDetails;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderdetailsVo {
    private int pOId;
    private String empname;
    private String supplierName;
    private String warehousename;
    private String supplierContact;
    private String supplierPhone;
    private String supplierContactNumber;
    private String supplierAddress;
    private String pOPurchasenumber ;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp pODocumentdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp pODdeliverydate;
    private Double pOJine;
    private Integer deliveryStatus;
//    private String creatorPerson;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp pOCreationtime;
    private Integer pOApprovalstatus;
    private Integer pOExecutionstatus;
    private String pWWarehousingnumber;
    private List<PurchaseProductdetails>  purchaseProductdetails;

}
