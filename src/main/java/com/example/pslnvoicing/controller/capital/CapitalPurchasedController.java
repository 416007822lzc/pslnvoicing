package com.example.pslnvoicing.controller.capital;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.service.capia.CapitalPurchasedService;
import com.example.pslnvoicing.vo.CapitalpurchaseVo;
import com.example.pslnvoicing.vo.CapitalpurchasedVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/spxq")
public class CapitalPurchasedController {
	@Autowired
	CapitalPurchasedService capitalPurchasedService;
	@RequestMapping("/spxq-select")
	public Map<String,Object> productmgr(String cpltcspxq, Integer pageNum, Integer size){
		if(pageNum==null)
			pageNum=1;
		if( size==null)
			size=4;
		Map<String,Object> map = new HashMap<>();
		Page<Object> page = PageHelper.startPage(pageNum, size);
		CapitalpurchasedVo cgkpxq= JSONObject.toJavaObject(JSON.parseObject(cpltcspxq),CapitalpurchasedVo.class);
		List<CapitalpurchasedVo> list=capitalPurchasedService.selectall(cgkpxq);
		map.put("rows",list);
		map.put("total",page.getTotal());
		return map;

	}
}
