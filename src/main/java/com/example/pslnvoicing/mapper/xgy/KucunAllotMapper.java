package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.KucunAllot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface KucunAllotMapper {
    public List<KucunAllot> allotList(KucunAllot kucunAllot);
    public void addallot(KucunAllot kucunAllot);
    public KucunAllot maxId();
    public void updateState(Integer allotState, String allotShr, Date allotTime, Integer allotId);
}
