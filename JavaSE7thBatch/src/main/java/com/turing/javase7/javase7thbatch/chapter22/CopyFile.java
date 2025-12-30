/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class CopyFile {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/FileDemo.java");
        try(FileInputStream fin = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream("./temp.txt"))
        {
            System.out.println("Available "+fin.available());
            int ch ;
            do
            {
                ch = fin.read();
                if(ch!=-1)
                {
                    System.out.print((char)ch);
                    fout.write(ch);
                }
            }while(ch!=-1);
            System.out.println("Available "+fin.available());
        } catch (IOException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
    }
}
