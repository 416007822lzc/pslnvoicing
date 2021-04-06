package com.example.pslnvoicing.model.service;

import com.example.pslnvoicing.model.mapper.KucunOutboundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KucunOutboundService {
    @Autowired
    KucunOutboundMapper outboundMapper;
}
