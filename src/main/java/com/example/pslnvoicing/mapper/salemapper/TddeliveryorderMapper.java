package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TddeliveryorderMapper {
    List<TdDeliveryOrder> findAllDeliveryOrder( String empNameOrStoreNameOrNumber, String startTime,
                                                String endTime, Integer status);
}
