/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author macbook
 */
class SqrtTransform extends RecursiveAction
{
    final int THRESHOLD = 1000;
    double[]data;
    int start,end;
    
    public SqrtTransform(double[] data,int start,int end)
    {
        this.data = data;
        this.start = start;
        this.end = end;
        
        System.out.println("New SqrtTransform start "+start+" end "+end);
    }
    @Override
    protected void compute() {
        if( (end-start)< THRESHOLD )
        {
            for (int i = start; i <=end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else
        {
            int middle = (start+end)/2;
            invokeAll(new SqrtTransform(data,start,middle),
                    new SqrtTransform(data,middle+1,end));
        }
        System.out.println("Done start "+start+" end "+end);
        
    }
    
}
public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        
        double[]data = new double[10_000];
        
        for (int i = 0; i < data.length; i++) {
            data [i] = i;
        }
        System.out.println("Portion of original sequ");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        SqrtTransform task =new SqrtTransform(data,0,data.length-1);
        
        pool.invoke(task);
        
        System.out.println("After sqrt of");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
