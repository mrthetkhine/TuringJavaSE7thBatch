/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter13;

/**
 *
 * @author macbook
 */
class Human
{
    String name;
    int age;
    
    Human(String name,int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Two argument constructor");
    }
    Human(String name)
    {
        this(name,0);
        System.out.println("One argument constructor");
    }
}
public class OverloadConDemo {
    public static void main(String[] args) {
        Human h = new Human("Jhon");
        
    }
}
