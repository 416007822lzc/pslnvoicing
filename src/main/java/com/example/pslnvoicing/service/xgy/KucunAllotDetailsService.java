package com.example.pslnvoicing.service.xgy;

import com.example.pslnvoicing.mapper.xgy.KucunAllotDetailsMapper;
import com.example.pslnvoicing.pojos.KucunAllotDetails;
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
