package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.model.service.KucunWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class KucunWarehouseContorller {
    @Autowired
    KucunWarehouseService warehouseService;
}
