package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.PslnvoicingClientMapper;
import com.example.pslnvoicing.pojos.PslnvoicingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoicingClientService {

    @Autowired
    private PslnvoicingClientMapper clientMapper;

    //新增
    public boolean createclient(PslnvoicingClient client){
        int i=clientMapper.createclient(client);
        if (i > 0){
            return true;
        }else {
           return false;
        }
    }

    //全部查询
    public List<PslnvoicingClient> selectClient(){
        List<PslnvoicingClient> list=clientMapper.selectClient();
        System.out.println(list);
        return list;
    }

    //修改
    public Integer updateclient(PslnvoicingClient client){
        Integer cli=clientMapper.updateclient(client);
        return cli;
    }

    //删除
    public Integer deleteclient(Long clientId){
        int cli=clientMapper.deleteclient(clientId);
        return cli;

    }
}
