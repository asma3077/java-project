package com.oopHybrideInheritance;

public class Asma extends Human implements Ariana, Faiyaz {


    @Override
    public void eat() {
        System.out.println("I like to eat");
    }

    @Override
    public void drive() {
        System.out.println("I can drive");
    }

    @Override
    public void fishing() {
        System.out.println("I love fishing");
    }

    @Override
    public void run() {
        System.out.println("I can run");

    }
}
