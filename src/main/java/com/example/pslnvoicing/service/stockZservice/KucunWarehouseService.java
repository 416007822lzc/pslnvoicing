package com.example.pslnvoicing.service.stockZservice;

import com.example.pslnvoicing.mapper.stockZmapper.KucunWarehouseMapper;
import com.example.pslnvoicing.pojos.KucunWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KucunWarehouseService {
    @Autowired
    KucunWarehouseMapper warehouseMapper;

    public List<KucunWarehouse> selectWarehouse() {
        return warehouseMapper.selectWarehouse();
    }

    public List<KucunWarehouse> findWarehouse() {
        return warehouseMapper.findWarehouse();
    }

    public List<KucunWarehouse> findLikeStaff(String warehouseStaff) {
        return warehouseMapper.findLikeStaff(warehouseStaff);
    }

    public List<KucunWarehouse> toDay() {
        return warehouseMapper.toDay();
    }

    public List<KucunWarehouse> yesterday() {
        return warehouseMapper.yesterday();
    }

    public List<KucunWarehouse> thisWeek() {
        return warehouseMapper.thisWeek();
    }

    public List<KucunWarehouse> lastWeek() {
        return warehouseMapper.lastWeek();
    }

    public List<KucunWarehouse> thisMonth() {
        return warehouseMapper.thisMonth();
    }

    public List<KucunWarehouse> lastMonth() {
        return warehouseMapper.lastMonth();
    }

    public List<KucunWarehouse> findDate() {
        return warehouseMapper.findDate();
    }
}
