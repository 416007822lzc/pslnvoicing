package com.example.pslnvoicing.service.capia;

import com.example.pslnvoicing.mapper.capital.CapitalPurchaseMapper;
import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.CapitalPurchaseDetails;
import com.example.pslnvoicing.vo.CapitalpurchaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalPurchaseService {
	@Autowired
	CapitalPurchaseMapper capitalPurchaseMapper;
	public List<CapitalpurchaseVo> selectcgkp(CapitalpurchaseVo capitalpurchaseVo){
		return capitalPurchaseMapper.selectcgkp(capitalpurchaseVo);
	}

	/**
	 * 下拉列表
	 * @param
	 */
	public List<CapitalPayment>selectxl(){
		return capitalPurchaseMapper.selectxl();
	}

	/**
	 * 修改
	 * @param capitalpurchaseVo
	 */
	public void updatesckp(CapitalpurchaseVo capitalpurchaseVo){
		CapitalPurchaseDetails capitalPurchaseDetails=new CapitalPurchaseDetails();
		capitalPurchaseDetails.setCapitalPurchaseByPurchaseId(capitalpurchaseVo.getPurid());
		System.out.println("开票id："+capitalpurchaseVo.getPurid());
		System.out.println("修改成功:"+capitalpurchaseVo.toString());
		capitalPurchaseMapper.updatesp(capitalpurchaseVo);
		capitalPurchaseMapper.insertspxq(capitalPurchaseDetails);
	}
	/**
	 * 新增
	 */
	public void insertskp(CapitalpurchaseVo capitalpurchaseVo){
		capitalPurchaseMapper.insertcgkp(capitalpurchaseVo);
		System.out.println("新增成功:"+capitalpurchaseVo.toString());
	}
}
