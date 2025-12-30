/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author macbook
 */
public class ReadFileWithChannel {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch/chapter23/ReadFileWithChannel.java");
        System.out.println("Path "+path.getFileName());
        
        try(SeekableByteChannel channel = Files.newByteChannel(path))
        {
            ByteBuffer buffer = ByteBuffer.allocate(128);
            int count;
            do
            {
                count = channel.read(buffer);
                if(count != -1)
                {
                    buffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)buffer.get());
                    }
                }
            }while(count !=-1);
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Exeption "+e.getMessage());
        }
    }
}
