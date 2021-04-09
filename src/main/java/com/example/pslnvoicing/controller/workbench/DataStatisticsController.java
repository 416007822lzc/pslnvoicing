package com.example.pslnvoicing.controller.workbench;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.service.workbench.DataStatisticsService;
import com.example.pslnvoicing.vo.workbench.ClientQueryVo;
import com.example.pslnvoicing.vo.workbench.DataStatisticsVo;
import com.example.pslnvoicing.vo.workbench.RatifyVo;
import com.example.pslnvoicing.vo.workbench.RepertoryQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DataStatisticsController {
    @Autowired
    DataStatisticsService dataStatistics;

    /**
     * 查询销售额，采购额，库存，欠款
     * @return 返回销售额，采购额，库存，欠款封装的集合
     */
    @GetMapping("/workbench/queryState")
    public Map<String, Integer> queryPaymentByState(){
        return dataStatistics.queryPaymentByState();
    }

    /**
     * 查询一段时间内的采购额
     * @param saleT 月、周、天
     * @return 返回 本月上月、本周上周、今天昨天的采购额
     */
    @GetMapping("/workbench/queryProcurementAmount")
    public CommonResult queryProcurementAmount(String saleT){
        Map<String, Integer> procurementAmount = dataStatistics.queryProcurementAmount(saleT);
        CommonResult<Map<String,Integer>> voCommonResult = new CommonResult<Map<String,Integer>>();
        if (procurementAmount != null){
            voCommonResult.setCode(200);
            voCommonResult.setData(procurementAmount);
        }else {
            voCommonResult.setCode(500);
            voCommonResult.setMessage("查询失败");
        }
        return voCommonResult;
    }

    /**
     * 查询一段时间内的销售额
     * @param saleT 月、周、天
     * @return 返回 本月上月、本周上周、今天昨天的销售额
     */
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

    /**
     * 查询审批状态列表
     * @param approvalStatus1 审批状态：3待审批；2通过；1驳回
     * @return
     */
    @GetMapping("/queryTbDeliveryRatify")
    public List<RatifyVo> queryTbDeliveryRatify(String approvalStatus1){
        int approvalStatus = Integer.parseInt(approvalStatus1);
        approvalStatus++;
        return dataStatistics.queryAllReturns(approvalStatus);
    }

    /**
     * 修改审批状态
     * @param numberType 根据单据类型修改对应的表
     * @param approvalStatus 修改的审批类型
     * @param id 根据id修改
     * @return  返回审批列表
     */
    @PostMapping("/workbench/updateReturnsRatify/{numberType}/{approvalStatus}/{id}")
    public List<RatifyVo> updateReturnsRatify(@PathVariable String numberType, @PathVariable Integer approvalStatus,@PathVariable Integer id){
        List<RatifyVo> aBoolean = dataStatistics.updateReturnsRatify(numberType, approvalStatus, id);

        return aBoolean;
    }

    /**
     * 查询库存
     * @param queryVal 查询值可为单据也可为产品名 下面2个方法类推
     * @return 库存列表
     */
    @GetMapping("/workbench/queryRepertory")
    public List<RepertoryQueryVo> queryRepertory(String queryVal){
        return dataStatistics.queryRepertory(queryVal);
    }

    @GetMapping("/workbench/queryClient")
    List<ClientQueryVo> queryClient(String queryVal){
        return dataStatistics.queryClient(queryVal);
    }

    @GetMapping("/workbench/querySupplier")
    List<ClientQueryVo> querySupplier(String queryVal){
        return dataStatistics.querySupplier(queryVal);
    }



}
