/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class FileConsumeAction implements Runnable
{
    public void run()
    {
        System.out.println("FileConsumerAction");
    }
}
class DownloaderTask extends Thread
{
    CyclicBarrier barrier;
    String name;
    
    public DownloaderTask(CyclicBarrier barrier,String name)
    {
        this.barrier = barrier;
        this.name = name;
    }
    public void run()
    {
        Random random = new Random();
        int count = random.nextInt(10);
        System.out.println("Task "+this.name + " start count "+count );
        try {
            for (int i = 0; i < count; i++) {
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("Task "+this.name+" done");
            this.barrier.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(DownloaderTask.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BrokenBarrierException ex) {
            Logger.getLogger(DownloaderTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,new FileConsumeAction());
        
        DownloaderTask t1 = new DownloaderTask(barrier,"One");
        DownloaderTask t2 = new DownloaderTask(barrier,"Two");
        DownloaderTask t3 = new DownloaderTask(barrier,"Three");
        DownloaderTask t4 = new DownloaderTask(barrier,"Four");
        DownloaderTask t5 = new DownloaderTask(barrier,"Five");
        
        System.out.println("Starting ");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
