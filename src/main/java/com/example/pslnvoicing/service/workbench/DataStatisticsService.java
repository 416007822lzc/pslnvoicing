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

    List<RatifyVo> queryTbDeliveryRatify();
}
