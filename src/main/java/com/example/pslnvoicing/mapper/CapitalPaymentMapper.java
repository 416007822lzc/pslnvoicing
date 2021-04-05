package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.PslnvoicingIncomeExpenses;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CapitalPaymentMapper {
	//模糊查询 条件
	public List<CapitalPayment>selectAll(CapitalPayment capitalPayment);

	//下拉查询  收支类型
	public List<PslnvoicingIncomeExpenses>selectLxAll();
}
