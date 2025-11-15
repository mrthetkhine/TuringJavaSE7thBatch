/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class Triangle1 {
    /*
    *****
    ****
    ***
    **
    *
    */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");    
            }
            System.out.println("");
        }
    }
}
