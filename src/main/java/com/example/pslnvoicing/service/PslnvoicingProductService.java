package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.PslnvoicingProductMapper;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoicingProductService {

    @Autowired
    private PslnvoicingProductMapper productMapper;

    public List<PslvoicingProduct> selectproduct(){
        List<PslvoicingProduct> list=productMapper.selectproduct();
        System.out.println(list);
        return list;
    }
}
