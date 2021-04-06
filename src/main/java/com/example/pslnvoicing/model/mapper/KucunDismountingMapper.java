package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunAllot;
import com.example.pslnvoicing.model.pojos.KucunDismounting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunDismountingMapper {
    public List<KucunDismounting> dismountingList(KucunDismounting KucunDismounting);
}
