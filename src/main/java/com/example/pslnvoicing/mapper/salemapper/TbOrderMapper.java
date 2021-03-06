package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.vo.TborderVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbOrderMapper {
    /**
     * 查询销售订单列表
     * @param empNameOrStoreNameOrNumber
     * @param startTime
     * @param endTime
     * @param orderStatus
     * @return
     */
    List<TbOrder> tbOrderfindAll(String empNameOrStoreNameOrNumber, String startTime,
                          String endTime,Integer orderStatus);

    /**
     * 新增订单
     * @param tborderVo
     * @return
     */
    int addtborder(TborderVo tborderVo);
}
