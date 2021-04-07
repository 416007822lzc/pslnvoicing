package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.pojos.TbOrderDetails;
import com.example.pslnvoicing.pojos.TdDeliveryOrder;
import com.example.pslnvoicing.vo.TbOrderDetailsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbOrderDetailsVoMapper {
    /**
     * 查询销售订单详情
     * @param id
     * @return
     */
    List<TbOrderDetailsVo> tbOrderDetailsVoList(String id);

    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    TbOrder selectOrderById(String id);

    /**
     * 修改订单状态
     * @param id
     */
    void updateOrderStatus(Integer id);

    /**
     * 修改订单状态
     * @param id
     */
    void rejectOrderStatus(Integer id);

    /**
     * 新增订单详情
     * @param tbOrderDetails
     * @return
     */
     int addtbOrderDetails(List<TbOrderDetails> tbOrderDetails);
}
