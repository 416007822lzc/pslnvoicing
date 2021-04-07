package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.pojos.TbOrder;
import com.example.pslnvoicing.service.saleservice.TbOrderService;
import com.example.pslnvoicing.vo.NewsaleOrderVo;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TbOrderController {
    @Autowired
    private TbOrderService tbOrderService;

    @RequestMapping("/TbOrderAll")
    public @ResponseBody PageInfo<TbOrder> findAll(ParameterVo parameterVo){
        PageInfo<TbOrder> orders = tbOrderService.tbOrderfindAll(parameterVo);
        return orders;
    }

    //新增采购单，采购单产品详情
    @PostMapping("/addorder")
    public @ResponseBody CommonResult addPurchase(@RequestBody NewsaleOrderVo newsaleOrderVo) {
        try {
            Boolean addorder = tbOrderService.addorder(newsaleOrderVo);
            if (addorder){
                return new CommonResult(200, "新增成功");
            }else {
                return new CommonResult(500, "新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "新增失败");
    }
}
