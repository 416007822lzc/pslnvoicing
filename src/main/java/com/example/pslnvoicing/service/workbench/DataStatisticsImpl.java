package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.model.mapper.workbench.DataStatisticsMapper;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.vo.workbench.DataStatisticsVo;
import com.example.pslnvoicing.vo.workbench.RatifyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<RatifyVo> queryTbDeliveryRatify() {
        List<RatifyVo> salesReturns = dataStatisticsMapper.querySalesReturns();
        List<RatifyVo> deliveryRatify = dataStatisticsMapper.queryTbDeliveryRatify();

        return dataStatisticsMapper.queryTbDeliveryRatify();
    }
}
