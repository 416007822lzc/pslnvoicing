package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.CapitalPaymentMapper;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.PslnvoicingIncomeExpenses;
import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import com.example.pslnvoicing.pojos.PslnvoicingZijin;
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
}
