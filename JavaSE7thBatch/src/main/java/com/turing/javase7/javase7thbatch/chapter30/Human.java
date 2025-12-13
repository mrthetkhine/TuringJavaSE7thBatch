/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter30;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,Female;
}
public class Human {
    String name;
    int age;
    Gender gender;
    
    public Human(String name,int age,Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        //System.out.println("Human constructor");
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
   
}
