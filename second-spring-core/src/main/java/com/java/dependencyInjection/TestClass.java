package com.java.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-annotation-application-context.xml");
        Student s= (Student) context.getBean("student");
        System.out.println(s);
        System.out.println(s.getMarks());
        context.close();
    }
}
