/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter26;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author macbook
 */
public class ControlDemo extends SuperFrame implements ActionListener, ItemListener{
    ControlDemo()
    {
        super("Control demo");
    }
    Label label;
    CheckboxGroup ckGroup;
    Checkbox chkWindow,chkLinux, chkMac;
    Choice chFruit;
    List lstAnimal;
    
    Button btnShowSelectedItem;
    @Override
    void init() {
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        
        label = new Label("Hello");
        this.add(label);
        
        Label lblAnother = new Label("Two");
        this.add(lblAnother);
        
        Label lblThree = new Label("Three");
        this.add(lblThree);
        
        Button btnOk = new Button("Ok");
        btnOk.addActionListener(this);
        this.add(btnOk);
        
        Button btnCancel = new Button("Cancel");
        btnCancel.addActionListener((ae)->{
            System.out.println("Button cancel clicked");
        });
        this.add(btnCancel);
        
        
        this.ckGroup  = new CheckboxGroup();
        this.chkWindow = new Checkbox("Window",this.ckGroup,true);
        this.chkLinux = new Checkbox("Linux",this.ckGroup,false);
        this.chkMac = new Checkbox("Mac",this.ckGroup,false);
        
        this.chkWindow.addItemListener(this);
        this.chkLinux.addItemListener(this);
        this.chkMac.addItemListener(this);
        
        this.add(this.chkWindow);
        this.add(this.chkLinux);
        this.add(this.chkMac);
        
        this.chFruit = new Choice();
        this.chFruit.addItem("Apple");
        this.chFruit.addItem("Orange");
        this.chFruit.addItem("Banana");
        this.chFruit.addItem("Mango");
        
        this.chFruit.addItemListener(this);
        this.add(this.chFruit);
        
        this.lstAnimal = new List();
        this.lstAnimal.add("Bear");
        this.lstAnimal.add("Monkey");
        this.lstAnimal.add("Fish");
        this.lstAnimal.add("Snake");
        this.lstAnimal.add("Bird");
        
        this.lstAnimal.addItemListener(this);
        this.add(this.lstAnimal);
        
        this.btnShowSelectedItem =new Button("Show selected");
        this.btnShowSelectedItem.addActionListener(ae->{
            String item = this.lstAnimal.getSelectedItem();
            System.out.println("Selected item "+item);
        });
        this.add(this.btnShowSelectedItem);
    }
    public static void main(String[] args) {
        new ControlDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click event "+e.getActionCommand());
        this.label.setText(e.getActionCommand()+" button");
        System.out.println("Checkbox window state "+this.chkWindow.getState());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Item clicked "+e.getItem() + " status "+e.getStateChange());
    }
}
