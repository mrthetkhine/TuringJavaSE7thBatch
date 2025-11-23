/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class Polymorphism {
    public static void main(String[] args) {
        Human h = new Human("Jhon", 23);
        
        h.work();
        
        h = new Doctor("Dr Jhon", 20, "Teech");
        
        h.work();
        
        h = new Teacher("Tr Jhon", 50, "CS");
        h.work();
        
        h.staticOne();
        //Human.staticOne();
        System.out.println("h.toString() "+h.toString());
        
        Object obj = h;
        //obj = new Teacher();
        obj =new Date();
    }
}
