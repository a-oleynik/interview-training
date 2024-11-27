package com.oleynik.interviewtraining.lesson3.homework.animals;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Собака лает");
    }

    public void fetch(){
        System.out.println("Собака приносит палку");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 5);
        dog.makeSound();
        dog.fetch();
    }
}
