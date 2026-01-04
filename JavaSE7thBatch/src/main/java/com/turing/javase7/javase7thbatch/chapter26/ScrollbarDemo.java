/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter26;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;

/**
 *
 * @author macbook
 */
public class ScrollbarDemo extends SuperFrame{
    Scrollbar sbVertical,sbHorizontal;
    Label lblVertical,lblHorizontal;
    
     Scrollbar sbRed,sbGreen,sbBlue;
    public ScrollbarDemo()
    {
        super("Scrollbar demo");
    }
    @Override
    void init() {
        setLayout(new FlowLayout());
        this.sbVertical = new Scrollbar(Scrollbar.VERTICAL,100,1,0,200);
        this.sbVertical.setPreferredSize(new Dimension(20,100));
        
        this.sbHorizontal = new Scrollbar(Scrollbar.HORIZONTAL,50,1,0,100);
        this.sbHorizontal.setPreferredSize(new Dimension(100,20));
        
        this.add(this.sbVertical);
        this.add(this.sbHorizontal);
        
        this.lblHorizontal = new Label("Horizontal");
        this.add(this.lblHorizontal);
        
        this.lblVertical = new Label("Vertical");
        this.add(this.lblVertical);
        
        this.sbHorizontal.addAdjustmentListener((ae)->{
            this.lblHorizontal.setText("H "+ ae.getValue());
        });
        this.sbVertical.addAdjustmentListener((ae)->{
            this.lblVertical.setText("V "+ ae.getValue());
        });
        
        this.add(new Label("Red"));
        this.sbRed = new Scrollbar(Scrollbar.HORIZONTAL,50,1,0,255);
        this.add(this.sbRed);
        
        this.add(new Label("Green"));
        this.sbGreen = new Scrollbar(Scrollbar.HORIZONTAL,50,1,0,255);
        this.add(this.sbGreen);
                
        this.add(new Label("Blue"));
        this.sbBlue = new Scrollbar(Scrollbar.HORIZONTAL,50,1,0,255);
        this.add(this.sbBlue);
        
        this.sbRed.addAdjustmentListener(ae->{
            this.repaint();
        });
        this.sbGreen.addAdjustmentListener(ae->{
            this.repaint();
        });
        this.sbBlue.addAdjustmentListener(ae->{
            this.repaint();
        });
    }
    @Override
    public void paint(Graphics g)
    {
        Color color = new Color(this.sbRed.getValue(),this.sbGreen.getValue(),this.sbBlue.getValue());
        g.setColor(color);
        
        g.fillRect(400, 200, 50, 50);
    }
    public static void main(String[] args) {
        new ScrollbarDemo();
    }
}
