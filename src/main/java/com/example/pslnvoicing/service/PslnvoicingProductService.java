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

    //查找
    public List<PslvoicingProduct> selectproduct(){
        List<PslvoicingProduct> list=productMapper.selectproduct();
        System.out.println(list);
        return list;
    }

    //新增
    public boolean createproduct(PslvoicingProduct product){
        int i=productMapper.createproduct(product);
        if (i > 0){
            return true;
        }else {
            return false;
        }
    }
}
