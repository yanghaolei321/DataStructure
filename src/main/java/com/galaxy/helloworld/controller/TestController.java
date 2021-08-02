package com.galaxy.helloworld.controller;

import com.baijia.xiaozao.core.tool.api.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Test Controller
 *
 * @author yanghaolei
 * @date 下午 2020-08-07 14:49
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public R<Boolean> get() {

        RestTemplate restTemplate = new RestTemplate();
        return R.data(Boolean.TRUE);
    }
}
