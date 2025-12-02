/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class CLThread extends Thread
{
    CountDownLatch latch;
    
    CLThread(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("I "+i);
            this.latch.countDown();
        }
    }
}
public class CDLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        System.out.println("Starting");
        
        CLThread t1 = new CLThread(latch);
        t1.start();
        
        try
        {
            latch.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
