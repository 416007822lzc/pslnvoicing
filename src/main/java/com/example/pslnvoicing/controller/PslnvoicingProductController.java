package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.PslnvoicingProductService;
import com.example.pslnvoicing.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/createproduct")
    public CommonResult createproduct(PslvoicingProduct product){
        System.out.println(product);
        Boolean b=productService.createproduct(product);
        if (b){
            CommonResult<PslvoicingProduct> obj1 = new CommonResult<>(200,"添加成功",null);
            System.out.println(obj1);
            return obj1;
        }else {
            CommonResult<PslvoicingProduct> obj2 = new CommonResult<>(500,"添加失败",null);
            return obj2;
        }
    }
}
