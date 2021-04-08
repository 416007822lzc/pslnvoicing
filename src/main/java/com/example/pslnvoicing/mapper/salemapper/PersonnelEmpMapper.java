package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelEmpMapper {
    /**
     * 查询所有销售人员
     * @return
     */
    List<PersonnelEmp> personnelEmpClientList();
}
