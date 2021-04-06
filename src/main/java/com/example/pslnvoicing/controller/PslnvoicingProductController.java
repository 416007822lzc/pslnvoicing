package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.PslnvoicingProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicdata/product")
public class PslnvoicingProductController {

    @Autowired
    private PslnvoicingProductService productService;

    @GetMapping("/selectproduct")
    public List<PslvoicingProduct> selectproduct(){
        List<PslvoicingProduct> list=productService.selectproduct();
        System.out.println(list);
        return list;
    }
}
