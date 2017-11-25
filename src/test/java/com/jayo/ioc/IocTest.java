package com.jayo.ioc;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {
    @Test
    public void testIoc() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFuntionService = context.getBean(UseFunctionService.class);
        System.out.println(useFuntionService.sayHello("world"));
        context.close();
    }
}
