package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.service.saleservice.TbOrderService;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TbOrderController {
    @Autowired
    private TbOrderService tbOrderService;

    @RequestMapping("/TbOrderAll")
    public @ResponseBody PageInfo<TbOrder> findAll(ParameterVo parameterVo){
        PageInfo<TbOrder> orders = tbOrderService.tbOrderfindAll(parameterVo);
//        for (TbOrder erpOrder : orders.getList()) {
//            System.out.println(erpOrder);
//        }
        return orders;
    }
}
