package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.PslnvoicingSupplierMapper;
import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoicingSupplierService {

    @Autowired
    private PslnvoicingSupplierMapper supplierMapper;

    public List<PslnvoicingSuppier> selectsupplier(){
        List<PslnvoicingSuppier> list =supplierMapper.selectsupplier();
        return list;
    }
}
