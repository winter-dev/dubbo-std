package com.wow.exchange.dubbo.server.api.service;

import com.wow.exchange.dubbo.server.api.domain.SysConfig;

import java.util.List;

public interface SysConfigService {

    public void add(SysConfig config);

    public void delete(Long id);

    public void update(SysConfig config);

    public SysConfig getById(Long id);

    public List<SysConfig> select(SysConfig config);
}
