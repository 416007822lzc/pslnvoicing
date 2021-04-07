package com.example.pslnvoicing.service.capia;

import com.example.pslnvoicing.mapper.capital.CapitalPaymentDMapper;
import com.example.pslnvoicing.pojos.CapitalPaymentDetails;
import com.example.pslnvoicing.vo.Capitali;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapialPaymentdService {
	@Autowired
	CapitalPaymentDMapper capitalPaymentDMapper;
	public List<Capitali> selectall(Capitali capitali){
	return 	 capitalPaymentDMapper.selectall(capitali);
	}
}
