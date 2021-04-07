/*
package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.PurchaseDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseDetailsImpl {
    @Autowired
    private PurchaseDetailsMapper;

    @Override
    public PageInfo<TdDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        PageInfo<TdDeliveryOrder> orders = new PageInfo<>(tddeliveryorderMapper.findAllDeliveryOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));
        return orders;
    }
}
*/
