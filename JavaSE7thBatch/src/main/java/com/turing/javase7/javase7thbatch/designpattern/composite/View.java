/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.composite;

/**
 *
 * @author macbook
 */
public class View implements UIWidget{
    String name;
    public View(String name)
    {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Draw View "+this.name);
    }
    
}
