package com.example.pslnvoicing.controller.capital;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.CapitalPaymentDetails;
import com.example.pslnvoicing.service.capia.CapialPaymentdService;
import com.example.pslnvoicing.vo.Capitali;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/xq")
public class CapitalPaymentDController {
	@Autowired
	CapialPaymentdService capialPaymentdService;
	@RequestMapping("/xq-select")
	public Map<String,Object> productmgr(String cpltxq, Integer pageNum, Integer size){
		if(pageNum==null)
			pageNum=1;
		if( size==null)
			size=4;
		Map<String,Object> map = new HashMap<>();
		Page<Object> page = PageHelper.startPage(pageNum, size);
		Capitali cpiltxq= JSONObject.toJavaObject(JSON.parseObject(cpltxq), Capitali.class);
		List<Capitali> list=capialPaymentdService.selectall(cpiltxq);
		map.put("rows",list);
		map.put("total",page.getTotal());
		return map;

	}
}
