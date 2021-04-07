package com.example.pslnvoicing.mapper;


import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PslnvoicingWarehouseMapper {

    //查询
    public List<PslnvoiningWarehouse> selectwarehouse();
}
