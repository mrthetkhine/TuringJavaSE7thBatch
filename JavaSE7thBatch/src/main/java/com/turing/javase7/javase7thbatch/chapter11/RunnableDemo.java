/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
class ThreadWithRunnable implements Runnable
{
    String name;
    public ThreadWithRunnable(String name)
    {
        this.name = name;
    }   
    @Override
    public void run() {
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
public class RunnableDemo  {
    public static void main(String[] args) {
        System.out.println("Thread Name ==>"+Thread.currentThread().getName());
        Thread t1 = new Thread(new ThreadWithRunnable("One"));
        Thread t2 = new Thread(new ThreadWithRunnable("Two"));
        Thread t3 = new Thread(new ThreadWithRunnable("Three"));
        
        t1.start();
        t2.start();
        t3.start();
    }
}
