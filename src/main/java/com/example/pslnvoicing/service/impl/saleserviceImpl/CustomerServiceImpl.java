package com.example.pslnvoicing.service.impl.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.CustomerMapper;
import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.service.saleservice.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有客户
     * @return
     */
    @Override
    public List<PslnvoicingClient> pslnvoicingClientList() {
        return customerMapper.pslnvoicingClientList();
    }
}
