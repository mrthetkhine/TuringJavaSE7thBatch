/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author macbook
 */
public class SeqInputDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/FileDemo.java");
        File file2 = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/ReadFileDemo.java");
        
        try(SequenceInputStream seqIn = new SequenceInputStream(
                new FileInputStream(file), new FileInputStream(file2));)
        {
            int ch;
            while((ch=seqIn.read()) != -1 )
            {
                System.out.print((char)ch);
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception "+e.getMessage());
        }
    }
}
