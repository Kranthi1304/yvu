package com.java.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-annotation-application-context.xml");

        Customer cust = (Customer) context.getBean("customer");
        System.out.println(cust);
        System.out.println(cust.getAction());
        System.out.println(cust.getPerson().getName());
        context.close();
    }
}
