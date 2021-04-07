package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.vo.NewpurchaseOrderVo;

public interface PurchaseService {
    public Boolean addCaigou(NewpurchaseOrderVo newpurchaseOrderVo);
}
