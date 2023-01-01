package com.java.annotationDependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ref = new AnnotationConfigApplicationContext("com.java.annotationDependencyInjection");
        User c = (User) ref.getBean("user");
        c.start();
        System.out.println(c);
    }
}
