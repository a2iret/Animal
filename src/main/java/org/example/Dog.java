package org.example;

public class Dog extends Animal{
    @Override
    public void sleep(){
        System.out.print("Dog is sleeping");
    }

    public void eat(){
        System.out.print("Dog is eating");
    }
}
