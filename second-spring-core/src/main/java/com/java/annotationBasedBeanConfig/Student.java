package com.java.annotationBasedBeanConfig;

import com.java.dependencyInjection.Marks;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        this.name = "Kranthi";
        this.age = 23;
    }
    @PostConstruct
    public void init(){
        System.out.println("initialization");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy");
    }
}
