package com.example.pslnvoicing.service.workbench;

import com.example.pslnvoicing.vo.workbench.EmpVo;

import java.util.List;

public interface PersonnelService {
    Boolean login(String phone, String password);

    List<EmpVo> queryEmpList();
}
