/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class NoOfDayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] monthName= {
            "Jan","Feb","Mar","April","May",
            "Jun","Jul","Aug","Sep",
            "Oct","Nov","Dec"
        };
        int[] dayInMonth = {
            31,28,31,30,31,
            30,31,31,30,
            31,31,31
        };
        
        int month ;
        System.out.println("Enter month ");
        
        month = scanner.nextInt();
        System.out.println("Month name "+monthName[month-1]+" no of day "+dayInMonth[month-1]);
        
        System.out.println("MonthName.length "+monthName.length);
    }
}
