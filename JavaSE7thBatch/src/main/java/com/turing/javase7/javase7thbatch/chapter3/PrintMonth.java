/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class PrintMonth {
    public static void main(String[] args) {
        String[] monthName= {
            "Jan","Feb","Mar","April","May",
            "Jun","Jul","Aug","Sep",
            "Oct","Nov","Dec"
        };
        /*
        System.out.println(monthName[0]);
        System.out.println(monthName[1]);
        System.out.println(monthName[2]);
        */
        for (int i = 0; i < monthName.length; i++) {
            System.out.println("months [" + i + "] "+ monthName[i]);
        }
    }
}
