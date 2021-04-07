package com.example.pslnvoicing.service.stockZservice;

import com.example.pslnvoicing.mapper.stockZmapper.KucunOutboundMapper;
import com.example.pslnvoicing.pojos.KucunOutbound;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KucunOutboundService {
    @Autowired
    KucunOutboundMapper outboundMapper;

    public List<KucunOutbound> selectOutbound() {
        return outboundMapper.selectOutbound();
    }
//    查询仓库
    public List<PslnvoiningWarehouse> selectWarehouseName() {
        return outboundMapper.selectWarehouseName();
    }

    public List<KucunOutbound> findOutbound(String warehouseName,String outboundStaff) {
        return outboundMapper.findOutbound(warehouseName,outboundStaff);
    }


    public List<KucunOutbound> toDay() {
        return outboundMapper.toDay();
    }

    public List<KucunOutbound> yesterday() {
        return outboundMapper.yesterday();
    }

    public List<KucunOutbound> thisWeek() {
        return outboundMapper.thisWeek();
    }

    public List<KucunOutbound> lastWeek() {
        return outboundMapper.lastWeek();
    }

    public List<KucunOutbound> thisMonth() {
        return outboundMapper.thisMonth();
    }

    public List<KucunOutbound> lastMonth() {
        return outboundMapper.lastMonth();
    }

    public List<KucunOutbound> findDate() {
        return outboundMapper.findDate();
    }


}
