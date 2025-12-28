/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class ByteInputStreamDemo {
    public static void main(String[] args) {
        String message="Hello World injava";
        try(ByteArrayInputStream bin =new ByteArrayInputStream(message.getBytes()))
        {
            
            for (int i = 0; i < 2; i++) {
                int ch ;
                
                while ( (ch= bin.read())!=-1)
                {
                    System.out.print(Character.toUpperCase((char)ch));
                }
                System.out.println("");
                bin.reset();
            }
        }
        catch(IOException e)
        {
            System.out.println("Message "+e.getMessage());
        }
            
    }
}
