package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.PersonnelEmp;
import com.example.pslnvoicing.model.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    public List<PslvoicingProduct> productList(String warehouseName,String name);
    public Integer number(String name,Integer productId);
}
