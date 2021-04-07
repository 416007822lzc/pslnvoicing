package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;

public interface purchaseOrAllService {
    PageInfo<PurchaseOrder> purchaseOrderall(ParameterVo parameterVo);
}
