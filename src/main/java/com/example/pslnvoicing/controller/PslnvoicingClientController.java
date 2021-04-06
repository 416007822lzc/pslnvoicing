package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.service.PslnvoicingClientService;
import com.example.pslnvoicing.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicdata/client")
public class PslnvoicingClientController {

    @Autowired
    private PslnvoicingClientService clientService;

    @PostMapping("/createclient")
   public CommonResult createclient(PslnvoicingClient client){
       System.out.println(client);
        Boolean b=clientService.createclient(client);
        if (b){
            CommonResult<PslnvoicingClient> obj1 = new CommonResult<>(200,"添加成功",null);
            System.out.println(obj1);
            return obj1;
        }else {
            CommonResult<PslnvoicingClient> obj2 = new CommonResult<>(404,"添加失败",null);
            return obj2;
        }
    }

    @GetMapping("/selectClient")
    public List<PslnvoicingClient> selectClient(){
        List<PslnvoicingClient> list=clientService.selectClient();
        System.out.println("wdnmd");
        System.out.println(list);
        return list;
    }

    @PostMapping("/updateclient")
    public CommonResult updateclietn(@RequestBody PslnvoicingClient client){
        int cli=clientService.updateclient(client);
        if (cli>0){
            CommonResult<PslnvoicingClient> obj1 = new CommonResult<>(200,"添加成功",null);
            System.out.println(obj1);
            return obj1;
        }else {
            CommonResult<PslnvoicingClient> obj2 = new CommonResult<>(500,"添加失败",null);
            return obj2;
        }
    }

    @GetMapping("/deleteclient")
    @Transactional
    public CommonResult deleteclient(@Param("client_id") Long clientId){
        System.out.println("要删除的行数："+clientId);
        int cli=clientService.deleteclient(clientId);
        if (cli>0){
            CommonResult<PslnvoicingClient> obj1 = new CommonResult<>(200,"添加成功",null);
            System.out.println(obj1);
            return obj1;
        }else {
        CommonResult<PslnvoicingClient> obj2 = new CommonResult<>(500,"添加失败",null);
        return obj2;
    }
    }
}
