package com.java.annotationDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
    public Toyota() {
        System.out.println("Toyota Engine");
    }
    public void run()
    {
        System.out.println("Toyota Engine");
    }
}
