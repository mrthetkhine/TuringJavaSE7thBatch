/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
class Task extends Thread
{
    String name;
    
    Task(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+this.name + " i "+i);
        }
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        //es = Executors.newCachedThreadPool();
        es.execute(new Task("One"));
        es.execute(new Task("Two"));
        es.execute(new Task("Three"));
        es.execute(new Task("Four"));
        
        es.shutdown();
        
    }
}
