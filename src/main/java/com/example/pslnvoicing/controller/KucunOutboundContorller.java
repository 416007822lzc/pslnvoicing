package com.example.pslnvoicing.controller;

import com.example.pslnvoicing.model.service.KucunOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class KucunOutboundContorller {
    @Autowired
    KucunOutboundService outboundService;
}
