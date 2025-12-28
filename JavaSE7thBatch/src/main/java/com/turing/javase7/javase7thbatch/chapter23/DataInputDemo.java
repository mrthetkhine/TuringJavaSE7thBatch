/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class DataInputDemo {
    public static void main(String[] args) {
        File file = new File("./item.data");
        try(var dIn = new DataInputStream(new FileInputStream(file))) {
            
            String itemName = dIn.readUTF();
            float price =dIn.readFloat();
            int qty = dIn.readInt();
            
            System.out.println("ItemName "+itemName);
            System.out.println("Price "+price);
            System.out.println("Qty "+qty);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
