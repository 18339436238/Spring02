package com.fxh;

import com.fxh.annonation.Boy;
import com.fxh.aop.Girl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Girl girl = (Girl) context.getBean("girl");
        girl.shopping();
    }

    @Test
    void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annonation.xml");
        Boy boy = (Boy) context.getBean("boy");
        boy.coding();
    }
}
