package com.example.pslnvoicing.controller.stockZcontroller;

import com.example.pslnvoicing.pojos.KucunOutbound;
import com.example.pslnvoicing.service.stockZservice.KucunOutboundService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KucunOutboundContorller {
    @Autowired
    KucunOutboundService outboundService;

    @RequestMapping("/select-outbound")
    public List<KucunOutbound> selectOutbound(){
        return outboundService.selectOutbound();
    }

    //分页查询
    @RequestMapping("/find-outbound")
    public Map<String,Object> outbound(Integer pageNum, Integer size){
        Map<String,Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<KucunOutbound> outbound = outboundService.findOutbound();
        map.put("rows",outbound);
        map.put("total",page.getTotal());
        return map;
    }
    //    模糊查询 出库创建人
    @RequestMapping("/find-lik-outbound-staff")
    public List<KucunOutbound> findLikeStaff(String OutboundStaff){
        return outboundService.findLikeStaff(OutboundStaff);
    }


    //根据时间查询
//    今天
    @RequestMapping("/outbound-toDay")
    public List<KucunOutbound> toDay(){
        return outboundService.toDay();
    }
    @RequestMapping("/outbound-yesterday")
    public List<KucunOutbound> yesterday(){
        return outboundService.yesterday();
    }
    @RequestMapping("/outbound-this-week")
    public List<KucunOutbound> thisWeek(){
        return outboundService.thisWeek();
    }
    @RequestMapping("/outbound-last-week")
    public List<KucunOutbound> lastWeek(){
        return outboundService.lastWeek();
    }
    @RequestMapping("/outbound-this-month")
    public List<KucunOutbound> thisMonth(){
        return outboundService.thisMonth();
    }
    @RequestMapping("/outbound-last-month")
    public List<KucunOutbound> lastMonth(){
        return outboundService.lastMonth();
    }
    @RequestMapping("/outbound-find-date")
    public List<KucunOutbound> findDate(){
        return outboundService.findDate();
    }

}
