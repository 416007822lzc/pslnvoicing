package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SupplierMapper {
    List<PslnvoicingSuppier> pslnvoicingSuppierList();
}
