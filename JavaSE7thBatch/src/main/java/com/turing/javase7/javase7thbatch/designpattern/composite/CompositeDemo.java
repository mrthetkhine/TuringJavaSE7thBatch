/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.composite;

/**
 *
 * @author macbook
 */
public class CompositeDemo {
    public static void main(String[] args) {
        ViewGroup frame = new ViewGroup("Frame");
        
        ViewGroup panel = new ViewGroup("Panel");
        panel.addChild(new View("TextBox1"));
        panel.addChild(new View("TextBox2"));
        
        frame.addChild(panel);
        frame.addChild(new View("Label 1"));
        
        frame.draw();
    }
}
