/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.observer;

/**
 *
 * @author macbook
 */
public class View implements Observer{

    String name;
    
    public View(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("View "+this.name+" update "+message);
    }
    
    
}
