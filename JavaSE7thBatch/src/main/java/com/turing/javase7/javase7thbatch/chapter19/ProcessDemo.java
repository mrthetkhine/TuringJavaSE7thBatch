/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ProcessDemo {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls -la");
            try(InputStream in = process.getInputStream())
            {
                int ch ;
                do 
                {
                    ch = in.read();
                    if(ch !=-1)
                    {
                        System.out.print((char)ch);
                    }
                }while(ch !=-1);
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            process.waitFor();
        } catch (Exception ex) {
            Logger.getLogger(ProcessDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
