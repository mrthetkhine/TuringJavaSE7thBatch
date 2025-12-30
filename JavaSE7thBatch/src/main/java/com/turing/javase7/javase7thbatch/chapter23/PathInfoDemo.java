/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class PathInfoDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/ReadFileWithChannel.java");
        
        System.out.println("FileName "+ path.getFileName());
        System.out.println("Abs path "+ path.toAbsolutePath());
        System.out.println("Parent "+ path.getParent());
        System.out.println("File exist "+Files.exists(path));
        try {
            System.out.println("is hidden "+Files.isHidden(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("is Directory "+Files.isDirectory(path));
        System.out.println("is Readble "+Files.isReadable(path));
    }
}
