package com.java.springAopWithoutLogger.dao;

import org.springframework.stereotype.Repository;

@Repository("animalDaoImpl")
public class AnimalDaoImpl implements AnimalDao{
    @Override
    public void sound() {
        System.out.println("Animal sound");
    }
}
