package com.java.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.Date;


public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.java");
//        context.scan("com.java");
//        context.register();
       // Date date = context.getBean("getDate", Date.class);
//        //System.out.println(date);
//        System.out.println(date.getTime());
//        System.out.println("y");
//        System.out.println(date);

    }
}
