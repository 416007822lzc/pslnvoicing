package com.example.pslnvoicing.mapper;

import com.example.pslnvoicing.pojos.CapitalPaymentDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CapitalPaymentDMapper {
	//模糊查询 条件
	public List<CapitalPaymentDetails> selectall(CapitalPaymentDetails capitalPaymentDetails);

}
