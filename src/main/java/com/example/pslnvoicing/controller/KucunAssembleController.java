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
public class KucunAssembleController {
    @Autowired
    KucunAssembleService ks;


    @RequestMapping("/assembleList")
    @ResponseBody
    //调拨单查询
    public Map<String, Object> assembleList(Integer pageNum, Integer size, String serach){
        System.err.println(serach);
        KucunAssemble k = JSONObject.toJavaObject(JSON.parseObject(serach),KucunAssemble.class);

        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<KucunAssemble> KucunAssemble = ks.assembleList(k);
        map.put("rows",KucunAssemble);
        map.put("total",page.getTotal());
        return map;
    }

    //查询组装详情
    @RequestMapping("/assembleDetailsList")
    @ResponseBody
    public List<KucunAssembleDetails> assembleDetailsList(Integer id){
        return ks.assembleDetailsList(id);
    }

    //新增组装单
    @PostMapping("/addAssemble")
    @ResponseBody
    public void addAssemble(@RequestBody KucunAssemble kucunAssemble){
        ks.addAssemble(kucunAssemble);
    }

    //新增组装详情
    @RequestMapping(value = "/addAssembleDetails", produces = "application/json")
    @ResponseBody
    public void addAllotDetails(@RequestBody String json){
        System.err.println(json);
    }








}
