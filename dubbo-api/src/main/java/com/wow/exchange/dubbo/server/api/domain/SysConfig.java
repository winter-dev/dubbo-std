package com.wow.exchange.dubbo.server.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysConfig {

    private Long id;

    private String key;

    private Object value;
}
