/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello world");
        System.out.println("Length "+buffer.length());
        System.out.println("Cap "+buffer.capacity());
        
        //buffer.setLength(3);
        buffer.replace(0,3,"hi");
        System.out.println("Buffer "+buffer.toString());
        
    }
}
