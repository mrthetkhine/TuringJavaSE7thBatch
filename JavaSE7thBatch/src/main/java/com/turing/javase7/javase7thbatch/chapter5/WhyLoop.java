/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class WhyLoop {
    public static void main(String[] args) {
        /*
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        */
        /*
        int i = 0;
        while(i < 5)//condition
        {
            System.out.println("Hello "+i);
            i++;//step
        }
        System.out.println("End "+i);
        */
        /*
        for (int i = 0; 
                i < 5; 
                i++) {
            System.out.println("Hello "+i);
        }*/
        /*
        int i = 0; 
        for (;
                i < 5; 
                ) {
            System.out.println("Hello "+i);
            i++;
        }*/
        int arr[] ={10,20,30,40};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[ "+i+"] "+ arr[i]);
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count "+i);
        }
    }
    
}
