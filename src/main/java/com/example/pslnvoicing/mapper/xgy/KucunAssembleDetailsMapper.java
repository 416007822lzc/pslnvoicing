package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.KucunAssembleDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunAssembleDetailsMapper {
   public List<KucunAssembleDetails> assembleDetailsList(Integer assembleId);
   public void addAssembleDetails(KucunAssembleDetails kucunAssembleDetails);
}
