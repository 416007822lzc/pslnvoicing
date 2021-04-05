package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunAllot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.zip.Inflater;

@Mapper
@Repository
public interface KucunAllotMapper {
    public List<KucunAllot> allotList(KucunAllot kucunAllot);
    public void addallot(KucunAllot kucunAllot);
    public KucunAllot maxId();
}
