package com.example.pslnvoicing.service.xgy;

import com.example.pslnvoicing.mapper.xgy.KucunAssembleDetailsMapper;
import com.example.pslnvoicing.mapper.xgy.KucunAssembleMapper;
import com.example.pslnvoicing.pojos.KucunAssemble;
import com.example.pslnvoicing.pojos.KucunAssembleDetails;
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
        kucunAssembleDetailsMapper.addAssembleDetails(kucunAssembleDetails);
    }

    public List<KucunAssembleDetails> assembleDetailsList(Integer id){
        return kucunAssembleDetailsMapper.assembleDetailsList(id);
    }
}
