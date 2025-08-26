package com.piggymetrics.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangLu
 * @version 1.0
 * @description desc
 * @date 2025/8/25 16:43
 **/
@RestController
public class MyController {
    @Autowired
    MyConfig myConfig;
    @GetMapping("test")
    public String test(){
        return "config-test   " + myConfig.getHost();
    }
}
