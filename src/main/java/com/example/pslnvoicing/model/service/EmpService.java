package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.EmpMapper;
import com.example.pslnvoicing.model.mapper.KucunAllotMapper;
import com.example.pslnvoicing.model.pojos.KucunAllot;
import com.example.pslnvoicing.model.pojos.PersonnelEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpMapper empMapper;

    public List<PersonnelEmp> empList(){
        return empMapper.empList();
    }
}
