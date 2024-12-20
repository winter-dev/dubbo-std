package com.wow.exchange.dubbo.server.server.controller;

import com.wow.exchange.dubbo.server.api.domain.SysConfig;
import com.wow.exchange.dubbo.server.api.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/config")
public class SysConfigController {

    @Autowired
    private SysConfigService sysConfigService;

    @GetMapping("/list")
    public List<SysConfig> list() {
        return sysConfigService.select(null);
    }
}
