/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
interface MinMax<T extends Comparable<T>>
{
    T max();
    T min();
}
class MyClass<T extends Comparable<T>> implements MinMax<T>
{

    T[] arr;
    public MyClass(T[] arr)
    {
        this.arr = arr;
    }
    @Override
    public T max() {
        T maxElement = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if(maxElement.compareTo(this.arr[i]) < 0) //arr >maxElement
            {
                maxElement = this.arr[i];
            }
        }
        return maxElement;
    }
    @Override
    public T min() {
        T minEle = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if(minEle.compareTo(this.arr[i]) > 0) //arr < minElement
            {
                minEle = this.arr[i];
            }
        }
        return minEle;
    }
}
public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1,2,3,-109};
        
        MyClass<Integer> obj = new MyClass(intArr);
        Integer max = obj.max();
        Integer min = obj.min() ;
        
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}
