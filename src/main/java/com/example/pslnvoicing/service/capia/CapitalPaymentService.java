package com.example.pslnvoicing.service.capia;

import com.example.pslnvoicing.mapper.capital.CapitalPaymentMapper;
import com.example.pslnvoicing.pojos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalPaymentService {
	@Autowired
	CapitalPaymentMapper capitalPaymentMapper;
	public List<CapitalPayment>selectall(CapitalPayment capitalPayment ){
		List<CapitalPayment>list=capitalPaymentMapper.selectall(capitalPayment);
		System.out.println("查询成功:"+list.toString());
		return list;
	}
	/**
	 * 下拉表查询呢
	 */
	public List<PslnvoicingIncomeExpenses>selectlxall(){
		return capitalPaymentMapper.selectlxall();
	}
	/**
	 * 下拉查询供应商
	 */
	public List<PslnvoicingSuppier>selectlallgys(){
		return capitalPaymentMapper.selectlallgys();
	}
	/**
	 * 下拉表查询 资金账户
	 */
	public List<PslnvoicingZijin>selectlallzijin(){
		return capitalPaymentMapper.selectlallzijin();
	}

	/**
	 * 采购
	 */
	public List<PurchaseOrder>selectcg(){
		return  capitalPaymentMapper.selectcg();
	}
	/**
	 * 修改
	 */
	public void updatefukuan(CapitalPayment capitalPayment){
		System.out.println("修改成功:"+capitalPayment.toString());
		capitalPaymentMapper.updatefukuan(capitalPayment);
		capitalPaymentMapper.insertxq(capitalPayment);
	}

	/**
	 * 新增
	 */
	public void insertfukuan(CapitalPayment capitalPayment){
		System.out.println("新增成功:"+capitalPayment.toString());
		capitalPaymentMapper.insertfukuan(capitalPayment);
	}
}
