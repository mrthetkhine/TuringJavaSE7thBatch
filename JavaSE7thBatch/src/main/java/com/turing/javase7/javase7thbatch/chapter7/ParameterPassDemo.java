/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Data
{
    int x;
    public Data(int x)
    {
        this.x= x;
    }
}
public class ParameterPassDemo {
    static void inc(int p)
    {
        p ++;
    }
    static void inc(Data data)
    {
        data.x ++;
    }
    static void inc2(Data data)
    {
        data = new Data(200);
    }
    public static void main(String[] args) {
        int a = 10;
        inc(a);//p = a;
        
        System.out.println("A "+a);
        Data d = new Data(100);
        inc(d);//data = d;
        
        System.out.println("d.x "+d.x);
        inc2(d);
        System.out.println("d.x "+d.x);
    }
}
