package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.TbOrderDetailsVoMapper;
import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.service.saleservice.TbOrderDetailsVoService;
import com.example.pslnvoicing.vo.TbOrderDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbOrderDetailsVoServiceImpl implements TbOrderDetailsVoService {
    @Autowired
    private TbOrderDetailsVoMapper tbOrderDetailsVoMapper;

    /**
     * 查询销售订单详情
     * @param Id
     * @return
     */
    @Override
    public List<TbOrderDetailsVo> tbOrderDetailsVoList(String Id) {
        return tbOrderDetailsVoMapper.tbOrderDetailsVoList(Id);
    }

    /**
     * 修改订单审批通过
     * @param id
     * @return
     */
    @Override
    public int updateOrderStatus(String id) {

        TbOrder tbOrder = tbOrderDetailsVoMapper.selectOrderById(id);
        if (tbOrder != null){
            tbOrderDetailsVoMapper.updateOrderStatus(tbOrder.getOrderId());
            return 1;
        }
        return 0;
    }

    /**
     * 修改订单审批驳回
     * @param id
     * @return
     */
    @Override
    public int rejectOrderStatus(String id) {
        TbOrder tbOrder = tbOrderDetailsVoMapper.selectOrderById(id);
        if (tbOrder != null){
            tbOrderDetailsVoMapper.rejectOrderStatus(tbOrder.getOrderId());
            return 1;
        }
        return 0;
    }


}
