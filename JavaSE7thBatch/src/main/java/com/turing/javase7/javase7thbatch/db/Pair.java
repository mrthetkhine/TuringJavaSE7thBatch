/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.db;

/**
 *
 * @author macbook
 */
class Pair<T, U> {
    
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

   

    public U getSecond() {
        return second;
    }

   
}
