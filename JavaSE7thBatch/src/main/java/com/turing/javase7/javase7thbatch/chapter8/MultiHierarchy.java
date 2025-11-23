/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Human extends Object
{
    private String name;
    int age;
    
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Human Constructor");
    }
    public void display()
    {
        System.out.println("Name is "+this.name + " Age "+this.age);
    }
    public void work()
    {
        System.out.println("Human "+this.name + " work");
    }
    public static void staticOne()
    {
        System.out.println("Human static one");
    }
}
class Teacher extends Human
{
    private String subject;
    
    public Teacher(String name, int age, String subject)
    {
        super(name,age);
        this.subject = subject;
        System.out.println("Teahcer constructor");
    }
    public void display()
    {
        super.display();
        System.out.println("Teacher teach "+this.subject+ " subject");
    }
    public void work()
    {
        System.out.println("Teacher  teach");
    }
    public static void staticOne()
    {
        System.out.println("Teacher static one");
    }
}
class Doctor extends Human
{
    private String medicalField;
    public Doctor(String name, int age, String medicalField)
    {
        super(name,age);
        this.medicalField = medicalField;
        System.out.println("Doctor constructor");
    }
    public void work()
    {
        System.out.println("Doctor treat patient");
    }
    public static void staticOne()
    {
        System.out.println("Doctor static one");
    }
}
class UniversityTeacher extends Teacher
{
    String university;
    public UniversityTeacher(String name,int age, String subject,String university)
    {
        super(name,age,subject);
        this.university = university;
        
        System.out.println("UniversityTeacher contructor");
    }
    public void display()
    {
        super.display();
        System.out.println("Teacher teach at"+this.university);
    }
}
public class MultiHierarchy {
    public static void main(String[] args) {
        Human h = new UniversityTeacher("Jhon", 40, "CS", "UCSY");
        h.display();
    }
}
