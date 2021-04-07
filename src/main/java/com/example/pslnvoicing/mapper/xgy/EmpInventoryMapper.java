package com.example.pslnvoicing.mapper.xgy;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpInventoryMapper {
    public List<PersonnelEmp> empList();
}
