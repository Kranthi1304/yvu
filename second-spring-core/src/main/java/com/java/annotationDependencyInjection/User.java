package com.java.annotationDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

//@Autowired
//@Resource
//@Inject

@Component
public class User {
    @Qualifier("honda")
    @Autowired
    private Car car;
    public void start(){
        car.run();
    }
}
