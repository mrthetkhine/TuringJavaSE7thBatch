/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.bridge;

/**
 *
 * @author macbook
 */
public abstract class Shape {
    DrawingApi api;
    
    public Shape(DrawingApi api)
    {
        this.api = api;
    }
    abstract void draw();
}
