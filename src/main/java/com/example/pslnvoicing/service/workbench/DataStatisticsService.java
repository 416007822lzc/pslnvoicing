package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.vo.workbench.RatifyVo;

import java.util.List;
import java.util.Map;


public interface DataStatisticsService {
    //查询基本数据
    Map<String,Integer> queryPaymentByState();

    //查询采购额
    Map<String,Integer> queryProcurementAmount(String saleT);

    //查询销售额
    Map<String,Integer> querySellAmount(String saleT);

    List<RatifyVo> queryTbDeliveryRatify(Integer approvalStatus);

    List<RatifyVo> querySalesReturns(Integer approvalStatus);

    //销售订单审批
    List<RatifyVo> queryTbOrderReturns(Integer approvalStatus);
    //销售收款
    List<RatifyVo> queryCapitalReceiptReturns(Integer approvalStatus);
    //销售开票
    List<RatifyVo> queryCapitalSaleReturns(Integer approvalStatus);
    //    采购入库
    List<RatifyVo> queryPurchaseWarehousingReturns(Integer approvalStatus);
    //采购单
    List<RatifyVo> queryPurchaseOrderReturns(Integer approvalStatus);
    //采购退货
    List<RatifyVo> queryPurchaseReturnReturns(Integer approvalStatus);
    //采购付款
    List<RatifyVo> queryCapitalPaymentReturns(Integer approvalStatus);
    //    //采购收票
//    List<RatifyVo> queryCapitalPurchaseReturns(Integer approvalStatus);
    //组装单
    List<RatifyVo> queryAssembleReturns(Integer approvalStatus);
    //拆装单
    List<RatifyVo> queryDismountingReturns(Integer approvalStatus);
    //调拨单
    List<RatifyVo> queryAllotReturns(Integer approvalStatus);
    //其他出库
    List<RatifyVo> queryOutboundReturns(Integer approvalStatus);
    //其他入库
    List<RatifyVo> queryWarehouseReturns(Integer approvalStatus);

    List<RatifyVo> queryAllReturns(Integer approvalStatus);

}
