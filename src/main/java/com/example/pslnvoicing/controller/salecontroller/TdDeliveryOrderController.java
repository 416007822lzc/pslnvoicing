package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import com.example.pslnvoicing.service.saleservice.TddeliveryorderService;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TdDeliveryOrderController {
    @Autowired
    private TddeliveryorderService tddeliveryorderService;

    @GetMapping("/findAllDeliveryOrder")
    public @ResponseBody
    PageInfo<TdDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo){
        PageInfo<TdDeliveryOrder> orders = tddeliveryorderService.findAllDeliveryOrder(parameterVo);
        return orders;
    }
}
