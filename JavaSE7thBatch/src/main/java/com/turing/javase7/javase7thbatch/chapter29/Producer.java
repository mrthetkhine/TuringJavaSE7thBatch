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
public class Producer extends Thread{
    IQueue queue;
    
    public Producer(IQueue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        int i=0;
        for (int j = 0; j < 100; j++) {
            this.queue.put(i++);
        }
        
    }
}
