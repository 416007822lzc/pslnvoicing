package com.example.pslnvoicing.model.mapper.cjh;

import com.example.pslnvoicing.model.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PslnvoicingProductMapper {
    public Integer createproduct(PslvoicingProduct product);
}
