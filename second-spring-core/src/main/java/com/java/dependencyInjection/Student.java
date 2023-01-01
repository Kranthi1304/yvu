package com.java.dependencyInjection;

public class Student {
   private  String name;
   private int age;
   private String mailId;
   private String collegeName;
   private Marks marks;

    public Marks getMarks() {
        return marks;
    }

    public Student(String name, int age, String mailId, Marks marks) {
        this.name = name;
        this.age = age;
        this.mailId = mailId;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mailId='" + mailId + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
    public void init(){
        System.out.println("init method executed");
    }
    public void destroy(){
        System.out.println("Destroy method executed");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}