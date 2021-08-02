package com.galaxy.helloworld.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * push消息服务配置
 *
 * @author yanghaolei
 * @date
 */

@ConfigurationProperties(prefix = "push")
@Component
@Data
public class PushConfig {


    private String appKey;
    private String appId;
    private String masterSecret;
    private String url;

    @Override
    public String toString() {
        return "appKey " + appKey + "appId " + appId + "masterSecret " + masterSecret + "url " + url;

    }
}
