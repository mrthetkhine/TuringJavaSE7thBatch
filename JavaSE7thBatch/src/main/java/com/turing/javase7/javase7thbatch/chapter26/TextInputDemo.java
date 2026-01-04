/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter26;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author macbook
 */
public class TextInputDemo extends SuperFrame{

    TextField txtItem,txtPassword;
    TextArea txtDescription;
    Button btnShow;
    @Override
    void init() {
        setLayout(new FlowLayout());
        this.add(new Label("Item Name"));
        
        this.txtItem = new TextField(20);
        this.add(this.txtItem);
        
        this.add(new Label("Password"));
        this.txtPassword = new TextField(20);
        this.txtPassword.setEchoChar('*');
        this.add(this.txtPassword);
        
        this.btnShow = new Button("Show");
        this.add(this.btnShow);
        this.btnShow.addActionListener(ae->{
            JOptionPane.showMessageDialog(this, "Item name is "+this.txtItem.getText() +" password "+this.txtPassword.getText());
        });
        
        this.add(new Label("Description"));
        this.txtDescription = new TextArea(10,20);
        this.add(txtDescription);
                
    }
    public static void main(String[] args) {
        new TextInputDemo();
    }
}
