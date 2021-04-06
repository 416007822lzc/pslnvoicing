package com.example.pslnvoicing.controller.stockZcontroller;

import com.example.pslnvoicing.pojos.KucunWarehouse;
import com.example.pslnvoicing.service.stockZservice.KucunWarehouseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KucunWarehouseContorller {
    @Autowired
    KucunWarehouseService warehouseService;

    @RequestMapping("/select-warehouse")
    //入库全部
    public List<KucunWarehouse> selectWarehouse(){
        return warehouseService.selectWarehouse();
    }
    //分页查询
    @RequestMapping("/find-warehouse")
    public Map<String,Object> warehouse(Integer pageNum, Integer size){
        Map<String,Object> map = new HashMap<>();

        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<KucunWarehouse> warehouse = warehouseService.findWarehouse();
        map.put("rows",warehouse);
        map.put("total",page.getTotal());
        return map;
    }
    //    模糊查询 入库创建人
    @RequestMapping("/find-like-warehouse-staff")
    public List<KucunWarehouse> findLikeStaff(String warehouseStaff){
        return warehouseService.findLikeStaff(warehouseStaff);
    }


    //根据时间查询
//    今天
    @RequestMapping("/warehouse-toDay")
    public List<KucunWarehouse> toDay(){
        return warehouseService.toDay();
    }
    @RequestMapping("/warehouse-yesterday")
    public List<KucunWarehouse> yesterday(){
        return warehouseService.yesterday();
    }
    @RequestMapping("/warehouse-this-week")
    public List<KucunWarehouse> thisWeek(){
        return warehouseService.thisWeek();
    }
    @RequestMapping("/warehouse-last-week")
    public List<KucunWarehouse> lastWeek(){
        return warehouseService.lastWeek();
    }
    @RequestMapping("/warehouse-this-month")
    public List<KucunWarehouse> thisMonth(){
        return warehouseService.thisMonth();
    }
    @RequestMapping("/warehouse-last-month")
    public List<KucunWarehouse> lastMonth(){
        return warehouseService.lastMonth();
    }
    @RequestMapping("/warehouse-find-date")
    public List<KucunWarehouse> findDate(){
        return warehouseService.findDate();
    }
}
