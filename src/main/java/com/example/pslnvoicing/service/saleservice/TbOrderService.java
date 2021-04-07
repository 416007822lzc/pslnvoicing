package com.example.pslnvoicing.service.saleservice;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TbOrderService {
    PageInfo<TbOrder> tbOrderfindAll(ParameterVo parameterVo);
}
