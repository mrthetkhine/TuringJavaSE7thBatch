/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

/**
 *
 * @author macbook
 */

public class ChainedException {
    static void demo()
    {
        NullPointerException ne = new NullPointerException("top layer");
        ne.initCause(new ArithmeticException("root cause"));
        throw ne;
    }
    public static void main(String[] args) {
        try
        {
            demo();
        }
        catch(NullPointerException ne)
        {
            System.out.println("Ne.getMessage "+ne.getMessage());
            System.out.println("ne.getCause "+ne.getCause());
        }
    }
}
