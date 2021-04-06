package com.example.pslnvoicing.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.model.pojos.KucunCheck;
import com.example.pslnvoicing.model.service.KucunCheckService;
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

    //分页查询
    @RequestMapping("/find-check")
    public Map<String,Object> check(Integer pageNum,Integer pageSize){
        //parseOject把JSON字符串转为JSON对象
//        KucunCheck check = JSONObject.toJavaObject(JSON.parseObject(search),KucunCheck.class);
        Map<String,Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<KucunCheck> check = checkService.findCheck();
        map.put("rows",check);
        map.put("total",page.getTotal());
        return map;
    }

}
