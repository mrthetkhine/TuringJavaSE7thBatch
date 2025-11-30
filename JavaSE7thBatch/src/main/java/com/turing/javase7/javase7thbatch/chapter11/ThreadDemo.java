/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    String name;
    public MyThread(String name)
    {
        super(name);
        this.name = name;
    }
    
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread Name "+this.name + " >> "+i);
            try
            {
                if(i%20==0)
                {
                    Thread.sleep(100);
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("One");
        MyThread t2 = new MyThread("Two");
        MyThread t3 = new MyThread("Three");
        
        //t1.setPriority(Thread.MAX_PRIORITY);
        //t2.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("End t1.isAlive() "+t1.isAlive());
        
        System.out.println("is Main daemon "+Thread.currentThread().isDaemon());
        t1.start();
        t2.start();
        t3.start();
        
        
        try
        {
            t1.join();
            System.out.println("Thread 1 done");
            
            t2.join();
            System.out.println("Thread 2 done");
            
            t3.join();
            System.out.println("Thread 3 done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Done all thread "+t1.isAlive());
        
    }
}
