package com.jayo.ioc;

import org.springframework.stereotype.Service;


public class FunctionService {

    public String sayHello(String word) {
        return  "Hello " + word + " !";
    }

}
