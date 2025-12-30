/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter22;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class Item implements Serializable{
    String name;
    float price;
    int qty;
    
    Item(String name,float price,int qty)
    {
        this.name = name;
        this.price =price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
            
}
