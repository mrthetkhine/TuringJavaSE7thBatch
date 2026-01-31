/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.prototype;

/**
 *
 * @author macbook
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        GameItem item1 = new GameItem(10,20,"Item 1");
        GameItem clone = (GameItem) item1.reproduce();
        
        System.out.println("Item1 "+item1);
        System.out.println("Clone "+clone);
        
        System.out.println("item1==clone "+(item1==clone));
                
    }
}
