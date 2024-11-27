package com.oleynik.interviewtraining.lesson3.homework.student;

public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student() {
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 5) {
            throw new IllegalArgumentException("GPA must be between 0 and 5");
        }
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == o || getClass() != o.getClass()) {
            return false;
        }
        return this.id == ((Student) o).id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }

    @Override
    public Object clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Student(this.name, this.id, this.gpa);
        }
    }

    public static void main(String[] args) {
        Student studentAnna = new Student("Anna", 101, 4.8);
        System.out.println(studentAnna);
        Student studentAnnaClone = (Student) studentAnna.clone();
        System.out.println(studentAnnaClone);
        System.out.println(studentAnna.equals(studentAnnaClone));
        Student studentSveta = new Student("Svrta", 101, 2.0);
        System.out.println(studentAnna.equals(studentSveta));
    }
}
