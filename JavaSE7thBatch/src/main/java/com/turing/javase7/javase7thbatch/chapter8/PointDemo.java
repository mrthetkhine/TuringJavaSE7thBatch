/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class TwoD
{
    private int x,y;
    
    public TwoD(int x , int y)
    {
        this.x = x;
        this.y = y;
        
        System.out.println("TwoD contructor ");
    }
    void print()
    {
        System.out.println("X "+this.x + " Y "+this.y);
    }
}
class ThreeD extends TwoD
{
    int z;
    ThreeD(int x , int y, int z)
    {
        super(x,y);
        this.z= z;
        System.out.println("Three D constructor");
    }
    void print()
    {
        super.print();
        //System.out.println("Access x "+this.x);
        System.out.println("Z "+z);
    }
}
public class PointDemo {
    public static void main(String[] args) {
        ThreeD threeD = new ThreeD(1,3,4);
        threeD.print();
    }
}
