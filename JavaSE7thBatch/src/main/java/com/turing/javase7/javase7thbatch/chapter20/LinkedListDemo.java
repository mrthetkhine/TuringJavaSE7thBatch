/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.LinkedList;

/**
 *
 * @author macbook
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        
        linkedList.addLast("Z");
        linkedList.addFirst("0");
        
        linkedList.forEach(System.out::println);
    }
}
