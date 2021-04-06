package com.example.pslnvoicing.controller.workbench;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.service.workbench.DataStatisticsService;
import com.example.pslnvoicing.vo.CommonResult;
import com.example.pslnvoicing.vo.workbench.DataStatisticsVo;
import com.example.pslnvoicing.vo.workbench.RatifyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DataStatisticsController {
    @Autowired
    DataStatisticsService dataStatistics;

    @GetMapping("/workbench/queryState")
    public Map<String, Integer> queryPaymentByState(){
        return dataStatistics.queryPaymentByState();
    }

    @GetMapping("/workbench/queryProcurementAmount")
    public CommonResult queryProcurementAmount(String saleT){
        Map<String, Integer> procurementAmount = dataStatistics.queryProcurementAmount(saleT);
        CommonResult<Map<String,Integer>> voCommonResult = new CommonResult<>();
        if (procurementAmount != null){
            voCommonResult.setCode(200);
            voCommonResult.setData(procurementAmount);
        }else {
            voCommonResult.setCode(500);
            voCommonResult.setMessage("查询失败");
        }
        return voCommonResult;
    }

    @GetMapping("/workbench/querySellAmount")
    public CommonResult querySellAmount(String saleT){
        Map<String, Integer> procurementAmount = dataStatistics.querySellAmount(saleT);
        CommonResult<Map<String,Integer>> voCommonResult = new CommonResult<>();
        if (procurementAmount != null){
            voCommonResult.setCode(200);
            voCommonResult.setData(procurementAmount);
        }else {
            voCommonResult.setCode(500);
            voCommonResult.setMessage("查询失败");
        }
        return voCommonResult;
    }

    @GetMapping("/queryTbDeliveryRatify")
    public CommonResult queryTbDeliveryRatify(){
        List<RatifyVo> ratifyVos = dataStatistics.queryTbDeliveryRatify();
        return new CommonResult(200,"",ratifyVos);
    }

}
