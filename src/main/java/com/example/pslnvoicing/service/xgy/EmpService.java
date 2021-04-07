package com.example.pslnvoicing.service.xgy;

import com.example.pslnvoicing.mapper.xgy.EmpInventoryMapper;
import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpInventoryMapper empInventoryMapper;

    public List<PersonnelEmp> empList(){
        return empInventoryMapper.empList();
    }
}
