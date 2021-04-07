package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PurchaseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PurchaseDetailsMapper {
    List<PurchaseOrder> findAllDeliveryOrder(String empNameOrStoreNameOrNumber, String startTime,
                                             String endTime, Integer status);
}
