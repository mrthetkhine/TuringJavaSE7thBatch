/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Pair<T,U>
{
    T first;
    U second;
    
    public Pair(T first,U second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
    
}
public class MultipleReturnDemo {
    static Pair<Integer,Exception> div(int a, int b)
    {
        if( b== 0)
        {
            return new Pair(0,new Exception("Divisor is zero"));
        }
        else
        {
            return new Pair(a/b,null);
        }
    }
    public static void main(String[] args) {
        Pair<Integer,Exception> result = div(10,0);
        
        if(result.getSecond() !=null)
        {
            System.out.println("Error case "+result.getSecond().getMessage());
        }
        else
        {
            System.out.println("Success "+result.getFirst());
        }
    }
}
