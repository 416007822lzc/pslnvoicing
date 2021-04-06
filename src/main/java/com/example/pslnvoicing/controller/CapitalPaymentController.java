package com.example.pslnvoicing.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.pojos.*;
import com.example.pslnvoicing.service.CapitalPaymentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fu")
public class CapitalPaymentController {
	@Autowired
	CapitalPaymentService capitalPaymentService;

	/**
	 * 查询
	 * @param
	 * @param pageNum
	 * @param size
	 * @return
	 */
	@RequestMapping("/fu-select")
	public Map<String,Object> productmgr( String cplt, Integer pageNum, Integer size){
		if(pageNum==null)
			pageNum=1;
		if( size==null)
			size=4;
		Map<String,Object> map = new HashMap<>();
		Page<Object> page = PageHelper.startPage(pageNum, size);
		CapitalPayment cpilt= JSONObject.toJavaObject(JSON.parseObject(cplt), CapitalPayment.class);
		List<CapitalPayment> list=capitalPaymentService.selectall(cpilt);
		map.put("rows",list);
		map.put("total",page.getTotal());
		return map;


	}
	/**
	 * 下拉表查询
	 */
	@RequestMapping("/xla")
	public List<PslnvoicingIncomeExpenses> selectxl(){
		return  capitalPaymentService.selectlxall();
	}
	/**
	 *供应商下拉表
	 */
	@RequestMapping("/xgys")
	public List<PslnvoicingSuppier>selectlallgys(){
		return  capitalPaymentService.selectlallgys();
	}

	/**
	 *自己下拉表
	 */
	@RequestMapping("/zjin")
	public List<PslnvoicingZijin>selectlallzijin(){
		return  capitalPaymentService.selectlallzijin();
	}
	/**
	 * 采购u
	 */
	@RequestMapping("/cg")
	public List<PurchaseOrder>selectcg(){
		return capitalPaymentService.selectcg();
	}

	/**
	 * 修改 对象传值
	 */
	@RequestMapping("/update")
	public void updatefuk(@RequestBody CapitalPayment capitalPayment){
		capitalPaymentService.updatefukuan(capitalPayment);
	}

	/**
	 * 新增 对象传值
	 */
	@RequestMapping("/insert")
	public void insertfukuan(@RequestBody CapitalPayment capitalPayment){
		capitalPaymentService.insertfukuan(capitalPayment);
	}
}
