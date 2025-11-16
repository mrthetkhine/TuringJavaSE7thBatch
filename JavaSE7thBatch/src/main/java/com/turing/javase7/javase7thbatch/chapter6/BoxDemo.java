/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Box
{
    int width;
    int height;
    int depth;
    
    
    public Box()//No Argument Constructor
    {
        System.out.println("Box () constructor run");
    }
    
    //Parameterized Constructors
    public Box(int width, int h, int d)
    {
        this.width = width;
        this.height = h;
        this.depth = d;
        System.out.println("Constructor Box(w,h,d) run");
    }
    int showVolume()
    {
        int volume = this.width * this.height * depth;
        System.out.println("Volume "+volume);
        return volume;
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10,2,3);  
        Box b2 = new Box(5,2,4);
      
        Box b3 = new Box();
        
        int v1 = b1.showVolume();
        System.out.println("Volume in main "+v1);
        
        b2.showVolume();
      
        String str = "Hello";
        System.out.println("Str "+str.toUpperCase());
        
     
    }
}
