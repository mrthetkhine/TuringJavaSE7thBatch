/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Student
{
    static String headmaster;
    String name;
    static final int SIZE = 10;
    static
    {
        headmaster = "";
        System.out.println("Static block 1");
    }
    static
    {
        System.out.println("Static block 2");
    }
    Student(String name)
    {
        this.name =name;
    }
    void display()
    {
        System.out.println("Sudent name "+this.name);
        System.out.println("headmaster "+Student.headmaster);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student.headmaster = "U Tin Win";
        //Student.SIZE ++;
        
        Student stud1 = new Student("Aung Aung");
        Student stud2 = new Student("Win Naing");
        
        stud1.display();
        stud2.display();
        
        Student.headmaster = "Daw Win Tint";
        stud1.display();
        stud2.display();
        
    }
}
