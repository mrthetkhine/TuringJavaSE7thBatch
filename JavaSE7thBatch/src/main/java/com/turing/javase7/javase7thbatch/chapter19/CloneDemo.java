/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Human implements Cloneable
{
    String name;
    int age;
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    Human makeClone()
    {
        Human h =null;
        try {
            h = (Human)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Human.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
    
}
public class CloneDemo {
    public static void main(String[] args) {
        Human h = new Human("Jhon",43);
        Human h2 = h.makeClone();
        
        System.out.println("h "+h);
        System.out.println("h2 "+h2);
    }
}
