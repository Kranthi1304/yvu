package com.java.annotationBasedBeanConfig;

import org.springframework.stereotype.Repository;

@Repository
public class Marks {
    private int marks1;

    public Marks() {
        this.marks1 = 10;
        this.marks2 = 20;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marks1=" + marks1 +
                ", marks2=" + marks2 +
                '}';
    }

    private int marks2;

}
