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
import jdk.dynalink.StandardOperation;

/**
 *
 * @author macbook
 */
public class WriteFileWithChannel {
    public static void main(String[] args) {
        Path path = Path.of("./channel.txt");
        System.out.println("Path "+path.getFileName());
        
        try(SeekableByteChannel channel = Files.newByteChannel(path,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE))
        {
            ByteBuffer buffer = ByteBuffer.allocate(26);
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 26; i++) {
                    buffer.put((byte)('A'+i));
                }
                buffer.rewind();
                channel.write(buffer);
                buffer.rewind();
            }
            
            
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Exeption "+e.getMessage());
        }
    }
}
