/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Ch6Demo {
    void hello()
    {
        System.out.println("Default hello");
    }
    public void publicMethod()
    {
        System.out.println("Ch6 Demo");
        this.privateMethod();
    }
    private void privateMethod()
    {
        System.out.println("privateMethod Can only use in own class");
    }
}
