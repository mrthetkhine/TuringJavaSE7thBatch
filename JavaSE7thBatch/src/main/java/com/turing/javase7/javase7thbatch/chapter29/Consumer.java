/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import com.turing.javase7.javase7thbatch.chapter11.IQueue;

/**
 *
 * @author macbook
 */
public class Consumer extends Thread{
    IQueue queue;
    
    public Consumer(IQueue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
      
        for (int i = 0; i < 100; i++) {
            this.queue.get();
        }
        
    }
}
