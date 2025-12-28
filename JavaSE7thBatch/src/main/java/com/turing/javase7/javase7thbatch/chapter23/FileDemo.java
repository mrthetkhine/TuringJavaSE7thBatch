/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/FileDemo.java");
        File folder = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23");
        System.out.println("Path "+file.getAbsolutePath());
        System.out.println("Name "+file.getName());
        System.out.println("Path "+file.getPath());
        System.out.println("Parent "+file.getPath());
        
        System.out.println("Folder isFolder "+folder.isDirectory());
        try {
            System.out.println("CannoicalPath "+file.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(FileDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("isExist "+file.exists());
    }
}
