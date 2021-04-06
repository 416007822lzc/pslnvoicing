package com.example.pslnvoicing.service.xgy;

import com.example.pslnvoicing.mapper.xgy.KucunAllotMapper;
import com.example.pslnvoicing.pojos.KucunAllot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public void updateState(Integer allotState, String allotShr, Date allotTime,Integer allotId){
        kucunAllotMapper.updateState(allotState,allotShr,allotTime,allotId);
    }
}
