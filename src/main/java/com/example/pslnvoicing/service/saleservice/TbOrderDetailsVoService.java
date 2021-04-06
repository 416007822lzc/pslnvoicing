package com.example.pslnvoicing.service.saleservice;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.vo.TbOrderDetailsVo;

import java.util.List;

public interface TbOrderDetailsVoService {
    List<TbOrderDetailsVo> tbOrderDetailsVoList(String Id);
    int  updateOrderStatus(String id);
    int  rejectOrderStatus(String id);

}
