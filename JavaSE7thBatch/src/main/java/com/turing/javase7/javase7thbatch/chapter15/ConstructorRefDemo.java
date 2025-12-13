/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Factory
{
    Human create(String name,int age);
}
class Human
{
    String name;
    int age;
    
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Human constructor");
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
    
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        Factory factory = Human::new;
        
        Human h = factory.create("Jhon", 10);
        System.out.println("H "+h);
    }
}
