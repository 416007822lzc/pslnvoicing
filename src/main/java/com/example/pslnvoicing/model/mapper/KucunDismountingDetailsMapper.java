package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunAssembleDetails;
import com.example.pslnvoicing.model.pojos.KucunDismountingDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunDismountingDetailsMapper {
   public List<KucunDismountingDetails> dismountingDetailsList(Integer dismountingId);
}
