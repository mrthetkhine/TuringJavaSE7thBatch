/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.flyweight;

/**
 *
 * @author macbook
 */
public class JVM implements Platform{

    public JVM()
    {
        System.out.println("Create JVM");
    }
    
    @Override
    public void execute(Code code) {
        System.out.println("JVM execute code "+code.getCode());
    }
    
}
