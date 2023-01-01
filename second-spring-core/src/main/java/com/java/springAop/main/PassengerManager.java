package com.java.springAop.main;

import com.java.springAop.dao.PassengerDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.java.springAop");
        context.refresh();
        PassengerDao passengerDao = context.getBean("passengerDaoImpl", PassengerDao.class);

        System.out.println(passengerDao.getPassenger(1));
        context.close();
    }
}
