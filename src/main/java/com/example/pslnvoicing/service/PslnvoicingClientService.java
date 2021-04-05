package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.PslnvoicingClientMapper;
import com.example.pslnvoicing.pojos.PslnvoicingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class PslnvoicingClientService {

    @Autowired
    private PslnvoicingClientMapper clientMapper;

    //新增
//    public boolean createclient(PslnvoicingClient client){
//        int i=clientMapper.createclient(client);
//        if (i > 0){
//            return true;
//        }else {
//            return false;
//        }
//    }

    //全部查询
    public List<PslnvoicingClient> selectClient(){
        List<PslnvoicingClient> list=clientMapper.selectClient();
        System.out.println(list);
        return list;
    }
}
