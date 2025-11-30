/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class SynchronizationProblem {
    public static void main(String[] args) {
        
        Data data = new Data(0);
        
        IncThread t1 = new IncThread(data);
        IncThread t2 = new IncThread(data);
        IncThread t3 = new IncThread(data);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Data value "+data.value);
    }
}
