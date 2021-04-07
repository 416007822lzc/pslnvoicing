package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.saleservice.ChoosePslvoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChoosePslvoController {
    @Autowired
    private ChoosePslvoService choosePslvoService;

    @RequestMapping("/chaxPslvoicing")
    public @ResponseBody
    CommonResult chaxPslvoicing(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        try {
            PageInfo<PslvoicingProduct> list = choosePslvoService.chaPslvoicing(productName, productNum, productCategories, limit, page);
            return new CommonResult(200, "查询成功", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "查询失败");
    }
}
