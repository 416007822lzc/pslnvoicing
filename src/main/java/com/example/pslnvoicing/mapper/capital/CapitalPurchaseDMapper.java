package com.example.pslnvoicing.mapper.capital;

import com.example.pslnvoicing.vo.Capitali;
import com.example.pslnvoicing.vo.CapitalpurchasedVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CapitalPurchaseDMapper {
	//模糊查询 条件
	public List<CapitalpurchasedVo> selectall(CapitalpurchasedVo capitalpurchasedVo);
}
