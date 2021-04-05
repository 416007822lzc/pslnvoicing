package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunAllotMapper;
import com.example.pslnvoicing.model.pojos.KucunAllot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KucunAllotService {
    @Autowired
    KucunAllotMapper kucunAllotMapper;

    public List<KucunAllot> allotList(KucunAllot kucunAllot){
        return kucunAllotMapper.allotList(kucunAllot);
    }

    public void addAllot(KucunAllot kucunAllot){
        kucunAllotMapper.addallot(kucunAllot);
    }

    public KucunAllot maxId(){
        return kucunAllotMapper.maxId();
    }
}
