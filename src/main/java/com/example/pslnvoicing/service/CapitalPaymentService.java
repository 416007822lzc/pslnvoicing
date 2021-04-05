package com.example.pslnvoicing.service;

import com.example.pslnvoicing.mapper.CapitalPaymentMapper;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.PslnvoicingIncomeExpenses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalPaymentService {
	@Autowired
	CapitalPaymentMapper capitalPaymentMapper;
	public List<CapitalPayment> SelectAll(CapitalPayment capitalPayment ){
		List<CapitalPayment>list=capitalPaymentMapper.selectAll(capitalPayment);
		System.out.println("查询成功:"+list.toString());
		return list;
	}
	/**
	 * 下拉表查询呢
	 */
	public List<PslnvoicingIncomeExpenses>selectLxAll(){
		return capitalPaymentMapper.selectLxAll();
	}
}
