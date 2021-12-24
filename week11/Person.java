package com.company;

public class Person {
    public Person(String name, int age){
        if (name == null || name.equals("") || name.length() > 40 || age < 0 || age > 120){
            throw new IllegalArgumentException("Illegal parameter value, please enter valid parameters");
        }
        else{
            System.out.println("OK");
        }
    }
}