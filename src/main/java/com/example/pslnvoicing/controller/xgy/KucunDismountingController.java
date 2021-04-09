package com.example.pslnvoicing.controller.xgy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.example.pslnvoicing.pojos.KucunDismounting;
import com.example.pslnvoicing.pojos.KucunDismountingDetails;
import com.example.pslnvoicing.service.xgy.KucunDismountingService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Map;

@Controller
public class KucunDismountingController {
    @Autowired
    KucunDismountingService ks;


    @RequestMapping("/dismountingList")
    @ResponseBody
    /*拆装单查询*/
    public Map<String, Object> assembleList(Integer pageNum, Integer size, String serach){
        System.err.println(serach);
        KucunDismounting kd = JSONObject.toJavaObject(JSON.parseObject(serach),KucunDismounting.class);
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<KucunDismounting> dismountings = ks.kucunDismountingList(kd);
        map.put("rows",dismountings);
        map.put("total",page.getTotal());
        return map;
    }

    /*拆装详情查询*/
    @RequestMapping("/dismountingDetailsList")
    @ResponseBody
    public List<KucunDismountingDetails> dismountingDetailsList(Integer id){
        return ks.kucunDismountingDetailsList(id);
    }









}
