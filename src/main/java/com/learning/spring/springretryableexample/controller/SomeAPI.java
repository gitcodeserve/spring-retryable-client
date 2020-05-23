package com.learning.spring.springretryableexample.controller;

import com.learning.spring.springretryableexample.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeAPI {

    @Autowired
    RetryService myService;

    @GetMapping("/my-service")
    public String get(){
        return myService.retry();
    }
}
