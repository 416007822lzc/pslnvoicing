package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.vo.TbOrderDetailsVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbOrderDetailsVoMapper {
    List<TbOrderDetailsVo> tbOrderDetailsVoList(String id);


    TbOrder selectOrderById(String id);

    void updateOrderStatus(Integer id);

    void rejectOrderStatus(Integer id);
}
