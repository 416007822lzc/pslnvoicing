package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.service.PslnvoicingWarehouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicdata/warehouse")
public class PslnvoicingWarehouseController {

    @Autowired
    private PslnvoicingWarehouseService warehouseService;

    @GetMapping("/selectwarehouse")
    public List<PslnvoiningWarehouse> selectwarehouse(){
        List<PslnvoiningWarehouse> list=warehouseService.selectwarehouse();
        System.out.println(list);
        return list;
    }
}
