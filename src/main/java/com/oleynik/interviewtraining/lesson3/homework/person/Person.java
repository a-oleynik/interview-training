package com.oleynik.interviewtraining.lesson3.homework.person;

import com.oleynik.interviewtraining.lesson3.homework.person.enums.City;
import com.oleynik.interviewtraining.lesson3.homework.person.enums.Gender;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private City city;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Gender gender, City city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", age='" + age +
                ", gender=" + gender +
                ", city=" + city +
                '}';
    }

    public static void main(String[] args) {
        Person ivan1 = new Person("Ivan", 25, Gender.MAN, City.NEW_YORK);
        Person ivan2 = new Person("Ivan", 25);
        ivan2.setGender(Gender.UNKNOWN);
        System.out.println(ivan1);
        System.out.println(ivan2);
        System.out.println(ivan1.equals(ivan2));
    }
}
