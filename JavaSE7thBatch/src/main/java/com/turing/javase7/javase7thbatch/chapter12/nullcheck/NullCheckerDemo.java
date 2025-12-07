/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12.nullcheck;

/**
 *
 * @author macbook
 */
public class NullCheckerDemo {
    public static void main(String[] args) {
        Human h = new Human(null,30);
        Address address = new Address(null,"YKN");
        
        NullChecker.checkNullString(address);
        NullChecker.checkNullString(h);
    }
}
