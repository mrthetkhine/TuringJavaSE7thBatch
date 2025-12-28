/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class DeserializationDemo {
    public static void main(String[] args) {
        Item item;
        
        String file = "item.obj";
        try(var oIn = new ObjectInputStream(new FileInputStream(file)))
        {
            try {
                item = (Item)( oIn.readObject());
                System.out.println("Item "+item);
            } catch (ClassNotFoundException ex) {
                System.out.println("Exception "+ex.getMessage());
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception "+e.getMessage());
        }
    }
}
