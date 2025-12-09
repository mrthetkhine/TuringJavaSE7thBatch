/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface MyFun
{
    int func(int x);
    
}
public class VariableCapture {
    public static void main(String[] args) {
        //final 
        int i = 10;
        
        MyFun fun = (x)->{
            System.out.println("I inside fun "+i);
            //i = 30;
            return x+1;
        };
        System.out.println("Fun "+ fun.func(19));
        
    }
}
