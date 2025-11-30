/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
class PrinterThread extends Thread
{
    String name;
    Semaphore sem;
    
    public PrinterThread(String name,Semaphore sem)
    {
        this.name = name;
        this.sem = sem;
    }
    public void run()
    {
        for (int i = 0; i < 10_000; i++) {
            
            try
            {
                this.sem.acquire();
                System.out.println("Name "+this.name + " i=> "+i);
                Thread.sleep(500);
                this.sem.release();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Pinter {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        
        PrinterThread t1 = new PrinterThread("One",sem);
        PrinterThread t2 = new PrinterThread("Two",sem);
        PrinterThread t3 = new PrinterThread("Three",sem);
        PrinterThread t4 = new PrinterThread("Four",sem);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
