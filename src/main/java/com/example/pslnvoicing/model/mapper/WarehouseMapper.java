package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.PersonnelEmp;
import com.example.pslnvoicing.model.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WarehouseMapper {
    public List<PslnvoiningWarehouse> warehouseList();
}
