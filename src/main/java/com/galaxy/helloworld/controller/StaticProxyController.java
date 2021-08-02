package com.galaxy.helloworld.controller;

import com.galaxy.helloworld.middleware.ProxyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 静态代理
 *
 * @author yanghaolei
 * @date 下午 2020-08-07 14:49
 */

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/proxy")
public class StaticProxyController {

    private final ProxyService proxyService;

    @PostMapping("/goStatic")
    public Boolean staticProxy(){
        return proxyService.goProxy();
    }
}
