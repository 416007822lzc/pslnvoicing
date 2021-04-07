package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 查询所有产品基础信息
 */
@Mapper
@Repository
public interface ChoosePslvoicingMapper {
    /*
    查询所有产品基础信息
     */
    public List<PslvoicingProduct> chaPslvoicing(@Param("name") String productName,@Param("id") String productNum,@Param("fl") String productCategories);
}
