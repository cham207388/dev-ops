package com.abc.devops.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevOpsServiceTest {
    private DevOpsService service = new DevOpsService();

    @Test
    void devOps() {
        assertEquals("Learning Jenkins", service.devOps());
    }
}