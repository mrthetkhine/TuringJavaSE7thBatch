/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.Formatter;

/**
 *
 * @author macbook
 */

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter fmt =new Formatter();
        System.out.println(fmt.format("Formatting %-30s is easy %,5d %.2f","Java",12345, 12.345f));
        fmt.close();
        
        fmt = new Formatter();
        fmt = fmt.format("Formatting %-30s is easy %,5d %.2f","C#",10, 12.345f);
        System.out.println(fmt);
    }
}
