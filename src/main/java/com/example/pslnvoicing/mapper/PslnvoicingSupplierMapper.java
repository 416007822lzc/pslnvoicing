package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PslnvoicingSupplierMapper {

    //查询
    public List<PslnvoicingSuppier> selectsupplier();
}
