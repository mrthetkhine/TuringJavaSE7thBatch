/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class NestLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer ===>i "+i);
            for (int j = 0; j < 3; j++) {
                System.out.println("Inner j "+j);
            }
        }
    }
}
