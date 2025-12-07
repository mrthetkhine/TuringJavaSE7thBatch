/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
class IncorrectSum<T>
{
    T[] nums;
    
    IncorrectSum(T[] nums)
    {
        this.nums = nums;
    }
    double getTotal()
    {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            //total += nums[i];
        }
        return total ;
    }
}
class Sum<T extends Number>
{
    T[] nums;
    
    Sum(T[] nums)
    {
        this.nums = nums;
    }
    /*
    boolean isSameAverage(Sum<T> another)
    {
        return this.getTotal() == another.getTotal();
    }
    */
    //allow cross type Sum<Integer> vs Sum<Float>
    boolean isSameAverage(Sum<?> another)
    {
        return this.getTotal() == another.getTotal();
    }
    double getTotal()
    {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i].doubleValue();
        }
        return total ;
    }
}
public class WhyBounded {
    public static void main(String[] args) {
        //IncorrectSum<String> sum = new IncorrectSum(new String[]{"Apple","Orange"});
        
        Sum<Integer> iSum = new Sum(new Integer[]{1,2,3});
        System.out.println("Total "+iSum.getTotal());
        
        Sum<Float> fSum = new Sum(new Float[]{1.0F,2.0F,3.0F});
        System.out.println("Total "+fSum.getTotal());
        
        System.out.println("iSum "+iSum.isSameAverage(fSum));
    }
}
