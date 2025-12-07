/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter13;

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
        File file  = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter13/ReadConsole.java");
        System.out.println("File Path "+file.getAbsolutePath());
        System.out.println("File exist "+file.exists());
     
        try (FileInputStream fin = new FileInputStream(file);
             FileOutputStream fout = new FileOutputStream("./copy.java")){
            
            int ch =0;
            
            do
            {
                try {
                    ch = fin.read();
                    if(ch != -1)
                    {
                        System.out.print((char)ch);
                        fout.write(ch);
                    }
                } catch (IOException ex) {
                    System.out.println("IO exception "+ex.getMessage());
                }
            }while(ch != -1);
        } catch (FileNotFoundException ex) {
            System.out.println("FileNot found "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IO exception "+ex.getMessage());
        }
        
    }
}
