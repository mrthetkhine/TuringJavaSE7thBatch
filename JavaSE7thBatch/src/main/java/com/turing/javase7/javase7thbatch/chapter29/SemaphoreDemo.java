/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import com.turing.javase7.javase7thbatch.chapter11.Data;
import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */

class IncThread extends Thread{
    Data data;
    Semaphore semaphore;
    
    public IncThread(Data data,Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }
    public void run()
    {
        for (int i = 0; i < 10_000; i++) {
            try
            {
                this.semaphore.acquire();
                
                this.data.value ++;
                
                this.semaphore.release();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        Data data = new Data(0);
        
        IncThread t1 = new IncThread(data,sem);
        IncThread t2 = new IncThread(data,sem);
        IncThread t3 = new IncThread(data,sem);
        
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
