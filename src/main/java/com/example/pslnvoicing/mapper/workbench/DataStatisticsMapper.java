package com.example.pslnvoicing.mapper.workbench;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.CapitalReceipt;
import com.example.pslnvoicing.vo.workbench.DataStatisticsVo;
import com.example.pslnvoicing.vo.workbench.RatifyVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface DataStatisticsMapper {
    //查询未付款
    Integer queryPaymentByState();

    //查询未收款
    Integer queryReceiptByState();

    //查询本段时间内的采购额
    DataStatisticsVo queryWarehousingByTimeNow(String saleT);
    DataStatisticsVo queryWarehousingByTimePreviously(String saleT);

    //查询本段时间内的销售额
    DataStatisticsVo queryDeliverygByTimeNow(String saleT);
    DataStatisticsVo queryDeliveryByTimePreviously(String saleT);

    DataStatisticsVo queryWarehouseNumber();

    //销售出库审批
    List<RatifyVo> queryTbDeliveryRatify(Integer approvalStatus);

    //销售退货
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

    /***
     *
     * @param numberType 单据类型
     * @param approvalStatus 审批状态
     * @param id 审批数据的id
     * @return
     */
    Integer updateReturnsRatify(String numberType, Integer approvalStatus, Integer id);

}
