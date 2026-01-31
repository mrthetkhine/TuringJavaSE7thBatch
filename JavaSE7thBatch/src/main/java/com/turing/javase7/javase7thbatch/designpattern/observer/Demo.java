/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.observer;

/**
 *
 * @author macbook
 */
public class Demo {
    public static void main(String[] args) {
        Observable model = new Model("Model");
        View view1 = new View("Piechart view ");
        model.add(view1);
        
        View view2 = new View("Barchart vie");
        model.add(view2);
        
        model.change("new data arrived");
        
        model.remove(view2);
        
        model.change("Second change");
                
    }
}
