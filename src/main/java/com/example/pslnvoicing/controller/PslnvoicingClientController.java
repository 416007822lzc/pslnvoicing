package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.pojos.PslnvoicingClient;
import com.example.pslnvoicing.service.PslnvoicingClientService;
import com.example.pslnvoicing.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicdata/client")
public class PslnvoicingClientController {

    @Autowired
    private PslnvoicingClientService clientService;

//    @PostMapping("/createclient")
//    public CommonResult createclient(@ResponseBody PslnvoicingClient client){
//        System.out.println(client);
//        Boolean b=clientService.createclient(client);
//        if (b){
//            return ResultUtils.success("添加成功");
//        }else {
//            return ResultUtils.error("添加失败");
//        }
//    }

    @GetMapping("/selectClient")
    public List<PslnvoicingClient> selectClient(){
        List<PslnvoicingClient> list=clientService.selectClient();
        System.out.println("wdnmd");
        System.out.println(list);
        return list;
    }

}
