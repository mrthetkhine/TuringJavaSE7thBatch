/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class MappedChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/ReadFileWithChannel.java");
        System.out.println("Path "+path.getFileName());
        
        try(FileChannel channel = (FileChannel)Files.newByteChannel(path))
        {
            long fSize = channel.size();
            MappedByteBuffer buffer =channel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)buffer.get());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Exeption "+e.getMessage());
        }
    }
}
