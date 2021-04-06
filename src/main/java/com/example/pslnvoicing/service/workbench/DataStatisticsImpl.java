package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.mapper.workbench.DataStatisticsMapper;
import com.example.pslnvoicing.vo.workbench.DataStatisticsVo;
import com.example.pslnvoicing.vo.workbench.RatifyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataStatisticsImpl implements DataStatisticsService {

    @Autowired
    DataStatisticsMapper dataStatisticsMapper;

    @Override
    public Map<String, Integer> queryPaymentByState() {
        Map<String,Integer> debt = new HashMap<>();
        //欠款
        Integer client = dataStatisticsMapper.queryPaymentByState();
        Integer supplier = dataStatisticsMapper.queryReceiptByState();
        //采购
        DataStatisticsVo map = dataStatisticsMapper.queryWarehousingByTimeNow("天");
        DataStatisticsVo map1 = dataStatisticsMapper.queryWarehousingByTimePreviously("天");
        //销售
        DataStatisticsVo timeNow = dataStatisticsMapper.queryDeliverygByTimeNow("天");
        DataStatisticsVo timePreviously = dataStatisticsMapper.queryDeliveryByTimePreviously("天");
        //库存
        DataStatisticsVo queryWarehouseNumber = dataStatisticsMapper.queryWarehouseNumber();
        debt.put("saleBeforeM",map1.getSum());
        debt.put("saleBeforeSum",map1.getCount());
        debt.put("deliverygBeforeM",timePreviously.getSum());
        debt.put("deliverygBeforeSum",timePreviously.getCount());
        debt.put("deliverygAfterM",timeNow.getSum());
        debt.put("deliverygAfterSum",timeNow.getCount());
        debt.put("saleAfterM",map.getSum());
        debt.put("saleAfterSum",map.getCount());
        debt.put("amount",queryWarehouseNumber.getCount());
        debt.put("cost",queryWarehouseNumber.getSum());
        debt.put("client",client);
        debt.put("supplier",supplier);
        return debt;
    }

    @Override
    public Map<String, Integer> queryProcurementAmount(String saleT) {
        DataStatisticsVo procurementAmountNow = dataStatisticsMapper.queryWarehousingByTimeNow(saleT);
        DataStatisticsVo procurementAmountPreviously = dataStatisticsMapper.queryWarehousingByTimePreviously(saleT);
        Map<String,Integer> procurementAmount = new HashMap<>();
        procurementAmount.put("moneyNow",procurementAmountNow.getSum());
        procurementAmount.put("countNow",procurementAmountNow.getCount());
        procurementAmount.put("moneyPreviously",procurementAmountPreviously.getSum());
        procurementAmount.put("countPreviously",procurementAmountPreviously.getCount());

        return procurementAmount;
    }

    @Override
    public Map<String, Integer> querySellAmount(String saleT) {
        DataStatisticsVo procurementAmountNow = dataStatisticsMapper.queryDeliverygByTimeNow(saleT);
        DataStatisticsVo procurementAmountPreviously = dataStatisticsMapper.queryDeliveryByTimePreviously(saleT);
        System.out.println(procurementAmountNow.getSum());
        System.out.println(saleT);
        Map<String,Integer> procurementAmount = new HashMap<>();
        procurementAmount.put("moneyNow",procurementAmountNow.getSum());
        procurementAmount.put("countNow",procurementAmountNow.getCount());
        procurementAmount.put("moneyPreviously",procurementAmountPreviously.getSum());
        procurementAmount.put("countPreviously",procurementAmountPreviously.getCount());

        return procurementAmount;
    }

    @Override
    public List<RatifyVo> queryTbDeliveryRatify(Integer approvalStatus) {

        List<RatifyVo> deliveryRatify = dataStatisticsMapper.queryTbDeliveryRatify(approvalStatus);
        if (deliveryRatify!=null && deliveryRatify.size() != 0) {
            deliveryRatify.forEach(v -> {
                v.setNumberType("销售出库");
            });
        }

        return deliveryRatify;
    }

    @Override
    public List<RatifyVo> querySalesReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.querySalesReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("销售退货");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryTbOrderReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryTbOrderReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("销售订单");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryCapitalReceiptReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryCapitalReceiptReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("销售收款");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryCapitalSaleReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryCapitalSaleReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("销售开票");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryPurchaseWarehousingReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryPurchaseWarehousingReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("采购入库");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryPurchaseOrderReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryPurchaseOrderReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("采购订单");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryPurchaseReturnReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryPurchaseReturnReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("采购退货");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryCapitalPaymentReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryCapitalPaymentReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("付款");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryAssembleReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryAssembleReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("组装单");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryDismountingReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryDismountingReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("拆装单");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryAllotReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryAllotReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("调拨单");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryOutboundReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryOutboundReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("其他出库");
            });
        }
        return ratifyVos;
    }

    @Override
    public List<RatifyVo> queryWarehouseReturns(Integer approvalStatus) {
        List<RatifyVo> ratifyVos = dataStatisticsMapper.queryWarehouseReturns(approvalStatus);
        if (ratifyVos!=null && ratifyVos.size() != 0) {
            ratifyVos.forEach(v -> {
                v.setNumberType("其他入库");
            });
        }
        return ratifyVos;
    }

    public List<RatifyVo> queryAllReturns(Integer approvalStatus) {
        List<RatifyVo> list = new ArrayList<>();
        list.addAll(queryTbDeliveryRatify(approvalStatus));
        list.addAll(querySalesReturns(approvalStatus));
        list.addAll(queryTbOrderReturns(approvalStatus));
        list.addAll(queryCapitalReceiptReturns(approvalStatus));
        list.addAll(queryCapitalSaleReturns(approvalStatus));
        list.addAll(queryPurchaseWarehousingReturns(approvalStatus));
        list.addAll(queryPurchaseOrderReturns(approvalStatus));
        list.addAll(queryPurchaseReturnReturns(approvalStatus));
        list.addAll(queryCapitalPaymentReturns(approvalStatus));
        list.addAll(queryAssembleReturns(approvalStatus));
        list.addAll(queryDismountingReturns(approvalStatus));
        list.addAll(queryAllotReturns(approvalStatus));
        list.addAll(queryOutboundReturns(approvalStatus));
        list.addAll(queryWarehouseReturns(approvalStatus));
        list.forEach(System.out::println);

        return list;
    }
}
