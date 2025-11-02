/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class ScopeDemo {
    public static void main(String[] args) {
        //block
        {
            int a = 10;
            System.out.println("First block");
            
            System.out.println("A is "+a);
        }
        //System.out.println("A "+a);
        char a = 'A';
        {
            //double a= 10;
        }
    }
}
