/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macbook
 */
class Human implements Comparable<Human>
{
    String name;
    int age;
    
    public Human(String name,int age)
    {
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Human another) {
        return this.age - another.age;
    }
    
}
public class BoundedUsecase {
    public static void main(String[] args) {
        ArrayList<Human> list =new ArrayList<>();
        
        list.add(new Human("Jhon",40));
        list.add(new Human("Aung Aung",30));
        list.add(new Human("Win Naing",20));
        list.add(new Human("Sein Win",50));
        
        for (Human h : list) {
            System.out.println("Human "+h);
        }
        
        Collections.sort(list);
        System.out.println("Sorted");
        for (Human h : list) {
            System.out.println("Human "+h);
        }
    }
}
