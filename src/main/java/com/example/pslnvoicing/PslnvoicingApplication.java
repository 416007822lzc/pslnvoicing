package com.example.pslnvoicing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pslnvoicing.mapper")
public class PslnvoicingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PslnvoicingApplication.class, args);
    }

}
