/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
class Data
{
    int x;
    public Data(int x)
    {
        this.x = x;
    }

    @Override
    public String toString() {
        System.out.println("ToStringCalled");
        return "Data{" + "x=" + x + '}';
    }
    
}
public class ConcatDemo {
    public static void main(String[] args) {
        Data data = new Data(100);
        
        System.out.println("Before concat");
        String str = ""+data;
        System.out.println("Str "+str);
    }
}
