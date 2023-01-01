package com.java.annotationDependencyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Honda implements  Car{

    @Value("2016")
    private int year;

    @Value(value="{Kranth,Siva,Babu}")
    private String[] owners;


    public Honda() {
        System.out.println("Honda Engine");
    }

    @Override
    public String toString() {
        return "Honda{" +
                "year=" + this.year +
                ", owners=" + Arrays.toString(this.owners) +
                '}';
    }

    public void run()
    {
        System.out.println("Honda Engine");
       System.out.println(this.year);
//        this.toString();
        System.out.println(this);
    }
}
