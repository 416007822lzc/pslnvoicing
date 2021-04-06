package com.example.pslnvoicing.service.impl.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.TbOrderMapper;
import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.service.saleservice.TbOrderService;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Override
    public PageInfo<TbOrder> tbOrderfindAll(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        PageInfo<TbOrder> orders = new PageInfo<>(tbOrderMapper.tbOrderfindAll(parameterVo.getEmpNameOrStoreNameOrNumber(),parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getOrderStatus()));
        return orders;
    }
}
