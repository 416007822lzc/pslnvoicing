package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.mapper.workbench.EmpMapper;
import com.example.pslnvoicing.pojos.PersonnelDept;
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

    @Override
    public List<PersonnelDept> queryDeptList() {
        return empMapper.queryDeptList();
    }

    @Override
    public List<PersonnelDept> addDept(String deptName) {
        boolean b = empMapper.addDept(deptName) > 0;
        if (b){
            return queryDeptList();
        }
        return null;
    }

    @Override
    public List<EmpVo> addDEmp(EmpVo empVo) {
        boolean b = empMapper.addDEmp(empVo) > 0;
        if (b){
            return queryEmpList();
        }
        return null;
    }

    @Override
    public List<EmpVo> updateEmp(EmpVo empVo) {
        boolean b = empMapper.updateEmp(empVo) > 0;
        if (b){
            return queryEmpList();
        }
        return null;
    }

    @Override
    public List<EmpVo> delEmp(Integer id) {
        boolean b = empMapper.delEmp(id) > 0;
        if (b){
            return queryEmpList();
        }
        return null;
    }
}
