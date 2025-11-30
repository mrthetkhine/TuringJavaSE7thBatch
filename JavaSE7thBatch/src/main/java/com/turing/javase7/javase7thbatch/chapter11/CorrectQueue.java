/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class CorrectQueue implements IQueue{
    int n;
    boolean valueSet = false;
    
    public synchronized void put(int n)
    {
        while(valueSet)//already produce, wait after consumer consume
        {
            try
            {
                System.out.println("Producer wait");
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Exception "+e.getMessage());
            }
        }
        this.n = n;
        this.valueSet = true;
        System.out.println("Put "+this.n);
        notify();//alert consumer 
        
    }
    public synchronized int get()
    {
        while(!valueSet)
        {
            try
            {
                System.out.println("Consumer wait");
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Exception "+e.getMessage());
            }
        }
        System.out.println("Got "+n);
        valueSet = false;
        notify();
        return this.n;
    }
}
