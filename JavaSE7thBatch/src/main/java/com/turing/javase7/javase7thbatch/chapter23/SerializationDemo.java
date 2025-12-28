/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class SerializationDemo {
    public static void main(String[] args) {
        Item item =new Item("Apple",13.5F,200);
        
        String file = "item.obj";
        try(var oOut = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oOut.writeObject(item);
        }
        catch(IOException e)
        {
            System.out.println("Exception "+e.getMessage());
        }
    }
}
