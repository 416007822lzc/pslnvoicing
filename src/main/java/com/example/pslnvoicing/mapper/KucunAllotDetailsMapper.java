package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunAllot;
import com.example.pslnvoicing.model.pojos.KucunAllotDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunAllotDetailsMapper {
    public List<KucunAllotDetails> allotDetailsList(int allotId);
    public void addAllotDetails(KucunAllotDetails kucunAllotDetails);
}
