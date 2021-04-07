package com.example.pslnvoicing.service.xgy;
import com.example.pslnvoicing.mapper.xgy.KucunDismountingDetailsMapper;
import com.example.pslnvoicing.mapper.xgy.KucunDismountingMapper;
import com.example.pslnvoicing.pojos.KucunDismounting;
import com.example.pslnvoicing.pojos.KucunDismountingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KucunDismountingService {
    @Autowired
    KucunDismountingMapper kucunDismountingMapper;

    @Autowired
    KucunDismountingDetailsMapper kucunDismountingDetailsMapper;


    public List<KucunDismounting> kucunDismountingList(KucunDismounting kucunDismounting){
        return kucunDismountingMapper.dismountingList(kucunDismounting);
    }

    public List<KucunDismountingDetails> kucunDismountingDetailsList(Integer id){
        return kucunDismountingDetailsMapper.dismountingDetailsList(id);
    }




}
