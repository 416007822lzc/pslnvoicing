package com.example.pslnvoicing.service.purchase;


import com.example.pslnvoicing.mapper.purchase.PersonnelEmpMapper;
import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelEmpServiceImpl implements PersonnelEmpService {

    @Autowired
    private PersonnelEmpMapper personnelEmpMapper;

    @Override
    public List<PersonnelEmp> personnelEmpClientList() {
        return personnelEmpMapper.personnelEmpClientList();
    }
}
