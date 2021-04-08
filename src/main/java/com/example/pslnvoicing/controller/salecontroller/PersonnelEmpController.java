package com.example.pslnvoicing.controller.salecontroller;

import com.example.pslnvoicing.pojos.PersonnelEmp;
import com.example.pslnvoicing.service.saleservice.PersonnelEmpService;
import com.example.pslnvoicing.conn.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonnelEmpController {
    @Autowired
    private PersonnelEmpService personnelEmpService;

    /**
     * 查询所有销售人员
     * @return
     */
    @RequestMapping("/PersonnelEmpAll")
    public @ResponseBody CommonResult personnelEmpAll() {
        try {
            List<PersonnelEmp> personnelEmps = personnelEmpService.personnelEmpClientList();
            return new CommonResult(200, "查询成功", personnelEmps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CommonResult(500, "查询失败");
    }
}
