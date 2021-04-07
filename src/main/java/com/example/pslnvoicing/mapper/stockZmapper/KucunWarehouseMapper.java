package com.example.pslnvoicing.mapper.stockZmapper;

import com.example.pslnvoicing.pojos.KucunWarehouse;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface KucunWarehouseMapper {
    List<KucunWarehouse> selectWarehouse();

    List<PslnvoiningWarehouse> selectWarehouseName();

    List<KucunWarehouse> findWarehouse(String warehouseName,String kWarehouseStaff);

    List<KucunWarehouse> toDay();

    List<KucunWarehouse> yesterday();

    List<KucunWarehouse> thisWeek();

    List<KucunWarehouse> lastWeek();

    List<KucunWarehouse> thisMonth();

    List<KucunWarehouse> lastMonth();

    List<KucunWarehouse> findDate();


}
