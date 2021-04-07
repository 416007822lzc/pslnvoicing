package com.example.pslnvoicing.service.xgy;

import com.example.pslnvoicing.mapper.xgy.WarehouseMapper;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    WarehouseMapper warehouseMapper;

    public List<PslnvoiningWarehouse> warehouseList(){
        return warehouseMapper.warehouseList();
    }
}
