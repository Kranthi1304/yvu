package com.java.springAopWithoutLogger.main;

import com.java.springAopWithoutLogger.dao.AnimalDao;
import com.java.springAopWithoutLogger.dao.AnimalDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.java.springAopWithoutLogger");
        AnimalDao ref = context.getBean("animalDaoImpl", AnimalDao.class);
        ref.sound();
        context.close();
    }
}
