package com.example.pslnvoicing.service.capia;

import com.example.pslnvoicing.mapper.capital.CapitalPurchaseDMapper;
import com.example.pslnvoicing.vo.CapitalpurchasedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalPurchasedService {
	@Autowired
	CapitalPurchaseDMapper capitalPurchaseDMapper;
	public List<CapitalpurchasedVo> selectall(CapitalpurchasedVo capitalpurchasedVo){
		List<CapitalpurchasedVo>list=capitalPurchaseDMapper.selectall(capitalpurchasedVo);
		for (CapitalpurchasedVo i:list) {
			System.out.println("查询成功:"+i.toString());
		}
		return list;
	}
}
