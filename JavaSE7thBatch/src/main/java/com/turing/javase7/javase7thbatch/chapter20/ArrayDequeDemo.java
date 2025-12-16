/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayDeque;

/**
 *
 * @author macbook
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        //LIFO
        
        queue.push("one");
        queue.push("two");
        queue.push("three");
        
        while(!queue.isEmpty())
        {
            System.out.println("Pop "+queue.pop());
        }
    }
}
