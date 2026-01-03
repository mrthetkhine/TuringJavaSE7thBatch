/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter26;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author macbook
 */
public class HelloWorldFrame extends Frame{
    
    HelloWorldFrame()
    {
        super("Hello World");
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Close click");
                System.exit(0);
            }
        });
        
        this.setVisible(true);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
    public void paint(Graphics g)
    {
        System.out.println("Paint");
        g.drawArc(100, 100, 1, 1, 0, 360);
        
        for (int degree = 0; degree < 360; degree++) {
            double r = 150 * ( (1-  Math.cos(  degree / Math.PI)) +  (3 *Math.sin(  degree* Math.PI)));
            int x =(int)( 300 + r * Math.cos( Math.toRadians(degree))) ;
            int y = (int)( 300 + r * Math.sin( Math.toRadians(degree))) ;
            
            g.drawArc(x, y, 1, 1, 0, 360);
        }
    }
    public static void main(String[] args) {
        HelloWorldFrame hf = new HelloWorldFrame();
        
        
    }
}
