package com.example.pslnvoicing.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.PslnvoicingIncomeExpenses;
import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import com.example.pslnvoicing.pojos.PslnvoicingZijin;
import com.example.pslnvoicing.service.CapitalPaymentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Map<String,Object> productmgr(String cplt, Integer pageNum, Integer size){
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
	@RequestMapping("/fu-xla")
	public List<PslnvoicingIncomeExpenses> selectxl(){
		return  capitalPaymentService.selectlxall();
	}
	/**
	 *供应商下拉表
	 */
	@RequestMapping("/fu-xgys")
	public List<PslnvoicingSuppier>selectlallgys(){
		return  capitalPaymentService.selectlallgys();
	}

	/**
	 *自己下拉表
	 */
	@RequestMapping("/fu-zjin")
	public List<PslnvoicingZijin>selectlallzijin(){
		return  capitalPaymentService.selectlallzijin();
	}
}
