package com.example.pslnvoicing.model.mapper.stockZmapper;

import com.example.pslnvoicing.model.pojos.KucunCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunCheckMapper {
    //盘点全部
    List<KucunCheck> selectCheck();
    //高级查询
    List<KucunCheck> findCheck();
//    模糊查询 盘点人
    List<KucunCheck> findLikeStaff(String checkStaff);


    //根据时间查询
//   今天
    List<KucunCheck> toDay();

    List<KucunCheck> yesterday();

    List<KucunCheck> thisWeek();

    List<KucunCheck> lastWeek();

    List<KucunCheck> thisMonth();

    List<KucunCheck> lastMonth();

    List<KucunCheck> findDate();
}
