/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class IncorrectQueue implements IQueue{
    int n;
    
    public synchronized void put(int n)
    {
        this.n = n;
        System.out.println("Put "+n);
    }
    public synchronized int get()
    {
        System.out.println("Got "+n);
        return this.n;
    }
}
