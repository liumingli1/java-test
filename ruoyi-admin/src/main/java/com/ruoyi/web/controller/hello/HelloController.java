package com.ruoyi.web.controller.hello;

import com.ruoyi.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    private ITestService testService;

    @GetMapping("/hello")
    public String getParam(){
        return testService.helloTest();
    }




    }
