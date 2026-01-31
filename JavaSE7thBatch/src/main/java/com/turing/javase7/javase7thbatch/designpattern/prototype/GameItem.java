/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class GameItem implements Prototype{
    int x, y;
    String itemName;
    
    public GameItem(int x,int y,String itemName)
    {
        this.x = x;
        this.y = y;
        this.itemName = itemName;
    }

    @Override
    public Prototype reproduce() {
        try {
            GameItem clone =(GameItem) (super.clone());
            return clone;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "GameItem{" + "x=" + x + ", y=" + y + ", itemName=" + itemName + '}';
    }
         
}
