package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.PurchaseListMapper;
import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class purchaseOrAllServiceImpl implements purchaseOrAllService{

    @Autowired
    private PurchaseListMapper purchaseListMapper;

    @Override
    public PageInfo<PurchaseOrder> purchaseOrderall(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        return new PageInfo<>(purchaseListMapper.purchaseOrderall(parameterVo));
    }
}
