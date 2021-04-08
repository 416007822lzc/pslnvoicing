package com.example.pslnvoicing.controller.workbench;

import com.example.pslnvoicing.service.workbench.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆验证
 */
@RestController
public class LoginController {

    @Autowired
    PersonnelService personnelService;

    @PostMapping("/login/{phone}/{password}")
    public Boolean login(@PathVariable String phone,@PathVariable String password){
        return personnelService.login(phone, password);
    }
}
