package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.ProductMapper;
import com.example.pslnvoicing.model.pojos.PslvoicingProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    public List<PslvoicingProduct> productList(String warehouseName,String name){
        System.out.println(warehouseName+"---"+name);
        return productMapper.productList(warehouseName,name);
    }

    public Integer number(String name,Integer id){
        return productMapper.number(name,id);
    }
}
