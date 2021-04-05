package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunAssembleDetailsMapper;
import com.example.pslnvoicing.model.mapper.KucunAssembleMapper;
import com.example.pslnvoicing.model.pojos.KucunAssemble;
import com.example.pslnvoicing.model.pojos.KucunAssembleDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KucunAssembleService {
    @Autowired
    KucunAssembleMapper kucunAssembleMapper;

    @Autowired
    KucunAssembleDetailsMapper kucunAssembleDetailsMapper;

    public List<KucunAssemble> assembleList(KucunAssemble kucunAssemble){
        return kucunAssembleMapper.assembleList(kucunAssemble);
    }

    public void addAssemble(KucunAssemble kucunAssemble){
        kucunAssembleMapper.addAssemble(kucunAssemble);
    }

    public KucunAssemble maxId(){
        return kucunAssembleMapper.maxId();
    }

    public void addAssembleDetails(KucunAssembleDetails kucunAssembleDetails){
        kucunAssembleDetailsMapper.addAsembleDetails(kucunAssembleDetails);
    }
}
