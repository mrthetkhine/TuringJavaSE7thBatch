/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter23;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class DataOutDemo {
    public static void main(String[] args) {
        File file = new File("./item.data");
        try(var dOut = new DataOutputStream(new FileOutputStream(file))) {
            
            String itemName = "Apple";
            float price = 1.2F;
            int qty = 100;
            
            dOut.writeUTF(itemName);
            dOut.writeFloat(price);
            dOut.writeInt(qty);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
