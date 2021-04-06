package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.service.saleservice.PslnvoiningWarehouseService;
import com.example.pslnvoicing.conn.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PslnvoiningWarehouseController {
    @Autowired
    private PslnvoiningWarehouseService kucunWarehouseService;

    @RequestMapping("/PslnvoiningWarehouseAll")
    public @ResponseBody CommonResult personnelEmpAll(){
        try {
            List<PslnvoiningWarehouse> pslnvoiningWarehouses = kucunWarehouseService.pslnvoiningWarehouseList();
            return new CommonResult(200,"查询成功",pslnvoiningWarehouses);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500,"查询失败");
    }
}
