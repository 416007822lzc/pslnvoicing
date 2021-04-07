package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PslnvoiningWarehousePurchaseMapper {
    List<PslnvoiningWarehouse> pslnvoiningWarehouseList();
}
