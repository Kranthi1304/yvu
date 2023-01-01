package com.java.xmlConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    @Qualifier("person")
    @Autowired(required=true)
    private Person person;

    private int type;
    private String action;
//    public Customer()
//    {
//        this.type=10;
//        this.action="Standard";
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + ", type=" + type + ", action="
                + action + "]";
    }

    public void init(){
        System.out.println("Init Method");
    }

    public void destroy(){
        System.out.println("Destroy method");
    }
}
