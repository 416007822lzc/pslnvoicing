package com.example.pslnvoicing.vo.workbench;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
    private Integer deptId;
    private String deptName;
    private String empEmil;
    private String empGender;
    private int empId;
    private String empName;
    private String empPassword;
    private String empPhone;
}
