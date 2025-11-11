/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class SwitchString {
    public static void main(String[] args) {
        String str = new String("one");
        
        switch(str)
        {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
        }
    }
}
