package com.example.pslnvoicing.mapper.workbench;

import com.example.pslnvoicing.pojos.PersonnelDept;
import com.example.pslnvoicing.vo.workbench.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    /***
     * 查询员工
     * @return
     */
    List<EmpVo> queryEmpList();

    /**
     * 验证登陆
     * @param phone 账号（手机号）
     * @param password 密码
     * @return
     */
    Integer login(String phone, String password);

    /**
     * 查询部门
     * @return
     */
    List<PersonnelDept> queryDeptList();


    /**
     * 增加部门
     * @param deptName
     * @return
     */
    Integer addDept(String deptName);

    /**
     * 增加员工
     * @param empVo
     * @return
     */
    Integer addDEmp(EmpVo empVo);

    /**
     * 编辑员工
     * @param empVo
     * @return
     */
    Integer updateEmp(EmpVo empVo);

    /**
     * 删除员工
     * @param id
     * @return
     */
    Integer delEmp(Integer id);
}
