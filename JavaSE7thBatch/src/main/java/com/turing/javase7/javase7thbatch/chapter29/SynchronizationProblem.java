/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;



/**
 *
 * @author macbook
 */
public class SynchronizationProblem {
    public static void main(String[] args) {
        
        Data data = new Data(0);
        
        IncThreadV2 t1 = new IncThreadV2(data);
        IncThreadV2 t2 = new IncThreadV2(data);
        IncThreadV2 t3 = new IncThreadV2(data);
        
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
