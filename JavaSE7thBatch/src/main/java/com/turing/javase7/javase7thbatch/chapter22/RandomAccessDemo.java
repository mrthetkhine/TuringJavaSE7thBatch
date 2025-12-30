/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter22;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author macbook
 */
public class RandomAccessDemo {
    public static void main(String[] args) {
        String file = ("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/FileDemo.java");
        try(RandomAccessFile rf = new RandomAccessFile(file, "r"))
        {
            rf.seek(10);
            int ch;
            while((ch= rf.read())!=-1)
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
