/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author macbook
 */
public class ReadFileWithNioStream {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/ReadFileWithChannel.java");
        System.out.println("Path "+path.getFileName());
        
        try(InputStream stream = Files.newInputStream(path))
        {
            int data ;
            while( (data=stream.read())!=-1)
            {
                System.out.print((char)data);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Exeption "+e.getMessage());
        }
    }
}
