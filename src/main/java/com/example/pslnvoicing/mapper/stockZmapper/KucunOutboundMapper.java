package com.example.pslnvoicing.mapper.stockZmapper;

import com.example.pslnvoicing.pojos.KucunOutbound;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface KucunOutboundMapper {
//查询全部
    List<KucunOutbound> selectOutbound();
//查询仓库
    List<PslnvoiningWarehouse> selectWarehouseName();
//分页查询
    List<KucunOutbound> findOutbound(String warehouseName,String outboundStaff);
//查询时间
    List<KucunOutbound> toDay();

    List<KucunOutbound> yesterday();

    List<KucunOutbound> thisWeek();

    List<KucunOutbound> lastWeek();

    List<KucunOutbound> thisMonth();

    List<KucunOutbound> lastMonth();

    List<KucunOutbound> findDate();
}
