package com.jayo.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UseFunctionService {
    //@Autowired
    @Resource
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
