/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.principle;

/**
 *
 * @author macbook
 */
public class Car { 
    Engine engine;//engine = new Engine();
    
    Car(Engine engine)
    {
        this.engine = engine;
    }
    
    void start()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
