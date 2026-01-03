/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter26;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;

/**
 *
 * @author macbook
 */
public class ControlDemo extends SuperFrame{
    ControlDemo()
    {
        super("Control demo");
    }

    @Override
    void init() {
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        
        Label label = new Label("Hello");
        this.add(label);
        
        Label lblAnother = new Label("Two");
        this.add(lblAnother);
        
        Label lblThree = new Label("Three");
        this.add(lblThree);
        
        Button btnOk = new Button("Ok");
        this.add(btnOk);
        
        Button btnCancel = new Button("Cancel");
        this.add(btnCancel);
    }
    public static void main(String[] args) {
        new ControlDemo();
    }
}
