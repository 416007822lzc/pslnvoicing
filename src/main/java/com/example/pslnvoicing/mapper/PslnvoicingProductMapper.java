package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PslnvoicingProductMapper {

    //查询
    public List<PslvoicingProduct> selectproduct();
}
