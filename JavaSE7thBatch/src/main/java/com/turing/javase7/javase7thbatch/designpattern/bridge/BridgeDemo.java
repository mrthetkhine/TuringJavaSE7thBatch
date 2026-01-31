/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.bridge;

/**
 *
 * @author macbook
 */
public class BridgeDemo {
    public static void main(String[] args) {
        
        DrawingApi api = new CanvasApi();
        api = new SvgApi();
       
        Shape shape = new Circle(api);
        shape.draw();
        
        shape = new Rectangle(api);
        shape.draw();
    }
}
