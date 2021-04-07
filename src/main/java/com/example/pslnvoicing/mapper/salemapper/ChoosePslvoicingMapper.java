package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoosePslvoicingMapper {
    /*
   查询所有产品基础信息
    */
    public List<PslvoicingProduct> chaPslvoicing(String productName,String productNum,String productCategories);
}
