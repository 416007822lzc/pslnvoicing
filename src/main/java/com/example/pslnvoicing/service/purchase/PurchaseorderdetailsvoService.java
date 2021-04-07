package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.vo.TbOrderDetailsVo;
import com.example.pslnvoicing.vo.purchase.PurchaseOrderdetailsVo;

import java.util.List;

public interface PurchaseorderdetailsvoService {
    /**
     * 采购订单详情
     * @param id 编号
     * @return
     */
    List<PurchaseOrderdetailsVo> purchaseOrderdetailsvoList(String id);
    int  updateOrderStatus(String id);
    int  rejectOrderStatus(String id);

}
