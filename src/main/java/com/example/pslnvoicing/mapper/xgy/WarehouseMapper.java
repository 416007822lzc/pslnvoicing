package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WarehouseMapper {
    public List<PslnvoiningWarehouse> warehouseList();
}
