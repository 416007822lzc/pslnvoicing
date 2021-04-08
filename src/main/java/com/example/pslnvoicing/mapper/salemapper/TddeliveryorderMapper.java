package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TddeliveryorderMapper {
    /**
     * 查询出库订单
     * @param empNameOrStoreNameOrNumber
     * @param startTime
     * @param endTime
     * @param status
     * @return
     */
    List<TdDeliveryOrder> findAllDeliveryOrder( String empNameOrStoreNameOrNumber, String startTime,
                                                String endTime, Integer status);
}
