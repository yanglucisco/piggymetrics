package com.piggymetrics.auth.controller;

import com.piggymetrics.auth.repository.UserRepository;
import com.piggymetrics.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author YangLu
 * @version 1.0
 * @description desc
 * @date 2025/8/26 15:15
 **/
@RestController
public class MyTestController {
//    @Autowired
//    private UserService userService;
    @Autowired
    private UserRepository repository;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        Iterable<com.piggymetrics.auth.domain.User> a = repository.findAll();
        a.forEach(b -> {
            System.out.println(b.getUsername());
        });
        return "test";
    }
}
