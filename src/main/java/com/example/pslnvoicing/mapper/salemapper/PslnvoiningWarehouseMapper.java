package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PslnvoiningWarehouseMapper {
    List<PslnvoiningWarehouse> pslnvoiningWarehouseList();
}
