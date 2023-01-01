package com.java.mailConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ref = new AnnotationConfigApplicationContext("com.java.mailConfig");
        MailConfig mail = (MailConfig)ref.getBean("com/java/mailConfig");
        System.out.println(mail);

    }
}
