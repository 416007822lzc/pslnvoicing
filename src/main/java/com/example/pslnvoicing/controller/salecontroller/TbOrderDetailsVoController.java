package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.service.saleservice.TbOrderDetailsVoService;
import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.vo.TbOrderDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TbOrderDetailsVoController {
    @Autowired
    private TbOrderDetailsVoService tbOrderDetailsVoService;

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    @RequestMapping("/TbOrderDetailsVoAll/{id}")
    public @ResponseBody CommonResult  TbOrderDetailsVoAll(@PathVariable("id") String  id){
        try {
            List<TbOrderDetailsVo> tbOrderDetailsVos = tbOrderDetailsVoService.tbOrderDetailsVoList(id);
            return new CommonResult(200,"查询成功",tbOrderDetailsVos);
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
    @RequestMapping("/updateOrderStatus/{id}")
    public @ResponseBody CommonResult updateOrderStatus(@PathVariable("id")String id){
        if (tbOrderDetailsVoService.updateOrderStatus(id) == 1){
            return new CommonResult(200,"审批成功");
        }
        return  new CommonResult(500,"审批失败");
    }

    /**
     * 驳回
     * @param id
     * @return
     */
    @RequestMapping("/rejectOrderStatus/{id}")
    public  @ResponseBody CommonResult rejectOrderStatus(@PathVariable("id")String id){
        if (tbOrderDetailsVoService.rejectOrderStatus(id) == 1){
            return new CommonResult(200,"驳回成功");
        }
        return  new CommonResult(500,"驳回失败");
        }
    }
