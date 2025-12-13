/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter17;

/**
 *
 * @author macbook
 */
class Data
{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
record Employee(String name,int age)
{
    /*
    Employee(String name,int age)
    {
        this.name = name.toUpperCase();
        this.age = age;
        System.out.println("Constructor");
    }*/
    Employee{
        name = name.toUpperCase();
        System.out.println("Constructor");
    }
    String firstChar()
    {
        return this.name.charAt(0)+"";
    }
}
public class WhyRecord {
    public static void main(String[] args) {
        Employee e1 = new Employee("One",13);
        Employee e2 = new Employee("Two",15);
        
        
        System.out.println("E1 "+e1.name() + " e1.age "+e1.age()
                +" firstChar "+e1.firstChar());
    }
}
