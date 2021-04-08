package com.example.pslnvoicing.controller.workbench;

import com.example.pslnvoicing.conn.CommonResult;
import com.example.pslnvoicing.pojos.PersonnelDept;
import com.example.pslnvoicing.pojos.PersonnelEmp;

import com.example.pslnvoicing.service.workbench.PersonnelService;
import com.example.pslnvoicing.vo.workbench.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonnelController {

    @Autowired
    PersonnelService personnelService;

    /**
     * 查询员工列表
     * @return 员工列表
     */
    @GetMapping("/personnel/getList")
    public CommonResult queryEmpList(){
//        List<PersonnelEmp> personnelEmps = empService.empList();
        try {
            List<EmpVo> personnelEmps = personnelService.queryEmpList();
            return new CommonResult(200,"查询成功",personnelEmps);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"查询失败",null);

    }

    /**
     * 查询部门列表
     * @return 部门列表
     */
    @GetMapping("/personnel/getDeptList")
    public CommonResult queryDeptList(){
        try {
            List<PersonnelDept> personnelDepts = personnelService.queryDeptList();
            return new CommonResult(200,"查询成功",personnelDepts);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"查询失败",null);

    }

    /**
     *  新增部门
     * @param deptName 部门名
     * @return 部门列表
     */
    @PostMapping("/personnel/addDept/{deptName}")
    public CommonResult addDept(@PathVariable String deptName){
        try {
            List<PersonnelDept> personnelDepts = personnelService.addDept(deptName);
            return new CommonResult(200,"新增成功",personnelDepts);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"新增失败",null);
    }

    @PostMapping("/personnel/addEmp")
    public CommonResult addDept(@RequestBody EmpVo empVo){
        System.out.println(empVo.toString());
        try {
            List<EmpVo> personnelDepts = personnelService.addDEmp(empVo);
            return new CommonResult(200,"新增成功",personnelDepts);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"新增失败",null);
    }

    @PostMapping("/personnel/updateEmp")
    public CommonResult updateEmp(@RequestBody EmpVo empVo){
        System.out.println(empVo.toString());
        try {
            List<EmpVo> personnelDepts = personnelService.updateEmp(empVo);
            return new CommonResult(200,"修改成功",personnelDepts);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"修改失败",null);
    }

    @PostMapping("/personnel/delEmp/{id}")
    public CommonResult delEmp(@PathVariable Integer id){
        try {
            List<EmpVo> personnelDepts = personnelService.delEmp(id);
            return new CommonResult(200,"删除成功",personnelDepts);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new CommonResult(500,"删除失败",null);
    }
}
