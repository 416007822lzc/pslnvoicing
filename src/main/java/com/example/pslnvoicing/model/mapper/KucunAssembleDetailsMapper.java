package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunAllotDetails;
import com.example.pslnvoicing.model.pojos.KucunAssembleDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunAssembleDetailsMapper {
   public void addAsembleDetails(KucunAssembleDetails kucunAssembleDetails);
}
