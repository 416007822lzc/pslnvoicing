package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.vo.xgy.ProductVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    public List<ProductVo> productList(String warehouseName, String name);
    public Integer number(String name,Integer productId);
}
