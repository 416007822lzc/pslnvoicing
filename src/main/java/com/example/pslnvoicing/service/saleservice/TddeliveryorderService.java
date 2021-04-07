package com.example.pslnvoicing.service.saleservice;

import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;

public interface TddeliveryorderService {
    PageInfo<TdDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo);
}
