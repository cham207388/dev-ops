package com.abc.devops.controller;

import com.abc.devops.service.DevOpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {

    @Autowired
    private DevOpsService devOpsService;

    @GetMapping
    public String devOps(){
        return devOpsService.devOps();
    }
}
