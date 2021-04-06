package com.example.pslnvoicing.model.service.stockZservice;

import com.example.pslnvoicing.model.mapper.stockZmapper.KucunCheckMapper;
import com.example.pslnvoicing.model.pojos.KucunCheck;
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

//高级查询
    public List<KucunCheck> findCheck(){
        return checkMapper.findCheck();
    }

//    模糊查询 盘点人
    public List<KucunCheck> findLikeStaff(String checkStaff){
        return checkMapper.findLikeStaff(checkStaff);
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
