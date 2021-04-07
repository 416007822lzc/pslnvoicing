package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.service.saleservice.CustomerService;
import com.example.pslnvoicing.conn.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/CustomerAll")
    public @ResponseBody CommonResult customerAll(){
        try {
        List<PslnvoicingClient> pslnvoicingClients = customerService.pslnvoicingClientList();
                return new CommonResult(200,"查询成功",pslnvoicingClients);
        } catch (Exception e) {
            e.printStackTrace();
        }
                return new CommonResult(500,"查询失败");
    }
}
