package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.KucunDismounting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunDismountingMapper {
    public List<KucunDismounting> dismountingList(KucunDismounting KucunDismounting);
}
