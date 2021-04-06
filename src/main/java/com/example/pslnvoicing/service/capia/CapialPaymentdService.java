package com.example.pslnvoicing.service.capia;

import com.example.pslnvoicing.mapper.capital.CapitalPaymentDMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapialPaymentdService {
	@Autowired
	CapitalPaymentDMapper capitalPaymentDMapper;
}
