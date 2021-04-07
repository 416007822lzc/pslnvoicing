package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.pojos.PersonnelDept;
import com.example.pslnvoicing.vo.workbench.EmpVo;

import java.util.List;

public interface PersonnelService {
    Boolean login(String phone, String password);

    List<EmpVo> queryEmpList();

    List<PersonnelDept> queryDeptList();

    List<PersonnelDept> addDept(String deptName);

    List<EmpVo>  addDEmp(EmpVo empVo);

    List<EmpVo> updateEmp(EmpVo empVo);

    List<EmpVo> delEmp(Integer id);

}
