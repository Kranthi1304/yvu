package com.java.annotationDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Hyudai implements Car{
    public Hyudai() {
        System.out.println("Hyundai Engine");
    }
    public void run()
    {
        System.out.println("Toyota Engine");
    }
}
