/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.composite;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class ViewGroup implements UIWidget{
    String name;
    
    public ViewGroup(String name)
    {
        this.name = name;
    }
    ArrayList<UIWidget> children = new ArrayList<UIWidget>();

    void addChild(UIWidget widget)
    {
        this.children.add(widget);
    }
    @Override
    public void draw() {
        System.out.println("Draw viewGroup "+this.name);
        for (UIWidget child :this.children) {
            child.draw();
        }
    }
    
}
