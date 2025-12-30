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
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class MappedChannelWriteDemo {
    public static void main(String[] args) {
        Path path = Path.of("./channel2.txt");
        System.out.println("Path "+path.getFileName());
        
        try(FileChannel channel = (FileChannel)Files.newByteChannel(path,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE,
                StandardOpenOption.READ
                ))
        {
            
            MappedByteBuffer buffer =channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte)('a'+i));
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Exeption "+e.getMessage());
        }
    }
}
