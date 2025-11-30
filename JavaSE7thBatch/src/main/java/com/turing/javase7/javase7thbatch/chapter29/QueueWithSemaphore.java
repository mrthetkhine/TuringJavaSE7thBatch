/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import com.turing.javase7.javase7thbatch.chapter11.IQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
public class QueueWithSemaphore implements IQueue{

    int n;
    Semaphore semConsumer = new Semaphore(0);
    Semaphore semProducer = new Semaphore(1);
    
    @Override
    public int get() {
        try
        {
            semConsumer.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Got "+this.n);
        this.semProducer.release();
        return this.n;
    }
    
    @Override
    public void put(int n) {
        try
        {
            semProducer.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Put "+this.n);
        
        this.semConsumer.release();
       
    }

    
    
}
