package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.PslnvoiningWarehouseMapper;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoiningWarehouseServiceImpl implements PslnvoiningWarehouseService {

    @Autowired
    private PslnvoiningWarehouseMapper kucunWarehouseMapper;

    @Override
    public List<PslnvoiningWarehouse> pslnvoiningWarehouseList() {
        return kucunWarehouseMapper.pslnvoiningWarehouseList();
    }
}
