/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author macbook
 */
public class MutualExclusionWithLock {
    public static void main(String[] args) {
        DataTwo data = new DataTwo(0);
        ReentrantLock lock = new ReentrantLock();
        
        IncThread2 t1 = new IncThread2(data,lock);
        IncThread2 t2 = new IncThread2(data,lock);
        IncThread2 t3 = new IncThread2(data,lock);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
            
            System.out.println("Data "+data.value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
