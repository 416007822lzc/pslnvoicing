package com.example.pslnvoicing.mapper.workbench;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import com.example.pslnvoicing.vo.workbench.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<EmpVo> queryEmpList();

    Integer login(String phone, String password);
}
