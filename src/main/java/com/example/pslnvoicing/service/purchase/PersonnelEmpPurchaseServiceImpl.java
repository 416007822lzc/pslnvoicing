package com.example.pslnvoicing.service.purchase;


import com.example.pslnvoicing.mapper.purchase.PersonnelEmpPurchaseMapper;
import com.example.pslnvoicing.pojos.PersonnelEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelEmpPurchaseServiceImpl implements PersonnelEmpService {

    @Autowired
    private PersonnelEmpPurchaseMapper personnelEmpPurchaseMapper;

    @Override
    public List<PersonnelEmp> personnelEmpClientList() {
        return personnelEmpPurchaseMapper.personnelEmpClientList();
    }
}
