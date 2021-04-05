package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.PslnvoicingIncomeExpenses;
import com.example.pslnvoicing.pojos.PslnvoicingSuppier;
import com.example.pslnvoicing.pojos.PslnvoicingZijin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CapitalPaymentMapper {
	//模糊查询 条件
	public List<CapitalPayment>selectall(CapitalPayment capitalPayment);

	//下拉查询  收支类型
	public List<PslnvoicingIncomeExpenses>selectlxall();
	//下拉查询 供应商
	public List<PslnvoicingSuppier>selectlallgys();
	//下拉列表  资金账户
	public List<PslnvoicingZijin>selectlallzijin();
}
