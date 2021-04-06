package com.example.pslnvoicing.model.mapper.stockZmapper;

import com.example.pslnvoicing.model.pojos.KucunWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface KucunWarehouseMapper {
    List<KucunWarehouse> selectWarehouse();

    List<KucunWarehouse> findWarehouse();

    List<KucunWarehouse> findLikeStaff(String warehouseStaff);

    List<KucunWarehouse> toDay();

    List<KucunWarehouse> yesterday();

    List<KucunWarehouse> thisWeek();

    List<KucunWarehouse> lastWeek();

    List<KucunWarehouse> thisMonth();

    List<KucunWarehouse> lastMonth();

    List<KucunWarehouse> findDate();
}
