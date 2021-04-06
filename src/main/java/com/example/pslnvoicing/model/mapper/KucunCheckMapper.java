package com.example.pslnvoicing.model.mapper;

import com.example.pslnvoicing.model.pojos.KucunCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunCheckMapper {
    //高级查询
    List<KucunCheck> findCheck();

}
