/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.principle;

/**
 *
 * @author macbook
 */
public class OCPProblem {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.start();
    }
}
