package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunCheckMapper;
import com.example.pslnvoicing.model.pojos.KucunCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KucunCheckService {
    @Autowired
    KucunCheckMapper checkMapper;
//高级查询
    public List<KucunCheck> findCheck(){
        return checkMapper.findCheck();
    }

}
