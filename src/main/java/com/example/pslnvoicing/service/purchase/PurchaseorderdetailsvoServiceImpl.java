package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.PurchaseorderdetailsvoMapper;
import com.example.pslnvoicing.vo.purchase.PurchaseOrderdetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseorderdetailsvoServiceImpl implements PurchaseorderdetailsvoService {
    @Autowired
    private PurchaseorderdetailsvoMapper purchaseorderdetailsvoMapper;

    @Override
    public List<PurchaseOrderdetailsVo> purchaseOrderdetailsvoList(String id) {
        return purchaseorderdetailsvoMapper.purchaseOrderdetailsvoList(id);
    }

    @Override
    public int updateOrderStatus(String id) {
           return purchaseorderdetailsvoMapper.updateOrderStatus(id);
    }

    @Override
    public int rejectOrderStatus(String id) {
        return purchaseorderdetailsvoMapper.rejectOrderStatus(id);
    }


}
