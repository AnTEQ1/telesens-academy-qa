package com.academy.telesens.lesson7;

import com.academy.telesens.lesson5.exc.Person;

public class Boxer extends Person {
    public void fight(){
        System.out.println("I am boxing");
    }

    @Override
    public String getProfile() {
        return "I am boxing";
    }

    @Override
    public String toString() {
        return "Boxer{}";
    }
}
