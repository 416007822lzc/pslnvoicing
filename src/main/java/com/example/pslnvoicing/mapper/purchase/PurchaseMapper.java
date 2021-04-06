package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.pojos.PurchaseProductdetails;
import com.example.pslnvoicing.vo.NewpurchaseOrderVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 采购单业务
 */
@Repository
@Mapper
public interface PurchaseMapper {

    public int addPurchase(PurchaseOrder p);

    public int addPurchaseDetails(@Param("d") List<PurchaseProductdetails> d);
}
