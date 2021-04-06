package com.example.pslnvoicing.model.mapper.workbench;

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

    List<RatifyVo> queryTbDeliveryRatify();

    List<RatifyVo> querySalesReturns();
}
