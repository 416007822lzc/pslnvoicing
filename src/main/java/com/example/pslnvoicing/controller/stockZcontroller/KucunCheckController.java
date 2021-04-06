package com.example.pslnvoicing.controller.stockZcontroller;

import com.example.pslnvoicing.model.pojos.KucunCheck;
import com.example.pslnvoicing.model.service.stockZservice.KucunCheckService;
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

    @RequestMapping("/select-check")
    //盘点全部
    public List<KucunCheck> selectCheck(){
        return checkService.selectCheck();
    }
    //分页查询
    @RequestMapping("/find-check")
    public Map<String,Object> check(Integer pageNum,Integer pageSize){
        Map<String,Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<KucunCheck> check = checkService.findCheck();
        map.put("rows",check);
        map.put("total",page.getTotal());
        return map;
    }
//    模糊查询 盘点人
    @RequestMapping("/find-like-check-staff")
    public List<KucunCheck> findLikeStaff(String checkStaff){
        return checkService.findLikeStaff(checkStaff);
    }


    //根据时间查询
//    今天
    @RequestMapping("/check-toDay")
    public List<KucunCheck> toDay(){
        return checkService.toDay();
    }
    @RequestMapping("/check-yesterday")
    public List<KucunCheck> yesterday(){
        return checkService.yesterday();
    }
    @RequestMapping("/check-this-week")
    public List<KucunCheck> thisWeek(){
        return checkService.thisWeek();
    }
    @RequestMapping("/check-last-week")
    public List<KucunCheck> lastWeek(){
        return checkService.lastWeek();
    }
    @RequestMapping("/check-this-month")
    public List<KucunCheck> thisMonth(){
        return checkService.thisMonth();
    }
    @RequestMapping("/check-last-month")
    public List<KucunCheck> lastMonth(){
        return checkService.lastMonth();
    }
    @RequestMapping("/check-find-date")
    public List<KucunCheck> findDate(){
        return checkService.findDate();
    }

}
