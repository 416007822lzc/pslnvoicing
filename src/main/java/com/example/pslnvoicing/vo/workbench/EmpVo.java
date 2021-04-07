package com.example.pslnvoicing.vo.workbench;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
    private int empId;
    private String empName;
    private String empGender;
    private String empPhone;
    private String empEmil;
    private String empPassword;
    private String deptName;
}
