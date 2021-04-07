package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TbOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbOrderMapper {
    List<TbOrder> tbOrderfindAll(String empNameOrStoreNameOrNumber, String startTime,
                          String endTime,Integer orderStatus);
}
