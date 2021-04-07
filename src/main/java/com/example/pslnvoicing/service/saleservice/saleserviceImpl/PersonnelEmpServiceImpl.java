package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.PersonnelEmpMapper;
import com.example.pslnvoicing.pojos.PersonnelEmp;
import com.example.pslnvoicing.service.saleservice.PersonnelEmpService;
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
