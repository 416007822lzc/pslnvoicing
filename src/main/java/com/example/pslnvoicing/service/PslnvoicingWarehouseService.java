package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.PslnvoicingWarehouseMapper;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoicingWarehouseService {

    @Autowired
    private PslnvoicingWarehouseMapper warehouseMapper;

    //查询
    public List<PslnvoiningWarehouse> selectwarehouse(){
        List<PslnvoiningWarehouse> list =warehouseMapper.selectwarehouse();
        System.out.println(list);
        return list;
    }
}
