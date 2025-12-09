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
    /*
    public void set(T t)//set(Object t)
    {
    }
    
    public void set(U u)//set(Objet u)
    {
    }
    */
            
    
}
class Triple<T,U,V> extends Pair<T,U>
{
    V third;
    public Triple(T first,U second, V third)
    {
        super(first,second);
        this.third = third; 
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }
    
}
public class GenHierarchary {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("id-1",100);
        System.out.println("Pair "+pair.getFirst() +" second "+pair.getSecond());
        
        Triple<Integer,String,Integer> triple = new Triple(100,"id-1",1);
        System.out.println("Triple "+triple.getFirst()+" second "+triple.getSecond() 
                + " third "+triple.getThird());
    }
}
