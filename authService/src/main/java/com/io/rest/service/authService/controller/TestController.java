package com.io.rest.service.authService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/secure")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> testMethod(){
        Map<String, String> health = new HashMap<>();
        health.put("status", "UP and Running");
        return new ResponseEntity<>(health, HttpStatus.OK);
    }
}
