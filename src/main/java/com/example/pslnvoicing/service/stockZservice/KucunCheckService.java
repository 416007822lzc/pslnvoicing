package com.example.pslnvoicing.service.stockZservice;

import com.example.pslnvoicing.mapper.stockZmapper.KucunCheckMapper;
import com.example.pslnvoicing.pojos.KucunCheck;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KucunCheckService {
    @Autowired
    KucunCheckMapper checkMapper;
    //盘点全部
    public List<KucunCheck> selectCheck(){
        return checkMapper.selectCheck();
    }
//    查询仓库
    public List<PslnvoiningWarehouse> selectWarehouseName(){
        return checkMapper.selectWarehouseName();
    }

//高级查询
    public List<KucunCheck> findCheck(String warehouseName,String checkStaff){
        return checkMapper.findCheck(warehouseName,checkStaff);
    }

//    模糊查询 盘点人
    public List<KucunCheck> findLikeStaff(String checkStaff){
        return checkMapper.findLikeStaff(checkStaff);
    }
//    根据仓库id查询产品
    public List<PslvoicingProduct> findProduct(String warehouseName){
        return checkMapper.findProduct(warehouseName);
    }

    //根据时间查询
    // 今天
    public List<KucunCheck> toDay() {
        return checkMapper.toDay();
    }
//昨天
    public List<KucunCheck> yesterday() {
        return checkMapper.yesterday();
    }

    public List<KucunCheck> thisWeek() {
        return checkMapper.thisWeek();
    }

    public List<KucunCheck> lastWeek() {
        return checkMapper.lastWeek();
    }

    public List<KucunCheck> thisMonth() {
        return checkMapper.thisMonth();
    }

    public List<KucunCheck> lastMonth() {
        return checkMapper.lastMonth();
    }

    public List<KucunCheck> findDate() {
        return checkMapper.findDate();
    }
}
