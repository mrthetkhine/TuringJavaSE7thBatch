/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;



/**
 *
 * @author macbook
 */
public class IncThreadV2 extends Thread{
    Data data;
    public IncThreadV2(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 10_000; i++) {
            this.data.value.getAndIncrement();
            
        }
    }
}
