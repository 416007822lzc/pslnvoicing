package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface PslnvoicingClientMapper {

    //新增客户
    public Integer createclient(PslnvoicingClient client);

    //全部查询
    public List<PslnvoicingClient> selectClient();

    //编辑
    public Integer updateclient(PslnvoicingClient client);

    //删除
    public Integer deleteclient(@Param("client_id") Long clientId);
}
