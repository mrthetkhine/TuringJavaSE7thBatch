/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12.nullcheck;

/**
 *
 * @author macbook
 */
public class Human {
    @NotNull(message="Name must not be null")
    String name;
    
    int age;
    
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}
