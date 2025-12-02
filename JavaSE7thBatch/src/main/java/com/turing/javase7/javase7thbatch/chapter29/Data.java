/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.atomic.AtomicInteger;



/**
 *
 * @author macbook
 */
public class Data {
    public AtomicInteger value;
    public Data(int value)
    {
        this.value = new AtomicInteger(value);
        
    }
}
