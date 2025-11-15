/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =(int)( Math.random()*10+1);
        
        int guess;
        do
        {
            System.out.println("Enter guess");
            guess = scanner.nextInt();
            if(guess < num)
            {
                System.out.println("Too small");
            }
            else if(guess > num)
            {
                System.out.println("Too big");
            }
            else
            {
                System.out.println("Congratulation");
            }
            
            
        }while(num != guess);
    }
    
}
