/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class IncThread extends Thread{
    Data data;
    public IncThread(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 10_000; i++) {
            synchronized(this.data)
            {
                this.data.value ++;
            }
            
        }
    }
}
