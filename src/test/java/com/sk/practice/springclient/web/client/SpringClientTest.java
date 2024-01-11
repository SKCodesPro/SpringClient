package com.sk.practice.springclient.web.client;

import com.sk.practice.springclient.web.dto.wrench.RoleDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class SpringClientTest {
@Autowired
SpringClient springClient;

    @Test
    void getRolesFromMS() {
        RoleDto roleDto =  springClient.getRolesFromMS("admin");
        String displayName = roleDto.getDisplayName();
        log.info(roleDto.toString());
        assertEquals(displayName, "Admin");
    }
}