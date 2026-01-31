/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.bridge;

/**
 *
 * @author macbook
 */
public class SvgApi implements DrawingApi{

    @Override
    public void drawCircle() {
        System.out.println("SVG Circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("SVG Rectangle");
    }
    
}
