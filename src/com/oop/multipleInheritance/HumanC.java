package com.oop.multipleInheritance;

public class HumanC implements HumanA,HumanB {
    @Override
    public void religion() {
        System.out.println("I am religion");
    }

    @Override
    public void shape() {
        System.out.println("I have a shape");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void eat() {
        System.out.println("I like to eat food");
    }

    @Override
    public void drive() {
        System.out.println("I can drive");
    }

    @Override
    public void fishing() {
        System.out.println("I love fishing");
    }
}
