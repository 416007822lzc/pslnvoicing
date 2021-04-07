package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.KucunDismountingDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunDismountingDetailsMapper {
    public List<KucunDismountingDetails> dismountingDetailsList(Integer dismountingId);
}
