package org.example.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    // Test API
    @GetMapping("/test")
    public ResponseEntity<String> testMethod() {

        return ResponseEntity.ok("Test Success");
    }
}
