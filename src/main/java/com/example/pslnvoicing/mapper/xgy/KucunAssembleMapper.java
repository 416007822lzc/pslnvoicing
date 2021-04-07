package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.KucunAssemble;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KucunAssembleMapper {
    public List<KucunAssemble> assembleList(KucunAssemble kucunAssemble);
    public void addAssemble(KucunAssemble kucunAssemble);
    public KucunAssemble maxId();
}
