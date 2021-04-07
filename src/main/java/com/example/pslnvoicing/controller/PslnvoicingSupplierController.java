package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import com.example.pslnvoicing.service.PslnvoicingSupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicdata/supplier")
public class PslnvoicingSupplierController {

    @Autowired
    private PslnvoicingSupplierService supplierService;

    @GetMapping("/selectsupplier")
    public List<PslnvoicingSuppier> selectsupplier(){
        List<PslnvoicingSuppier> list=supplierService.selectsupplier();
            return list;
    }
}
