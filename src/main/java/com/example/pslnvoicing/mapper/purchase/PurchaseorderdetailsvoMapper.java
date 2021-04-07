package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.vo.purchase.PurchaseOrderdetailsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PurchaseorderdetailsvoMapper {
    /**
     * 采购订单详情
     * @param id 编号
     * @return
     */
    List<PurchaseOrderdetailsVo> purchaseOrderdetailsvoList(String id);


    int updateOrderStatus(String id);

    int rejectOrderStatus(String id);
}
