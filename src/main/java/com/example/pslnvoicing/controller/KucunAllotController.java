package com.example.pslnvoicing.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.model.pojos.*;
import com.example.pslnvoicing.model.service.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class KucunAllotController {
    @Autowired
    KucunAllotService ks;

    @Autowired
    KucunAllotDetailsService kds;

    @Autowired
    EmpService es;

    @Autowired
    WarehouseService ws;

    @Autowired
    ProductService ps;


    @RequestMapping("/allotList")
    @ResponseBody
    //调拨单查询
    public Map<String, Object> allotList(Integer pageNum, Integer size, String serach){
        System.err.println(serach);
        KucunAllot k = JSONObject.toJavaObject(JSON.parseObject(serach),KucunAllot.class);

        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<KucunAllot> kucunAllot = ks.allotList(k);
        map.put("rows",kucunAllot);
        map.put("total",page.getTotal());
        return map;
    }

    @RequestMapping("/allotDetailsList")
    @ResponseBody
    //调拨详情查询
    public List<KucunAllotDetails> allotDetailsList(int id){
        return kds.allotDetailsList(id);
    }

    //新增调拨表
    @PostMapping("/addAllot")
    @ResponseBody
    public void addAllot(@RequestBody KucunAllot k){
        k.setAllotState(0);
        ks.addAllot(k);
    }

    //调拨详情
    @RequestMapping(value = "/addAllotDetails", produces = "application/json")
    @ResponseBody
    public void addAllotDetails(@RequestBody String json){
        List<AllotDetailsVo> p = JSONObject.parseArray(json,AllotDetailsVo.class);
        KucunAllot kucunAllot = ks.maxId();
        for (AllotDetailsVo a:p) {
            KucunAllotDetails k=new KucunAllotDetails();
            k.setAllotDetailsNumber(a.getAllotDetailsNumber());
            k.setAllotDetailsCost(a.getAllotDetailsCost());
            k.setKucunAllot(kucunAllot);
            PslvoicingProduct product= new PslvoicingProduct();
            product.setProductId(a.getProductId());
            k.setProducts(product);
            System.err.println(k);
            kds.addAllotDetails(k);
        }
    }

    //用户
    @RequestMapping("/empList")
    @ResponseBody
    public List<PersonnelEmp> empList(){
        return es.empList();
    }

    //仓库
    @RequestMapping("/warehouseList")
    @ResponseBody
    public List<PslnvoiningWarehouse> warehouseList(){
        return ws.warehouseList();
    }

    //商品
    @RequestMapping("/productList")
    @ResponseBody
    public List<PslvoicingProduct> productList(String warehouseName,String name){
        return ps.productList(warehouseName,name);
    }



}
