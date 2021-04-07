package com.example.pslnvoicing.vo.purchase;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.pojos.PurchaseProductdetails;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewpurchaseOrderVo {
    private Integer supplierId;//供应商Id
    private Integer warehouseId;//仓库id
    private Integer empId;//员工Id
    private String shuzi;//采购单编号
    private Double zj;//金额总计
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp jq;//单据日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp sj;//交货日期
    private List<PslvoicingProduct> pslvoicingproducts;//采购单产品详情
}
