package com.example.pslnvoicing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ceshi {
    @GetMapping("/payment/get/{id}")
    public String create(@PathVariable("id") Long id){
        return "哈哈哈";
    }
}
