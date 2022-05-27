package com.healthsafe.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@RefreshScope
public class HealthSafeController {

    @Value("${message}")
    private String message;

    @Value("${feature-flag}")
    private boolean featureFlag;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok(message);
    }

    @GetMapping("/flag")
    public ResponseEntity<Boolean> getFeatureFlag(){
        return ResponseEntity.ok(featureFlag);
    }

}
