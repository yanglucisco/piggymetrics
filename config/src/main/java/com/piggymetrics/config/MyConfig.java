package com.piggymetrics.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author YangLu
 * @version 1.0
 * @description desc
 * @date 2025/8/25 16:43
 **/
//@Configuration
public class MyConfig {
//    @Value("${spring.security.user.password:#{null}}")
    private String host;
    public String getHost(){
        return host;
    }
}
