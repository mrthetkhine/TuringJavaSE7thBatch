/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class MyFileVisitor extends SimpleFileVisitor<Path>
{
    public FileVisitResult visitFile(Path path, BasicFileAttributes fab)
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class WalkDirectory {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch");
        try {
            Files.walkFileTree(path, new MyFileVisitor());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
