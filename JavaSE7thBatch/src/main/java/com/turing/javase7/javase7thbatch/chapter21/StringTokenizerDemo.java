/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.StringTokenizer;

/**
 *
 * @author macbook
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "Apple,Orange,banana:Mongo";
        
        StringTokenizer tokenizer = new StringTokenizer(str,",:");
        while(tokenizer.hasMoreTokens())
        {
            System.out.println("Token "+tokenizer.nextToken());
        }
    }
}
