package com.example.pslnvoicing.controller.capital;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.service.capia.CapitalPurchaseService;
import com.example.pslnvoicing.vo.CapitalpurchaseVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ckp")
public class CapitalPurchaseController {
	@Autowired
	CapitalPurchaseService capitalPurchaseService;

	@RequestMapping("/cg-select")
	public Map<String,Object> productmgr(String cpltckp, Integer pageNum, Integer size){
		if(pageNum==null)
			pageNum=1;
		if( size==null)
			size=4;
		Map<String,Object> map = new HashMap<>();
		Page<Object> page = PageHelper.startPage(pageNum, size);
		CapitalpurchaseVo cgkp= (CapitalpurchaseVo) JSONObject.toJavaObject(JSON.parseObject(cpltckp),CapitalpurchaseVo.class);
		List<CapitalpurchaseVo> list=capitalPurchaseService.selectcgkp(cgkp);
		map.put("rows",list);
		map.put("total",page.getTotal());
		return map;

	}
	@RequestMapping("/select-xial")
	public List<CapitalPayment>selectxl(){
		return capitalPurchaseService.selectxl();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/updatesp")
	public void updatesgkp(@RequestBody CapitalpurchaseVo capitalpurchaseVo){
		capitalPurchaseService.updatesckp(capitalpurchaseVo);
	}

	/**
	 * 新增
	 */
	@RequestMapping("/insert")
	public void insertskp(@RequestBody CapitalpurchaseVo capitalpurchaseVo){
		capitalPurchaseService.insertskp(capitalpurchaseVo);
	}
}
