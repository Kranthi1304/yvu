package com.java.dependencyInjection;

public class Marks {
    private int marks1;
    private int marks2;

    @Override
    public String toString() {
        return "Marks{" +
                "marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +
                '}';
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public Marks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;

    }

    private int marks3;

}
