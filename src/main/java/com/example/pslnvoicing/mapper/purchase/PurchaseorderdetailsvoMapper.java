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

    /**
     * 审批通过
     * @param id
     * @return
     */
    int updateOrderStatus(String id);

    /**
     * 驳回
     * @param id
     * @return
     */
    int rejectOrderStatus(String id);
}
