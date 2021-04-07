package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.mapper.workbench.EmpMapper;
import com.example.pslnvoicing.vo.workbench.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService {
    @Autowired
    EmpMapper empMapper;

    @Override
    public Boolean login(String phone,String password) {
        Integer login = empMapper.login(phone, password);
        return login>0;
    }

    @Override
    public List<EmpVo> queryEmpList() {
        return  empMapper.queryEmpList();
    }
}
