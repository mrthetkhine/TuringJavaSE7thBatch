/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author macbook
 */
class OnlyExt implements FilenameFilter
{
    String ext;
    public OnlyExt(String ext)
    {
        this.ext = ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("."+this.ext);
    }
}
public class ListFile {
    static void listFile(File dir)
    {
        if(dir.isDirectory())
        {
            //File[] files = dir.listFiles();
            File[] files = dir.listFiles(new OnlyExt("java"));
            for(File file: files)
            {
                listFile(file);
            }
        }
        else
        {
            System.out.println("Name "+dir.getAbsolutePath());
        }
    }
            
    public static void main(String[] args) {
        //File folder = new File("./src/main/java/com/turing/javase7/javase7thbatch/chapter23");
        File folder = new File("./");
        /*
        File[] files = folder.listFiles();
        for(File file : files)
        {
            System.out.println("Name "+file.getAbsolutePath());
        }
        */
        listFile(folder);
        
    }
}
