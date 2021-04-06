package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunAssembleDetailsMapper;
import com.example.pslnvoicing.model.mapper.KucunAssembleMapper;
import com.example.pslnvoicing.model.mapper.KucunDismountingDetailsMapper;
import com.example.pslnvoicing.model.mapper.KucunDismountingMapper;
import com.example.pslnvoicing.model.pojos.KucunAssemble;
import com.example.pslnvoicing.model.pojos.KucunAssembleDetails;
import com.example.pslnvoicing.model.pojos.KucunDismounting;
import com.example.pslnvoicing.model.pojos.KucunDismountingDetails;
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
