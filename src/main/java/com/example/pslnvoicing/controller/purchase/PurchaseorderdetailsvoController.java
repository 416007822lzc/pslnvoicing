package com.example.pslnvoicing.controller.purchase;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.service.purchase.PurchaseorderdetailsvoService;
import com.example.pslnvoicing.vo.purchase.PurchaseOrderdetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PurchaseorderdetailsvoController {
    @Autowired
    private PurchaseorderdetailsvoService purchaseorderdetailsvoService;

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    @RequestMapping("/PurchaseOrderdetailsVoAll/{id}")
    public @ResponseBody CommonResult  PurchaseOrderdetailsVoAll(@PathVariable("id") String  id){
        try {
            List<PurchaseOrderdetailsVo> purchaseOrderdetailsVos = purchaseorderdetailsvoService.purchaseOrderdetailsvoList(id);
            return new CommonResult(200,"查询成功",purchaseOrderdetailsVos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500,"查询失败");
    }

    /**
     * 审批通过
     * @param id
     * @return
     */
    @RequestMapping("/updatePurchaseOrder/{id}")
    public @ResponseBody CommonResult updatePurchaseOrder(@PathVariable("id")String id){
        if (purchaseorderdetailsvoService.updateOrderStatus(id) == 1){
            return new CommonResult(200,"审批成功");
        }
        return  new CommonResult(500,"审批失败");
    }

    /**
     * 驳回
     * @param id
     * @return
     */
    @RequestMapping("/rejectPurchaseOrder/{id}")
    public  @ResponseBody CommonResult rejectPurchaseOrder(@PathVariable("id")String id){
        if (purchaseorderdetailsvoService.rejectOrderStatus(id) == 1){
            return new CommonResult(200,"驳回成功");
        }
        return  new CommonResult(500,"驳回失败");
        }
    }
