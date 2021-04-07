package com.example.pslnvoicing.mapper.stockZmapper;

import com.example.pslnvoicing.pojos.KucunCheck;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunCheckMapper {
    //盘点全部
    List<KucunCheck> selectCheck();
//    查询仓库
    List<PslnvoiningWarehouse> selectWarehouseName();
    //高级查询
    List<KucunCheck> findCheck(String warehouseName,String checkStaff);
//    模糊查询 盘点人
    List<KucunCheck> findLikeStaff(String checkStaff);
//    根据仓库id查询产品
    List<PslvoicingProduct> findProduct(String warehouseName);


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
