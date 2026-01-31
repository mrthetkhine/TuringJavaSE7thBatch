/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.observer;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Model implements Observable{

    String name;
    ArrayList<Observer> views = new ArrayList<>();
    public Model(String name)
    {
        this.name = name;
    }
   
    
    @Override
    public void add(Observer observer) {
        this.views.add(observer);
    }
    
    @Override
    public void change(String message) {
        System.out.println("Model update "+message);
        for(Observer obs : this.views)
        {
            obs.update(message);
        }
    }

    @Override
    public void remove(Observer observer) {
        this.views.remove(observer);
    }

    
    
}
