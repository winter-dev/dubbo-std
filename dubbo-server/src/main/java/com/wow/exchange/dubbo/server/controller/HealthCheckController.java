package com.wow.exchange.dubbo.server.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
