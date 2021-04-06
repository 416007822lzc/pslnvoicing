package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PersonnelEmpMapper {
    List<PersonnelEmp> personnelEmpClientList();
}
