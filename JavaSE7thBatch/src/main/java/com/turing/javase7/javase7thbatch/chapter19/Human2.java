/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class Human2 implements Comparable<Human2>
{
    String name;
    int age;
    
    public Human2(String name,int age)
    {
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Human2 another) {
        return this.age - another.age;
    }
    
}
