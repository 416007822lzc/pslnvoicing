package com.example.pslnvoicing.controller.purchase;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.pojos.*;
import com.example.pslnvoicing.service.purchase.*;
import com.example.pslnvoicing.vo.ParameterVo;
import com.example.pslnvoicing.vo.purchase.NewpurchaseOrderVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PurchaseController {

    @Autowired
    private ChoosePslvoicingService choosePslvoicingService;

    @Autowired
    private PslnvoiningWarehouseService kucunWarehouseService;

    @Autowired
    private PersonnelEmpService personnelEmpService;

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private PurchaseService purchaseService;


    /**
     * 查询所有产品基础信息
     *
     * @param productName       产品名称
     * @param productNum        产品编号
     * @param productCategories 产品类别
     * @param limit             条数
     * @param page              页码
     * @return
     */
    @GetMapping("/CP")
    public CommonResult chaxPslvoicing(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        try {
            PageInfo<PslvoicingProduct> list = choosePslvoicingService.chaPslvoicing(productName, productNum, productCategories, limit, page);
            return new CommonResult(200, "产品数据查询成功", list);
        } catch (Exception e) {
            System.out.printf("查询产品列表出现错误");
            System.out.printf("错误如下:" + e.getLocalizedMessage());
        }
        return new CommonResult(500, "产品数据查询失败", null);
    }

    //查询所有供应商信息
    @GetMapping("/SuppierAll")
    public CommonResult suppierAll() {
        try {
            List<PslnvoicingSuppier> pslnvoicingClients = supplierService.pslnvoicingSuppierList();
            return new CommonResult(200, "查询成功", pslnvoicingClients);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "查询失败");
    }

    //查询所有员工信息
    @GetMapping("/PersonnelEmpAll")
    public CommonResult personnelEmpAll() {
        try {
            List<PersonnelEmp> personnelEmps = personnelEmpService.personnelEmpClientList();
            return new CommonResult(200, "查询成功", personnelEmps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "查询失败");
    }

    //查询所有仓库信息
    @GetMapping("/PslnvoiningWarehouseAll")
    public CommonResult pslnvoiningWarehouseAll() {
        try {
            List<PslnvoiningWarehouse> pslnvoiningWarehouses = kucunWarehouseService.pslnvoiningWarehouseList();
            return new CommonResult(200, "查询成功", pslnvoiningWarehouses);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "查询失败");
    }

    //新增采购单，采购单产品详情
    @PostMapping("/addcg")
    public CommonResult addPurchase(@RequestBody NewpurchaseOrderVo data) {
        try {
            Boolean aBoolean = purchaseService.addCaigou(data);
            System.out.println(data.toString());
            if (aBoolean){
                return new CommonResult(200, "新增成功");
            }else {
                return new CommonResult(500, "新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "新增失败");
    }

    @Autowired
    private purchaseOrAllService purchaseOrAllService;

    //查询采购单列表
    @RequestMapping("/purchaseOrderAll")
    public  PageInfo<PurchaseOrder> findAll(ParameterVo parameterVo) {
        System.out.println(parameterVo.toString());
        PageInfo<PurchaseOrder> orders = purchaseOrAllService.purchaseOrderall(parameterVo);
        return orders;
    }
}
