/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class MathDemo {
    static double toRadian(double degree)
    {
        return Math.PI /180 * degree;
    }
            
    public static void main(String[] args) {
        System.out.println("Math.sin(90) "+ Math.sin(Math.toRadians(90)));
    }
}
