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
public class WriteData {
    public static void main(String[] args) {
        
        try(FileOutputStream fout = new FileOutputStream("./hello.txt"))
        {
            String message = "Hello World in Java\r\nNext line";
            fout.write(message.getBytes());
        } catch (IOException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
    }
}
