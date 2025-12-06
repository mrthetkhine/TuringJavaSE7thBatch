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
public class IncThread2 extends Thread{
    DataTwo data;
    ReentrantLock rLock;
    
    public IncThread2(DataTwo data,ReentrantLock lock)
    {
        this.data = data;
        this.rLock = lock;
    }
    
    public void run()
    {
        for (int i = 0; i < 100_000; i++) {
            this.rLock.lock();
            
            this.data.value ++;
            
            this.rLock.unlock();
        }
    }
}
