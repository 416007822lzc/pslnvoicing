package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerMapper {
    /**
     * 查询所有客户
     * @return
     */
    List<PslnvoicingClient> pslnvoicingClientList();
}
