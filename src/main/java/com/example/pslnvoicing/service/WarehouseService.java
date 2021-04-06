package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.EmpMapper;
import com.example.pslnvoicing.model.mapper.WarehouseMapper;
import com.example.pslnvoicing.model.pojos.PersonnelEmp;
import com.example.pslnvoicing.model.pojos.PslnvoiningWarehouse;
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
