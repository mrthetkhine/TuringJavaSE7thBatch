/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class TextBlockDemo {
    public static void main(String[] args) {
        String multiLine = "Hello\r\n"
                        +"Second line";
        System.out.println("Multi "+multiLine);
        
        String str = """
                     First line
                     "second line"
                     third line
                     """;
        System.out.println("Str "+str);
    }
}
