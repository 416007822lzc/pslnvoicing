package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelEmpMapper {
    List<PersonnelEmp> personnelEmpClientList();
}
