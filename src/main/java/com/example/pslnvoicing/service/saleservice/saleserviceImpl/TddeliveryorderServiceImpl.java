package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.TddeliveryorderMapper;
import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import com.example.pslnvoicing.service.saleservice.TddeliveryorderService;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TddeliveryorderServiceImpl implements TddeliveryorderService {
    @Autowired
    private TddeliveryorderMapper tddeliveryorderMapper;

    @Override
    public PageInfo<TdDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        PageInfo<TdDeliveryOrder> orders = new PageInfo<>(tddeliveryorderMapper.findAllDeliveryOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));
        return orders;
    }
}
