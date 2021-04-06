package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunWarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KucunWarehouseService {
    @Autowired
    KucunWarehouseMapper warehouseMapper;
}
