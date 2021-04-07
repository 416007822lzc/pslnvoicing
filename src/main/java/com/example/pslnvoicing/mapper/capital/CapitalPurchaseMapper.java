package com.example.pslnvoicing.mapper.capital;

import com.example.pslnvoicing.pojos.CapitalPayment;
import com.example.pslnvoicing.pojos.CapitalPurchaseDetails;
import com.example.pslnvoicing.vo.CapitalpurchaseVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CapitalPurchaseMapper {
	public	List<CapitalpurchaseVo> selectcgkp(CapitalpurchaseVo capitalpurchaseVo);
	//下拉
	public List<CapitalPayment>selectxl();

	//修改采购收票
	public void updatesp(CapitalpurchaseVo capitalpurchaseVo);
	//新增
	public void insertcgkp(CapitalpurchaseVo capitalpurchaseVo);
	//收票详情表新增
	public void insertspxq(CapitalPurchaseDetails capitalPurchaseDetails);



}
