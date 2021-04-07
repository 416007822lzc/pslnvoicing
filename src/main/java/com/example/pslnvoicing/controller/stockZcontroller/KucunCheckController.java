package com.example.pslnvoicing.controller.stockZcontroller;

import com.example.pslnvoicing.pojos.KucunCheck;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.stockZservice.KucunCheckService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KucunCheckController {
    @Autowired
    KucunCheckService checkService;


    //盘点全部
    @RequestMapping("/select-check")
    public List<KucunCheck> selectCheck(){
        return checkService.selectCheck();
    }

    //    查询仓库
    @RequestMapping("/select-warehouseName")
    public List<PslnvoiningWarehouse> selectWarehouseName(){
        return checkService.selectWarehouseName();
    }

    //分页查询
    @RequestMapping("/find-check")
    public Map<String,Object> check(Integer pageNum,Integer pageSize,String warehouseName,String checkStaff){
        Map<String,Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<KucunCheck> check = checkService.findCheck(warehouseName,checkStaff);
        map.put("rows",check);
        map.put("total",page.getTotal());
        return map;
    }

    @RequestMapping("/check-product")
    public List<PslvoicingProduct> findProduct(String warehouseName){
        System.out.println(warehouseName);
        return checkService.findProduct(warehouseName);

    }
}
