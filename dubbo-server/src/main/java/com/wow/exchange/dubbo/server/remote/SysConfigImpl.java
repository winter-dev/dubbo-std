package com.wow.exchange.dubbo.server.remote;

import com.wow.exchange.dubbo.server.api.domain.SysConfig;
import com.wow.exchange.dubbo.server.api.service.SysConfigService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@DubboService
public class SysConfigImpl implements SysConfigService {
    @Override
    public void add(SysConfig config) {
        System.out.println("add config: " + config);
    }

    @Override
    public void delete(Long id) {
        System.out.println("delete config: " + id);
    }

    @Override
    public void update(SysConfig config) {
        System.out.println("update config: " + config);
    }

    @Override
    public SysConfig getById(Long id) {
        return new SysConfig(id, "key" + id, "value" + id);
    }

    @Override
    public List<SysConfig> select(SysConfig config) {
        return Stream.of(new SysConfig(1L, "k1", "v1"),
                new SysConfig(2L, "k2", "v2"),
                new SysConfig(3L, "k3", "v3"),
                new SysConfig(4L, "k4", "v4")).collect(Collectors.toList());
    }
}
