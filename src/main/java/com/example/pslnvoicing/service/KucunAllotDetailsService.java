package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunAllotDetailsMapper;
import com.example.pslnvoicing.model.mapper.KucunAllotMapper;
import com.example.pslnvoicing.model.pojos.KucunAllot;
import com.example.pslnvoicing.model.pojos.KucunAllotDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KucunAllotDetailsService {
    @Autowired
    KucunAllotDetailsMapper kucunAllotDetailsMapper;

    public List<KucunAllotDetails> allotDetailsList(int id){
        return kucunAllotDetailsMapper.allotDetailsList(id);
    }

    public void addAllotDetails(KucunAllotDetails kucunAllotDetails){
        kucunAllotDetailsMapper.addAllotDetails(kucunAllotDetails);
    }
}
