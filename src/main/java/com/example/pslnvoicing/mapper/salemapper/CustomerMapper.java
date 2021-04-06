package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface CustomerMapper {
    List<PslnvoicingClient> pslnvoicingClientList();
}
