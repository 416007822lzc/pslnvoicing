package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    public List<PslvoicingProduct> productList(String warehouseName,String name);
    public Integer number(String name,Integer productId);
}
