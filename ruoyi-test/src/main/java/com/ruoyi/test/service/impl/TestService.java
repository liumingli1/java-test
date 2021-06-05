package com.ruoyi.test.service.impl;

import com.ruoyi.test.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Override
    public String helloTest() {
        return "hello";
    }
}
