package com.example.pslnvoicing.model.mapper.stockZmapper;

import com.example.pslnvoicing.model.pojos.KucunOutbound;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface KucunOutboundMapper {
//查询全部
    List<KucunOutbound> selectOutbound();
//分页查询
    List<KucunOutbound> findOutbound();
//模糊查询
    List<KucunOutbound> findLikeStaff(String outboundStaff);
//查询时间
    List<KucunOutbound> toDay();

    List<KucunOutbound> yesterday();

    List<KucunOutbound> thisWeek();

    List<KucunOutbound> lastWeek();

    List<KucunOutbound> thisMonth();

    List<KucunOutbound> lastMonth();

    List<KucunOutbound> findDate();
}
