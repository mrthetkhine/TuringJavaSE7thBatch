/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class Sum implements Callable<Integer>
{
    int stop;
    Sum(int stop)
    {
        this.stop = stop;
    }
    
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            try
            {
                sum += i;
                System.out.println("Add "+i);
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        System.out.println("Return ");
        return sum;
    }
    
}

public class CallableDemo {
    public static void main(String[] args) throws TimeoutException {
        ExecutorService es = Executors.newFixedThreadPool(2);
            
        System.out.println("Starting ");
        
        Future<Integer> result = es.submit(new Sum(10));
        Future<Integer> result2 = es.submit(new Sum(50));
        try {
           
            
            Integer sum =result.get(1200,TimeUnit.MILLISECONDS);
            Integer sum2 =result2.get();
            
            System.out.println("Result "+sum);
            System.out.println("Result2 "+sum2);
            
            es.shutdown();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
    }
}
