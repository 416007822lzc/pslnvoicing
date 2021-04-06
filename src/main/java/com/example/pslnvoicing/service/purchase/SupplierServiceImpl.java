package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.SupplierMapper;
import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    /**
     * 查询所有供应商
     * @return
     */
    @Override
    public List<PslnvoicingSuppier> pslnvoicingSuppierList() {
        return supplierMapper.pslnvoicingSuppierList();
    }
}
