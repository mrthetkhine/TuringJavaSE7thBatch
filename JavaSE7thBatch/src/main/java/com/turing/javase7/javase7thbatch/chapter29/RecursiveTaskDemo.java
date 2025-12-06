/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author macbook
 */
class SumTask extends RecursiveTask<Double>
{
    final int THRESHOLD = 1000;
    double[]data;
    int start,end;
    
    public SumTask(double[]data, int start,int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
        
        System.out.println("Sum start "+start+" end "+end);
    }
    @Override
    protected Double compute() {
        double sum = 0;
        if( (end-start) < THRESHOLD)
        {
            for (int start = 0; start <=end; start++) {
                sum+= data[start];
            }
        }
        else
        {
            int middle = (start+end)/2;
            SumTask task1 = new SumTask(data,start, middle);
            SumTask task2 = new SumTask(data,middle+1, end);
            
            task1.fork();
            task2.fork();
            
            sum = task1.join() + task2.join();
        }
        System.out.println("Done start "+start+" end "+end);
        return sum;
    }
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        
        double[]data = new double[100_000];
        
        for (int i = 0; i < data.length; i++) {
            data [i] = i;
        }
        System.out.println("Portion of original sequ");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        SumTask task =new SumTask(data,0,data.length-1);
        
        double result = pool.invoke(task);
        
        System.out.println("After sum "+result);
        
    }
}
